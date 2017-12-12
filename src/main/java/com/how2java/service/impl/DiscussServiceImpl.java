package com.how2java.service.impl;

import com.how2java.mapper.DiscussMapper;
import com.how2java.pojo.Discuss;
import com.how2java.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussServiceImpl implements DiscussService {
    @Autowired
    private DiscussMapper discussMapper;
    public List<Discuss> discusslist(int disarticleid){
        List<Discuss> discussList = discussMapper.discusslist(disarticleid);
        return discussList;
    }
}
