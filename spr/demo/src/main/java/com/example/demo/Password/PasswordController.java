package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.Password.model.Password;

@Controller
public class PasswordController {

    @GetMapping("/password")
    public String showPasswordForm(Model model) {
        model.addAttribute("password", new Password());
        return "password";
    }

    @PostMapping("/checkPassword")
    public String checkPasswordStrength(@ModelAttribute Password password, Model model) {
        model.addAttribute("passwordStrength", password.getPasswordStrength());
        return "result";
    }
}
