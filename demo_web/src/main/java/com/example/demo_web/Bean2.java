package com.example.demo_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

public class Bean2 {
    @Autowired
    private Bean1 bean1;

    public String getBean() {
        return bean1.getBookAuthor();
    }
}
