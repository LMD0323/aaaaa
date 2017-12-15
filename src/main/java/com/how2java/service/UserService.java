package com.how2java.service;

import com.how2java.model.Permission;
import com.how2java.model.Role;
import com.how2java.model.User;

import java.util.List;

public interface UserService {
    public User login(User user);//�û���¼
    public List<User> userlist(String username);//��ѯ�û��б�
    public List<Permission> listpermisssion();//��ѯȨ���б�
    public List<Role> listrole();//��ɫ�б�
    public int updateuserrole(User user);//�޸��û�Ȩ��
    public int adduser(User user);//����û�
}
