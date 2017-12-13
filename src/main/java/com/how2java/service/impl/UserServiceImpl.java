package com.how2java.service.impl;

import com.how2java.mapper.UserMapper;
import com.how2java.pojo.User;
import com.how2java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
    private UserMapper userMapper;
    public User login(User user){
        User user1 = userMapper.login(user);
        return user1;
    }

}
