package com.example.demospringboot.controller;

import com.example.demospringboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

        @RequestMapping("/hello")
        public String index() {
            return helloService.getHello();
        }
    }