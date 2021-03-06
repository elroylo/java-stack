package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframwork.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
// 1. Annotation
@RestController
public class DemoApplication {
        public static void main(String[] args) {
                SpringApplication.run(DemoApplication.class, args);
        }
        
        // 1. Annotation
        @RequestMapping("/")
        // 3. Method that maps to the request route above
        public String hello() { // 3
                return "Hello World!";
        }
}