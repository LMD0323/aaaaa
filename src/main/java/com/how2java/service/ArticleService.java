package com.how2java.service;

import com.how2java.model.Article;

import java.util.List;

public interface ArticleService {
    public List<Article> articlelist();//��ѯ�����б�
    public List<Article> articlelistno();//��ѯû�����۵������б�
    public Article searcharticle(int articleid);//���ݱ�Ų�ѯ��������
    public List<Article> searcharticlebyname(String articleauthor);//�������߲�ѯ����
    public List<Article> searcharticleuser(String articleauthor);//��ѯ�û�����
    public int deletediscuss(int articleid);
    public int deletearticle(int articleid);//���ݱ��ɾ������
    public int updatearticle(Article article);
    public int addarticles(Article article);
}
