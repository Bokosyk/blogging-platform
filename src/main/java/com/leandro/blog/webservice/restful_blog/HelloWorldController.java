package com.leandro.blog.webservice.restful_blog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Use RESTFUL API
public class HelloWorldController {

    @GetMapping(path = "/hello-world") // Map the method to a request method GET
    public String helloWorld() {
        return "Hello World!";
    }
    @GetMapping(path = "/hello-world-bean") // Map the method to a request method GET
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World!");
    }
}
