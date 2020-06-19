package ua.lviv.yurii.zhurakovskyi.my.selection.committee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Faculty;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl.FacultyServiceImpl;

@Controller
public class FacultyController {
    private final FacultyServiceImpl facultyService;

    @Autowired
    public FacultyController(FacultyServiceImpl facultyService) {
        this.facultyService = facultyService;
    }
    
    @GetMapping("/createFaculty")
    public ModelAndView createFaculty() {
        return new ModelAndView("createFaculty", "faculty", new Faculty());
    }

    @PostMapping("/createFaculty")
    public String createFaculty(@ModelAttribute("faculty") Faculty faculty, BindingResult bindingResult) {
        facultyService.save(faculty);
		return "redirect:/home";
    }
}
