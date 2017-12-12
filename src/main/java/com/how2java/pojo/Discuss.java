package com.how2java.pojo;

public class Discuss {
    private int discussid;//评论编号
    private int disarticleid;//评论的文章的编号
    private String discussauthor;//评论者
    private String discussmes;//评论的内容
    private String discussdate;//评论时间

    public int getDiscussid() {
        return discussid;
    }

    public void setDiscussid(int discussid) {
        this.discussid = discussid;
    }

    public int getDisarticleid() {
        return disarticleid;
    }

    public void setDisarticleid(int disarticleid) {
        this.disarticleid = disarticleid;
    }

    public String getDiscussauthor() {
        return discussauthor;
    }

    public void setDiscussauthor(String discussauthor) {
        this.discussauthor = discussauthor;
    }

    public String getDiscussmes() {
        return discussmes;
    }

    public void setDiscussmes(String discussmes) {
        this.discussmes = discussmes;
    }

    public String getDiscussdate() {
        return discussdate;
    }

    public void setDiscussdate(String discussdate) {
        this.discussdate = discussdate;
    }
}
