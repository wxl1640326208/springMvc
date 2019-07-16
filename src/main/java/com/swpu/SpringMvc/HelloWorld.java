package com.swpu.SpringMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class HelloWorld {
    @RequestMapping(path = "/helloworld")
    public String hello(){
        System.out.println("hello");
        return "success";
    }

    /**
     * 测试RequestMapping
     * @return
     */
    @RequestMapping(path = "/RequestMappingTest")
    public String RequestMappingTest(){
        System.out.println("RequestMappingTest注解");
        return "success";
    }
}
