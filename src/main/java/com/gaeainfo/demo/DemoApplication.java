package com.gaeainfo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(scanBasePackages = "com.gaeainfo")
public class DemoApplication {
    @RequestMapping(name = "HelloService", method = RequestMethod.GET, path = "/hello")
    public String hello() {
        System.out.println("hello");
        return "hello";
    }

    @RequestMapping(name = "SendService", method = RequestMethod.GET, path = "/send")
    public String send() {
        System.out.println("send");
        return "22222222222";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
