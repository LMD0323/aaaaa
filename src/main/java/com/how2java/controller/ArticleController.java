package com.how2java.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.model.Article;
import com.how2java.model.Discuss;
import com.how2java.model.User;
import com.how2java.service.ArticleService;
import com.how2java.service.DiscussService;
import com.how2java.service.UserService;
import com.how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller

public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private DiscussService discussService;
    @Autowired
    private UserService userService;
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

    /**
     * 去往编辑文章
     * @param articleid
     * @return
     */
    @RequestMapping("toupdatearticle")
    public String goMyArticle(int articleid,String articleauthor,HttpSession session, Model model){
        User user = (User) session.getAttribute("user1");
        if(user.getUserrole().equals("01")||user.getUserrole().equals("04")||user.getUsername().equals(articleauthor)){ Article article1 = articleService.searcharticle(articleid);
            model.addAttribute("article1",article1);
            return "updatearticle";
        }
        else{
            return "forward:gomyarticle";
        }
    }
    /**
     * 根据用户名查询文章并前往个人页面
     * @return
     */
    @RequestMapping("gomyarticle")
    public ModelAndView toUpdateArticle(HttpSession session){
        ModelAndView mav = new ModelAndView();
        User user = (User) session.getAttribute("user1");
        List<Article> articlelist = articleService.searcharticlebyname(user.getUsername());
        List<Article> articlelist1 = articleService.searcharticleuser(user.getUsername());
        mav.addObject("articlelist",articlelist);
        mav.addObject("articlelist1",articlelist1);
        mav.setViewName("myarticle");
        return mav;
    }

    /**
     * 删除个人文章
     * @param articleid
     * @return
     */
    @RequestMapping("deletearticle")
    @ResponseBody
    public String deleteArticle(int articleid){
        int count1 = articleService.deletediscuss(articleid);
        int count2 = articleService.deletearticle(articleid);
        if(count1>0||count1==0){
            return "ok";
        }
        return "no";
    }
    /**
     * 删除他人文章
     * @param articleid
     * @return
     */
    @RequestMapping("deletearticleother")
    @ResponseBody
    public String deleteArticleother(int articleid,HttpSession session,String articleauthor){
        User user = (User) session.getAttribute("user1");
        if(user.getUserrole().equals("01")||user.getUserrole().equals("04")||user.getUsername().equals(articleauthor)){
            int count1 = articleService.deletediscuss(articleid);
            int count2 = articleService.deletearticle(articleid);
            return "ok";
        }else{
            return "no";
        }

    }
    /**
     * 编辑个人文章
     * @param article
     * @return
     */
    @RequestMapping("updatearticle")
    @ResponseBody
    public String updateArticle(Article article){
        int count = articleService.updatearticle(article);
        if(count>0){
           return "updateok" ;
        }
        return "updateno";
    }
    /**
     * 前往增加文章页面
     * @return
     */
    @RequestMapping("goaddarticles")
    public ModelAndView goRegist(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("addarticle");
        return mav;
    }
    @RequestMapping("addarticles")
    @ResponseBody
    public String addArticle(Article article,HttpSession session){
        User user = (User) session.getAttribute("user1");
        article.setArticleauthor(user.getUsername());
        int count = articleService.addarticles(article);
        if(count>0){
            return "addok";
        }  else{
            return "addno";
        }
    }
}
