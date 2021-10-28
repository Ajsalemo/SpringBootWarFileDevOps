package com.devops.springbootwarfile.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "SpringBootWarFileDevops - HomeController";

    @GetMapping("/")
    public String home() {
        return message;
    }
}
