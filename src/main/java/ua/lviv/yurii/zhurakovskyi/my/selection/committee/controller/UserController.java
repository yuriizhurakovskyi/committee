package ua.lviv.yurii.zhurakovskyi.my.selection.committee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.User;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.FacultyService;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl.UserServiceImpl;

@Controller
public class UserController {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private FacultyService facultyService;

    @PostMapping("/register")
    public String loginCombination(@RequestParam("username") String username,
                                   @RequestParam("password") String password) {
        System.out.println(username);
        System.out.println(password);
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        userService.save(user);
        return "login";
    }

    @PostMapping("/successURL")
    public String successURL(Model model) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        if (username.equals("admin")) {
            model.addAttribute("userLogged", "ADMIN logged");
        } else {
            User userLogged = (User) userService.loadUserByUsername(username);
            System.out.println(userLogged.getUsername());
            System.out.println(userLogged.getPassword());
            model.addAttribute("userLogged", userLogged.getUsername());
        }
        return "home";
    }

    @GetMapping("/home")
    public ModelAndView welcome(Model model) {
        System.out.println("Hello from home!!");
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("faculties", facultyService.getAllFaculties());
        System.out.println(facultyService.getAllFaculties());
        return modelAndView;
    }

    @GetMapping("/apply")
    public String applyEntrant(Model model) {
        return "home";
    }
}
