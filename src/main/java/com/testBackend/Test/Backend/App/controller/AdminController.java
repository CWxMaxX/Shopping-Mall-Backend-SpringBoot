package com.testBackend.Test.Backend.App.controller;

import com.testBackend.Test.Backend.App.entity.Admin;
import com.testBackend.Test.Backend.App.repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    @Autowired
    private AdminRepo adminRepo;

    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("admin", new Admin());

        
        return "signup_form";
    }
    @PostMapping("/process_register")
    public String processRegister(Admin admin) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(admin.getPassword());
        admin.setPassword(encodedPassword);

        adminRepo.save(admin);

        return "register_success";
    }
}
