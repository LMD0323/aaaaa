package com.how2java.model;

public class Article {
    private int articleid;//文章编号
    private String articleauthor;//文章作者
    private String articletitle;//文章标题
    private String articlecontext;//文章内容
    private String articledate;//文章发布时间
    private Discuss articlediscuss;//文章的评论
    private int discount;//文章的评论数

    public int getArticleid() {
        return articleid;
    }

    public void setArticleid(int articleid) {
        this.articleid = articleid;
    }

    public String getArticleauthor() {
        return articleauthor;
    }

    public void setArticleauthor(String articleauthor) {
        this.articleauthor = articleauthor;
    }

    public String getArticletitle() {
        return articletitle;
    }

    public void setArticletitle(String articletitle) {
        this.articletitle = articletitle;
    }

    public String getArticlecontext() {
        return articlecontext;
    }

    public void setArticlecontext(String articlecontext) {
        this.articlecontext = articlecontext;
    }

    public String getArticledate() {
        return articledate;
    }

    public void setArticledate(String articledate) {
        this.articledate = articledate;
    }

    public Discuss getArticlediscuss() {
        return articlediscuss;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setArticlediscuss(Discuss articlediscuss) {
        this.articlediscuss = articlediscuss;
    }
}
