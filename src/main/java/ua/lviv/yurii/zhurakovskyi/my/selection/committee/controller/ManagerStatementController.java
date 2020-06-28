package ua.lviv.yurii.zhurakovskyi.my.selection.committee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ApplicationInfo;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ManagerStatement;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl.ApplicationInfoService;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl.ManagerStatementService;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl.UserService;

import java.security.Principal;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

@Controller
public class ManagerStatementController {
    @Autowired
    private ApplicationInfoService applicationInfoService;
    @Autowired
    private ManagerStatementService managerStatementService;
    @Autowired
    private UserService userService;

    @GetMapping("/statement/{entrantId}")
    public String addToStatement(Model model, @PathVariable(name = "entrantId") Integer entrantId) {
        ApplicationInfo applicationInfo = applicationInfoService.find(entrantId);
        ManagerStatement managerStatement = new ManagerStatement();
        managerStatement.setFaculty(applicationInfo.getFaculty());
        managerStatement.setName(applicationInfo.getFirstName() + " " + applicationInfo.getLastName());
        managerStatement.setScore(applicationInfo.getScore());
        managerStatementService.save(managerStatement);
        model.addAttribute("managerStatements", managerStatementService.getAllManagerStatements());
        applicationInfoService.delete(applicationInfo.getId());
        return "redirect:/showAllEntrants";
    }

    @GetMapping("/showStatements")
    public String showStatements(Model model, Principal principal) {
        model.addAttribute("user", userService.findUserByEmail(principal.getName()));
        Set<ManagerStatement> managerStatements = new TreeSet<>(Comparator.comparing(ManagerStatement::getFacultyName)
                .thenComparing(ManagerStatement::getScore)).descendingSet();
        managerStatements.addAll(managerStatementService.getAllManagerStatements());
        model.addAttribute("statements", managerStatements);
        Set<ManagerStatement> successfulStatements = new TreeSet<>(Comparator.comparing(ManagerStatement::getFacultyName)
                .thenComparing(ManagerStatement::getScore)).descendingSet();
        successfulStatements.addAll(managerStatementService.findSuccessStatements());
        model.addAttribute("successful_statements", successfulStatements);
        return "showStatements";
    }
}
