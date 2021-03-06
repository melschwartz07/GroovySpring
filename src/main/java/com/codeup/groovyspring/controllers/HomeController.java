package com.codeup.groovyspring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String welcome(){
        return "home";
    }

    @PostMapping("/")
    public String returnCohort(@RequestParam(name = "cohort") String cohort, Model model){
        model.addAttribute("cohort", cohort);
        return "home";
    }
}
