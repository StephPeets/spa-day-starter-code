package org.launchcode.spaday.controllers;


import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

	private Model model;
	private User user;
	private String verify;

	@GetMapping("add")
	public String displayAddUserForm(){
		return "/user/add";
	}

	@PostMapping
	public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
		model.addAttribute(user);
		return "/user/index";
	}





}
