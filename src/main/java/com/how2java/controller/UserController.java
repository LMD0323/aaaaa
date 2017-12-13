package com.how2java.controller;

import com.how2java.pojo.User;
import com.how2java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 前往登录页面
     * @return
     */
    @RequestMapping("gologin")
    public ModelAndView goLogin(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }

    /**
     * 前往注册页面
     * @return
     */
    @RequestMapping("goregist")
    public ModelAndView goRegist(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("regist");
        return mav;
    }
    /**
     * 用户下线
     * @param session
     * @return
     */
    @RequestMapping("tooff")
    public ModelAndView offline(HttpSession session){
        session.removeAttribute("user1");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("listCategory");
        return mav;
    }

    /**
     * 用户登录
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
            //登录成功返回ok
            return "ok";
        }
        //登录失败返回no
        return "no";
    }
}
