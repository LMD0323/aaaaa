package com.how2java.service;

import com.how2java.pojo.Permission;
import com.how2java.pojo.Role;
import com.how2java.pojo.User;

import java.util.List;

public interface UserService {
    public User login(User user);//�û���¼
    public List<User> userlist(String username);//��ѯ�û��б�
    public List<Permission> listpermisssion();//��ѯȨ���б�
    public List<Role> listrole();//��ɫ�б�
}
