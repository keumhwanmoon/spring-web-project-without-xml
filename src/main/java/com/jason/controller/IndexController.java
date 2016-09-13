package com.jason.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Jason on 2016-09-14.
 */
@Controller
public class IndexController {

    @RequestMapping
    @ResponseBody
    public String hello() {
        return "Hello, world!";
    }

}
