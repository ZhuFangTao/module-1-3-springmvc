package com.lagou.demo.controller;

import com.lagou.demo.service.IDemoService;
import com.lagou.edu.mvcframework.annotations.LagouAutowired;
import com.lagou.edu.mvcframework.annotations.LagouController;
import com.lagou.edu.mvcframework.annotations.LagouRequestMapping;
import com.lagou.edu.mvcframework.annotations.Security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@LagouController
@LagouRequestMapping("/demo")
@Security(values = {"ls"})
public class DemoController {


    @LagouAutowired
    private IDemoService demoService;


    /**
     * URL: /demo/query?name=lisi
     *
     * @param request
     * @param response
     * @param name
     * @return
     */
    @LagouRequestMapping("/query")
    @Security(values = {"zs","ls"})
    public void query(HttpServletRequest request,
                      HttpServletResponse response,
                      String name) throws IOException {
        response.getWriter().write(demoService.get(name));
    }

    @LagouRequestMapping("/query01")
    public void query01(HttpServletRequest request,
                      HttpServletResponse response,
                      String name) throws IOException {
        response.getWriter().write(demoService.get(name));
    }
}
