package com.practice.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/main")
    public String main() {
        return "home";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }
}
