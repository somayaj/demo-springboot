package com.example.demospringboot.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getHello()
    {
        return "<html><head></head><body>hello world</body></html>";
    }
}
