package org.tutorials.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.tutorials.springbootthymeleaf.model.UserForm;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {

    // handle method to handle user registration page request
    @GetMapping("/register")
    public String userRegistrationPage(Model model) {
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);
        List<String> listProfession = Arrays.asList("Student", "Teacher", "Doctor", "Engineer");
        model.addAttribute("listProfession", listProfession);
        return "register-form";
    }

    // handle method to handle user registration form submission request
    @PostMapping("/register/save")
    public String userRegistrationForm(Model model, @ModelAttribute("userForm") UserForm userForm) {
        model.addAttribute("userForm", userForm);
        return "register-success";
    }
}