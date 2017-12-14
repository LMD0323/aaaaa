package com.how2java.service;

import com.how2java.pojo.Permission;
import com.how2java.pojo.Role;
import com.how2java.pojo.User;

import java.util.List;

public interface UserService {
    public User login(User user);//用户登录
    public List<User> userlist(String username);//查询用户列表
    public List<Permission> listpermisssion();//查询权限列表
    public List<Role> listrole();//角色列表
}
