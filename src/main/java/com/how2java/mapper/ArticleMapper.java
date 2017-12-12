package com.how2java.mapper;

import com.how2java.pojo.Article;
import com.how2java.pojo.Discuss;

import java.util.List;

public interface ArticleMapper {
    public List<Article> articlelist();//查询有评论的文章列表
    public List<Article> articlelistno();//查询没有评论的文章列表
    public Article searcharticle(int articleid);//根据编号查询文章详情

}
