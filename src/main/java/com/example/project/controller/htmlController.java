package com.example.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class htmlController {

    @RequestMapping("/testindex")
    public String home(){
        return "home";
    }
}
