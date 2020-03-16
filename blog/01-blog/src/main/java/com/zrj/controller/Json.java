package com.zrj.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

class User1 {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

@Controller
public class Json {

    //返回JSon格式的数据
    @ResponseBody
    @RequestMapping("/test")
    public User1 test() {
        User1 user = new User1();
        user.setId(1);
        user.setName("zs");
        return user;
    }
}
