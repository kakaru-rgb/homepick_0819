package com.onrender.homepick_0819.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController{

    @GetMapping("/")
    public String index(){
        return "index"; // templates/index.html 매핑
    }
}
