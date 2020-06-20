package ua.lviv.yurii.zhurakovskyi.my.selection.committee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ApplicationInfo;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Faculty;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.User;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.ApplicationInfoService;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.FacultyService;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.UserService;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl.AplicationInfoServiceImpl;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl.FacultyServiceImpl;

import java.security.Principal;
import java.util.Optional;

@Controller
public class ApplicationInfoController {
    @Autowired
    private ApplicationInfoService applicationInfoService;
    @Autowired
    private FacultyService facultyService;
    @Autowired
    private UserService userService;

    @GetMapping("/apply/{facultyId}")
    public String applyEntrant(Model model, @PathVariable(name = "facultyId") Integer facultyId, Principal principal) {
        User userByName = userService.findUserByEmail(principal.getName());
        Faculty faculty = facultyService.find(facultyId).get();
        model.addAttribute("applicationInfo", new ApplicationInfo());
        model.addAttribute("faculty", faculty);
        model.addAttribute("user", userByName);
        return "/apply";
    }

    @PostMapping("/apply/{facultyId}")
    public String applyEntrant(@ModelAttribute ApplicationInfo applicationInfo, BindingResult bindingResult, @PathVariable(name = "facultyId") Integer facultyId, Principal principal) {
        Faculty faculty = facultyService.find(facultyId).get();
        faculty.setNumberOfStudents(faculty.getNumberOfStudents() - 1);
        facultyService.updateNumberOfStudents(faculty);
        applicationInfo.setFaculty(faculty);
        applicationInfoService.save(applicationInfo);
        return "redirect:/home";
    }
}
