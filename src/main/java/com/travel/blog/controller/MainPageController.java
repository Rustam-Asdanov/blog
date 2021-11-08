package com.travel.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main_page")
public class MainPageController {

    @GetMapping
    public String getPage(){

        return "/main_page/main";
    }
}
