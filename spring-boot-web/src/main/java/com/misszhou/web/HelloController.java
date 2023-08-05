package com.misszhou.web;

import com.misszhou.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Locale locale, Model model) {
        return "Hello World";
    }

    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setUserName("小明");
        user.setPassWord("xxxx");
        return user;
    }

}
