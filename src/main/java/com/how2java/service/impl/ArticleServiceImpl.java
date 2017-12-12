package com.how2java.service.impl;

import com.how2java.mapper.ArticleMapper;
import com.how2java.pojo.Article;
import com.how2java.pojo.Discuss;
import com.how2java.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    public List<Article> articlelist(){
        List<Article> articleList = articleMapper.articlelist();
        return articleList;
    }
    public List<Article> articlelistno(){
        List<Article> articleListno = articleMapper.articlelistno();
        return articleListno;
    }
    public Article searcharticle(int articleid){
        Article article = articleMapper.searcharticle(articleid);
        return  article;
    }

}
