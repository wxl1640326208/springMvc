package com.swpu.SpringMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Interceptor")
public class InterceptorTest {

    @RequestMapping("InterceptorTest")
    public String interceptorTest(){
        System.out.println("interceptorTest执行了");
        return "success";
    }
}
