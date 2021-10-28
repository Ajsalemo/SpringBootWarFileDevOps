package com.devops.springbootwarfile.Controllers;

import javax.annotation.Generated;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "SpringBootWarFileDevOps - HomeController";

    @GetMapping("/")
    public String home() {
        return message;
    }
}
