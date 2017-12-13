package com.how2java.mapper;

import com.how2java.pojo.Discuss;

import java.util.List;

public interface DiscussMapper {
    public List<Discuss> discusslist(int disarticleid);//根据文章编号查询文章评论列表
    public int insertdiscuss(Discuss discuss);//增加评论
}
