package com.lagou.edu.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * \* @Author: ZhuFangTao
 * \* @Date: 2020/5/19 10:31 上午
 * \
 */
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!checkRequest(request)) {
            response.sendRedirect("/user/login");
            return false;
        } else {
            return true;
        }
    }

    private boolean checkRequest(HttpServletRequest request) {
        HttpSession session = request.getSession();
        return request.getRequestURI().contains("/user/")
                || session.getAttribute("user") != null;
    }
}