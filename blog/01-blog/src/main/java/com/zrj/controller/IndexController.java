package com.zrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class IndexController {
    @GetMapping("/index")
    public String index() {
/*        int i = 10/0;
        String blog = null;
        if(blog == null){
            throw new NotFoundException("博客没有找到");
        }
        System.out.println("--------index-------");*/
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }
}
