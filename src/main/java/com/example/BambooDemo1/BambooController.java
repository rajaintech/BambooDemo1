package com.example.BambooDemo1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BambooController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Bamboo...";
    }

    @RequestMapping("/")
    public String getBamboo(){
        return "Bamboo url...";
    }

}
