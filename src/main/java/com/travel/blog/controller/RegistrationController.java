package com.travel.blog.controller;

import com.travel.blog.model.NewUser;
import com.travel.blog.service.NewUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    private NewUserService newUserService;

    public RegistrationController(NewUserService newUserService) {
        this.newUserService = newUserService;
    }

    @GetMapping
    public String getPage(Model model){

        model.addAttribute("user_reg",new NewUser());

        return "/registration_page/main";
    }

    @PostMapping("/add")
    public String createUser(
            @ModelAttribute(name = "user_reg")NewUser newUser
            ){

        newUserService.addUser(newUser);

        return "redirect:/main_page";
    }
}
