package com.how2java.service;

import com.how2java.pojo.Article;
import com.how2java.pojo.Discuss;

import java.util.List;

public interface ArticleService {
    public List<Article> articlelist();//��ѯ�����б�
    public List<Article> articlelistno();//��ѯû�����۵������б�
    public Article searcharticle(int articleid);//���ݱ�Ų�ѯ��������
}
