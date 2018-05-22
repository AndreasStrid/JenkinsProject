package com.deploy.jenkins.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Comment
@RequestMapping("/helloController")
@RestController
public class HelloController {

    public HelloController(){

    }
    @RequestMapping("/test")
    public String test(){
        return " I Like Cats :)";
    }
}
