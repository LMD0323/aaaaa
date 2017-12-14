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
    public List<Article> searcharticlebyname(String articleauthor){
        List<Article> articleList = articleMapper.searcharticlebyname(articleauthor);
        return articleList;
    }
    public List<Article> searcharticleuser(String articleauthor){
        List<Article> articleList1 = articleMapper.searcharticleuser(articleauthor);
        return articleList1;
    }

    public int deletediscuss(int articleid){
        int count1 = articleMapper.deletediscuss(articleid);
        return count1;
    }
    public int deletearticle(int articleid){
        int count2 = articleMapper.deletearticle(articleid);
        return count2;
    }
    public int updatearticle(Article article){
        int count3 = articleMapper.updatearticle(article);
        return count3;
    }

}
