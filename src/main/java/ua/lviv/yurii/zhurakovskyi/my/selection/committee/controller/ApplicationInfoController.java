package ua.lviv.yurii.zhurakovskyi.my.selection.committee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ApplicationInfo;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Faculty;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.User;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.ApplicationInfoDTOHelper;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.ApplicationInfoService;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.FacultyService;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.UserService;

import java.io.IOException;
import java.security.Principal;

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
    public String applyEntrant(@RequestParam MultipartFile image,
                               @RequestParam String firstName,
                               @RequestParam String lastName,
                               @RequestParam Integer age,
                               @RequestParam Integer score,
                               @RequestParam String schoolName,
                               @PathVariable(name = "facultyId") Integer facultyId) throws IOException {
        Faculty faculty = facultyService.find(facultyId).get();
        faculty.setNumberOfStudents(faculty.getNumberOfStudents() - 1);
        facultyService.updateNumberOfStudents(faculty);
        ApplicationInfo applicationInfo = ApplicationInfoDTOHelper.createEntity(image, firstName, lastName, age, score, schoolName, faculty);
        applicationInfoService.save(applicationInfo);
        return "redirect:/home";
    }
}
