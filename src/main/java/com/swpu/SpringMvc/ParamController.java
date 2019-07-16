package com.swpu.SpringMvc;

import com.swpu.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/param")
public class ParamController {
    @RequestMapping("/testParam")
    public  String testParam(String username,String password){
        System.out.println("执行。。");
        System.out.println("username:"+username);
        System.out.println("password"+password);
        return "success";
    }

    /**
     * 请求参数绑定实体类型
     * @param account
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println(account);
        return "success";
    }
}
