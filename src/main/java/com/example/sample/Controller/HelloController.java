package com.example.sample.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @RequestMapping("/sayHi")
    public  void  sayHi() throws Exception {
        System.out.println("hello world !");

    }
}
