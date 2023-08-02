package com.example.springbootmvc.service;

import com.example.springbootmvc.domain.User;
import com.example.springbootmvc.domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> listAll(){

        return userMapper.selectAll();
    }
}
