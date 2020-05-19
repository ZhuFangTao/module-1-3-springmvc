package com.lagou.edu.mvcframework.annotations;

import java.lang.annotation.*;

/**
 * \* @Author: ZhuFangTao
 * \* @Date: 2020/5/18 7:17 下午
 * \
 */
@Documented
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Security {

    String[] values();
}
