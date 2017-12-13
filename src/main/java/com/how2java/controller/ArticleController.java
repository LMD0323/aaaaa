package com.how2java.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.pojo.Article;
import com.how2java.pojo.Discuss;
import com.how2java.service.ArticleService;
import com.how2java.service.DiscussService;
import com.how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private DiscussService discussService;
    @RequestMapping("listCategory")
    public ModelAndView listCategory(Page page){
        ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<Article> ls= articleService.articlelist();
        List<Article> lsno = articleService.articlelistno();
        int total1 = (int) new PageInfo<>(ls).getTotal();
        int total2 = (int) new PageInfo<>(lsno).getTotal();
        int total = total1+total2;
        page.caculateLast(total);
        // 放入转发参数
        mav.addObject("ls", ls);
        mav.addObject("lsno", lsno);
        // 放入jsp路径
        mav.setViewName("listCategory");
        return mav;
    }
    @RequestMapping("articleAndDiscusslist")
    public ModelAndView articleAndDiscusslist(int articleid){
        ModelAndView mav = new ModelAndView();
        Article article = articleService.searcharticle(articleid);
        List<Discuss> discussList = discussService.discusslist(articleid);
        mav.addObject("article",article);
        mav.addObject("discussList",discussList);
        mav.setViewName("disarticle");
        return mav;
        }

    @RequestMapping("toupdatearticle")
    public ModelAndView goMyArticle(int articleid){
        ModelAndView mav = new ModelAndView();
        Article article1 = articleService.searcharticle(articleid);
        mav.addObject("article1",article1);
        mav.setViewName("updatearticle");
        return mav;
    }
    /**
     * 前往个人页面
     * @return
     */
    @RequestMapping("gomyarticle")
    public ModelAndView toUpdateArticle(String articleauthor){
        ModelAndView mav = new ModelAndView();
        List<Article> articlelist = articleService.searcharticlebyname(articleauthor);
        mav.addObject("articlelist",articlelist);
        mav.setViewName("myarticle");
        return mav;
    }
    @RequestMapping("deletearticle")
    public String deleteArticle(int articleid,String articleauthor){
        int count1 = articleService.deletediscuss(articleid);
        int count2 = articleService.deletearticle(articleid);
        return "forward:gomyarticle?articleauthor=articleauthor";
    }
        }
