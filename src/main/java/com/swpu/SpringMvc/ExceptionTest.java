package com.swpu.SpringMvc;

import com.swpu.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ExceptionTest")
public class ExceptionTest {
    @RequestMapping("/ThrowsTest")
    public String throwTest()throws MyException{
        System.out.println("执行了");
        try {
            int i = 10/0;
        } catch (Exception e) {
            e.printStackTrace();//打印异常信息
            throw new MyException("系统错误了，请联系管理员");
        }
        return "success";
    }
}
