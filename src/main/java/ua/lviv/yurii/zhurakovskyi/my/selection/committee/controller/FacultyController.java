package ua.lviv.yurii.zhurakovskyi.my.selection.committee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Faculty;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.User;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.FacultyService;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.UserService;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl.FacultyServiceImpl;

import java.security.Principal;

@Controller
public class FacultyController {
    @Autowired
    private FacultyService facultyService;

    @GetMapping("/createFaculty")
    public String createFaculty(Model model, Principal principal) {
        model.addAttribute("faculty", new Faculty());
        model.addAttribute("userLogged", principal.getName());
        return "/createFaculty";
    }

    @PostMapping("/createFaculty")
    public String createFaculty(@ModelAttribute("faculty") Faculty faculty, BindingResult bindingResult) {
        facultyService.save(faculty);
        return "redirect:/home";
    }
}
