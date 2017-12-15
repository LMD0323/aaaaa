package com.how2java.service;

import com.how2java.model.Permission;
import com.how2java.model.Role;
import com.how2java.model.User;

import java.util.List;

public interface UserService {
    public User login(User user);//用户登录
    public List<User> userlist(String username);//查询用户列表
    public List<Permission> listpermisssion();//查询权限列表
    public List<Role> listrole();//角色列表
    public int updateuserrole(User user);//修改用户权限
    public int adduser(User user);//添加用户
}
