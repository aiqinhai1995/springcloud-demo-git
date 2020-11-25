package com.aiqinhai.demo.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class DemoInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("prehandle");
        return true;
    }

    public void postHandle(WebRequest request, ModelMap model) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                @Nullable Exception ex) throws Exception {
        if(request.getMethod().equalsIgnoreCase("OPTIONS")) {
            return;
        }
        System.out.println(request.getRequestURI().toString());
        if(request.getRequestURI().equals("/demo-business/interceptordemo")) {
            try{
                String result = (String)request.getAttribute("grade");
                System.out.println("拦截到controller的返回值！！！");
            }catch(Exception e) {
                System.out.println("出错了 !!!");
            }
        }
    }
}
