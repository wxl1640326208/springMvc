package com.swpu.SpringMvc;

import com.sun.deploy.net.HttpResponse;
import com.swpu.domain.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/response")
public class ResponseTest {
    /**
     * 响应返回字符串
     * @param model
     * @return
     */
    @RequestMapping("/String")
    public String stringTest(Model model){
        User user = new User();
        user.setUsername("wang");
        model.addAttribute("user",user);
        return "success";
    }

    /**
     * 响应void
     * @param request
     * @param response
     */
    @RequestMapping("ResponseVoid")
    public void voidTest(HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("voidTest执行了");
        //请求转发
        //  request.getRequestDispatcher("/WEB-INF/views/success.jsp").forward(request,response);

        //重定向
        //response.sendRedirect(request.getContextPath()+"/annotation.jsp");

        //直接响应
        response.getWriter().print("hello");

    }

    /**
     * ModelAndView运用存数加载view
     * @return
     */
    @RequestMapping("/ModelAndView")
    public ModelAndView modelAndViewTest(){
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setUsername("wang");
        user.setAge(14);
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/ForwardAndRedirect")
    public String ForwardAndRedirectTest(){
        System.out.println("ForwardAndRedirectTest执行了");
        // return "forward:/WEB-INF/views/success.jsp";
        return "redirect:/annotation.jsp";
    }

}
