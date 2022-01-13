package com.samgyngobr.scarlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class IndexController
{
    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("message", "Hello World!");

        return "index";
    }

}
