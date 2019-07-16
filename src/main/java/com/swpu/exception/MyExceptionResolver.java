package com.swpu.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理器
 */
public class MyExceptionResolver implements HandlerExceptionResolver {
    /**
     * 异常处理器逻辑
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        System.out.println("异常处理器执行了");
        MyException myException = null;
        if (e instanceof MyException ){
            myException = (MyException)e;
        }
        else {
            myException = new MyException("系统正在维护");
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg",myException.getMsg());
        mv.setViewName("error");
        return mv;
    }
}
