package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.Email.model.Email;

@Controller
public class EmailController {

    @GetMapping("/email")
    public String showEmailForm(Model model) {
        model.addAttribute("email", new Email());
        return "email";
    }

    @PostMapping("/checkEmail")
    public String checkEmailValidity(@ModelAttribute Email email, Model model) {
        model.addAttribute("emailAddress", email.getEmailAddress());
        model.addAttribute("isValid", email.isValid());
        return "emailresult";
    }
}
