package com.how2java.model;

public class Article {
    private int articleid;//���±��
    private String articleauthor;//��������
    private String articletitle;//���±���
    private String articlecontext;//��������
    private String articledate;//���·���ʱ��
    private Discuss articlediscuss;//���µ�����
    private int discount;//���µ�������

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
