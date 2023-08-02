package com.example.springbootmvc.web;



import com.example.springbootmvc.domain.User;
import com.example.springbootmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list/all")
    public List<User> listAll(){
        return userService.listAll();
    }
}
