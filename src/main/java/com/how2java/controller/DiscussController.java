package com.how2java.controller;

import com.how2java.pojo.Discuss;
import com.how2java.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DiscussController {
    @Autowired
    private DiscussService discussService;
    @RequestMapping("insdiscuss")
    @ResponseBody
    public String toInsertDiscuss(Discuss discuss){
        int count = discussService.insertdiscuss(discuss);
        if(count>0){
            return "insok";
        }
        return "insno";
    }
}
