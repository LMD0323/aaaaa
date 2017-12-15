package com.how2java.controller;

import com.how2java.model.Permission;
import com.how2java.model.Role;
import com.how2java.model.User;
import com.how2java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * ǰ����¼ҳ��
     * @return
     */
    @RequestMapping("gologin")
    public ModelAndView goLogin(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }

    /**
     * ǰ��ע��ҳ��
     * @return
     */
    @RequestMapping("goregist")
    public ModelAndView goRegist(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("regist");
        return mav;
    }
    /**
     * �û�����
     * @param session
     * @return
     */
    @RequestMapping("tooff")
    public String offline(HttpSession session){
        session.removeAttribute("user1");
        return "forward:listCategory";
    }

    /**
     * �û���¼
     * @param user
     * @param session
     * @return
     */
    @RequestMapping("tologin")
    @ResponseBody
    public String tologin(User user, HttpSession session){
        User user1 = userService.login(user);
        if(null!=user1){
            session.setAttribute("user1",user1);
            //��¼�ɹ�����ok
            return "ok";
        }
        //��¼ʧ�ܷ���no
        return "no";
    }
    @RequestMapping("tomyuser")
    public ModelAndView toMyUser(HttpSession session){
        ModelAndView mav = new ModelAndView();
        User user = (User) session.getAttribute("user1");
        List<Permission> permissionList = userService.listpermisssion();
        List<User> userList = userService.userlist(user.getUsername());
        List<Role> roleList = userService.listrole();
        mav.addObject("permissionList",permissionList);
        mav.addObject("userList",userList);
        mav.addObject("roleList",roleList);
        mav.setViewName("myuser");
        return mav;
    }
    @RequestMapping("updaterole")
    @ResponseBody
    public String upDateUserRole(User user){
        int count = userService.updateuserrole(user);
        if(count>0){
            return "updateroleok";
        }
        return "updateroleno";
    }
    @RequestMapping("adduser")
    @ResponseBody
    public String addUser(User user){
        int count = userService.adduser(user);
        if(count>0){
           return "adduserok";
        }
        return "adduserno";
    }
}
