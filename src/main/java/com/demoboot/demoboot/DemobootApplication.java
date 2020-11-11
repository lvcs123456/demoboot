package com.demoboot.demoboot;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("/testcon")
@Controller
public class DemobootApplication {


    @RequestMapping("/testcon")
    @JsonView
    public String test1(){
        System.out.println(1111);
        return "test.html";
    }


    public static void main(String[]
                                    args) {
        SpringApplication.run(DemobootApplication.class, args);
    }

}
