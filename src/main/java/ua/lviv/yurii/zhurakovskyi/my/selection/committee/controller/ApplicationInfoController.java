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
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl.AplicationInfoServiceImpl;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl.FacultyServiceImpl;

@Controller
public class ApplicationInfoController {
	@Autowired
	private AplicationInfoServiceImpl applicationInfoService;
	@Autowired
	private FacultyServiceImpl facultyService;

	@GetMapping("/apply/{facultyId}")
	public String applyEntrant(Model model, @PathVariable(name = "facultyId") Integer facultyId) {
		model.addAttribute("applicationInfo", new ApplicationInfo());
		return "apply";
	}

	@PostMapping("/apply/{facultyId}")
	public String applyEntrant(@ModelAttribute ApplicationInfo applicationInfo, BindingResult bindingResult) {
		return "apply";
	}
}
