package com.tomact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Hello {
    
    @GetMapping("/greet")
    public String greet() {

        return "Greetings from Hello!"+ " Welcome to Spring Boot." + " This is a simple RESTful web service."+ " Enjoy coding!"+ " Have a great day!";

    }
}
