package ua.lviv.yurii.zhurakovskyi.my.selection.committee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Faculty;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.User;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl.FacultyService;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl.UserService;

import java.security.Principal;

@Controller
public class FacultyController {
    @Autowired
    private FacultyService facultyService;
    @Autowired
    private UserService userService;

    @GetMapping("/createFaculty")
    public String createFaculty(Model model, Principal principal) {
        model.addAttribute("faculty", new Faculty());
        User user = userService.findUserByEmail(principal.getName());
        model.addAttribute("user", user);
        return "/createFaculty";
    }

    @PostMapping("/createFaculty")
    public String createFaculty(@ModelAttribute("faculty") Faculty faculty, BindingResult bindingResult) {
        facultyService.save(faculty);
        return "redirect:/home";
    }
}
