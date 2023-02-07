package com.example.demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyongqiang
 * @creat 2023-02-2023/2/7 10:27
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/world")
    public String helloWorld() {
        return "Hello World!";
    }
}
