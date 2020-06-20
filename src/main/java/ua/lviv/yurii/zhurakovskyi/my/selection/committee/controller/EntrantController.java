package ua.lviv.yurii.zhurakovskyi.my.selection.committee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.ApplicationInfoService;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.UserService;

import java.security.Principal;

@Controller
public class EntrantController {
    @Autowired
    private ApplicationInfoService applicationInfoService;
    @Autowired
    private UserService userService;

    @RequestMapping("/showAllEntrants")
    public String welcome(Model model, Principal principal) {
        model.addAttribute("entrants", applicationInfoService.getAllApplicationInfos());
        System.out.println(applicationInfoService.getAllApplicationInfos());
        model.addAttribute("user", userService.findUserByEmail(principal.getName()));
        return "showAllEntrants";
    }
}
