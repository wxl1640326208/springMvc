package com.swpu.SpringMvc;

import com.swpu.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/annotation")
@SessionAttributes(value = {"msg"})
public class AnnotationController {

    /**
     * @requestParam注解
     * @param name
     * @return
     */
    @RequestMapping("/requestParam")
    public String testRequestParam(@RequestParam(name = "username") String name){
        System.out.println("执行了");
        System.out.println(name);
        return "success";
    }

    /**
     * 得到参数体 RequestBody注解
     * @param body
     * @return
     */
    @RequestMapping("/requestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("执行了");
        System.out.println(body);
        return "success";
    }

    /**
     * @PathVariable
     * @param id
     * @return
     */
    @RequestMapping("/PathVariable/{id}")
    public String testPathVariable(@PathVariable(name = "id") String id){
        System.out.println("action");
        System.out.println(id);
        return "success";
    }

    /**
     * @RequestHeader  得到消息头
     * @param header
     * @return
     */
    @RequestMapping("/requestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept")String header){
        System.out.println("action");
        System.out.println(header);
        return "success";
    }

    /**
     * @CookieValue 得到Cookie的值
     * @param cookieValue
     * @return
     */
    @RequestMapping("/CookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID")String cookieValue){
        System.out.println("action");
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * 方法在控制器之前执行
     * @param user
     * @return
     */
    @RequestMapping(value = "/ModelAttribute")
    public String testModelAttribute(@ModelAttribute("a") User user){
        System.out.println("action");
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public void beforeTest(String username , Map<String,User> map){
        System.out.println("beforeTest执行了");
        User user = new User();
        user.setBirthday(new Date());
        user.setAge(20);
        user.setUsername(username);
        map.put("a",user);
    }

    /**
     * 方法之间参数共享 把值传入session
     * @param model
     * @return
     */
    @RequestMapping(value = "/SessionAttribute")
    public String testSessionAttribute(Model model){
        System.out.println("action");
        model.addAttribute("msg","wangxulong");
        return "success";
    }

    /**
     * 得到session中的值
     * @param modelMap
     */
    @RequestMapping("/GetSessionValue")
    public String testGetValue(ModelMap modelMap){
        System.out.println("action");
        System.out.println(modelMap.get("msg"));
        return "success";
    }

    /**
     * 删除session中的值
     * @param status
     * @return
     */
    @RequestMapping("/DeleteSessionValue")
    public String testDelete(SessionStatus status){
        status.setComplete();
        return "success";
    }

}
