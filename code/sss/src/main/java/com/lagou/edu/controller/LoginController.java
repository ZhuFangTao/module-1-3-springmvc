package com.lagou.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * \* @Author: ZhuFangTao
 * \* @Date: 2020/5/19 10:27 上午
 * \
 */
@RequestMapping("/user")
@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String userLogin() {
        return "login";
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    @ResponseBody
    public String check(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        if ("admin".equals(userName) && "admin".equals(password)) {
            request.getSession().setAttribute("user", userName);
            return "login success";
        }else{
            return "login failed";
        }
    }
}