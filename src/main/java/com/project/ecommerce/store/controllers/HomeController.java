package com.project.ecommerce.store.controllers;


import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SecurityRequirement(name="scheme1")
@RequestMapping("/test")
public class HomeController {
    @GetMapping
    public String testing() {
        return "Welcome to electronic store";
    }
}
