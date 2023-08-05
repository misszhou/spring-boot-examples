package com.misszhou.web;

import com.misszhou.model.User;
import com.misszhou.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/add")
    public User saveUser(String key) {
        User user=new User();
        user.setUserName("aa"+key);
        user.setEmail("zhoujun@sciecomm.cn"+key);
        user.setNickName("周先生"+key);
        user.setPassWord("123456"+key);
        user.setRegTime("2023-08-05"+key);
        userRepository.save(user);
        return user;
    }

    @RequestMapping("/getUserByName")
    public User getUserByName() {
        User user=userRepository.findByUserName("aa");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users=userRepository.findAll();
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return users;
    }
}
