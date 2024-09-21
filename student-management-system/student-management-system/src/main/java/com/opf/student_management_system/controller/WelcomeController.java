package com.opf.student_management_system.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/company")
public class WelcomeController {

    @GetMapping("/hello")
    public String sayHello(Model model) {

        model.addAttribute("theDate", java.time.LocalDateTime.now());
        return "helloworld";
    }
}
