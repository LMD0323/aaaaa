package com.how2java.service.impl;

import com.how2java.mapper.UserMapper;
import com.how2java.model.Permission;
import com.how2java.model.Role;
import com.how2java.model.User;
import com.how2java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
    private UserMapper userMapper;
    public User login(User user){
        User user1 = userMapper.login(user);
        return user1;
    }
    public List<User> userlist(String username){
        List<User> userList = userMapper.userlist(username);
        return userList;
    }
    public List<Permission> listpermisssion(){
        List<Permission> permissionList = userMapper.listpermisssion();
        return permissionList;
    }
    public List<Role> listrole(){
        List<Role> roleList = userMapper.listrole();
        return roleList;
    }
    public int updateuserrole(User user){
        int count5 = userMapper.updateuserrole(user);
        return count5;
    }
    public int adduser(User user){
        int count6 = userMapper.adduser(user);
        return count6;
    }


}
