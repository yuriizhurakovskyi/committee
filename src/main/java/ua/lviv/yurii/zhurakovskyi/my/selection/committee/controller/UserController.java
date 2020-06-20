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
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.UserService;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl.UserServiceImpl;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class UserController {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserService userService;
    @Autowired
    private FacultyService facultyService;

    @GetMapping("/register")
    public String loginCombination() {
        return "register";
    }

    @PostMapping("/register")
    public String loginCombination(@RequestParam("first_name") String first_name,
                                   @RequestParam("last_name") String last_name,
                                   @RequestParam("user_password") String user_password,
                                   @RequestParam("confirm_password") String confirm_password,
                                   @RequestParam("email") String email,
                                   @RequestParam("age") String age) {
        if (user_password.equals(confirm_password)) {
            User user = new User();
            user.setFirstName(first_name);
            user.setLastName(last_name);
            user.setEmail(email);
            user.setPassword(passwordEncoder.encode(user_password));
            user.setAge(Integer.parseInt(age));
            userService.save(user);
        }
        return "login";
    }

    @PostMapping("/successURL")
    public String successURL(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        if (username.equals("admin")) {
            model.addAttribute("userLogged", "ADMIN logged");
        } else {
            User userLogged = (User) userService.findUserByEmail(username);
            model.addAttribute("userLogged", userLogged.getUsername());
        }
        return "home";
    }

    @GetMapping("/home")
    public ModelAndView welcome(Principal principal) {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("faculties", facultyService.getAllFaculties());
        System.out.println(facultyService.getAllFaculties());
        modelAndView.addObject("userLogged", userService.findUserByEmail(principal.getName()).getUsername());
        return modelAndView;
    }
}
