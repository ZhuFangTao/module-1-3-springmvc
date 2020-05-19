package com.lagou.demo.service.impl;

import com.lagou.demo.service.IDemoService;
import com.lagou.edu.mvcframework.annotations.LagouService;

@LagouService("demoService")
public class DemoServiceImpl implements IDemoService {
    @Override
    public String get(String name) {
        return "hello " + name + " invoke success.";
    }
}
