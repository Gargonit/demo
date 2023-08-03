package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/allProduct")
public class allProductController {
    @GetMapping
    public String addProduct() {
        return "addProduct";
    }
}
