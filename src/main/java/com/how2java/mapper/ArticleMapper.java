package com.how2java.mapper;

import com.how2java.pojo.Article;
import com.how2java.pojo.Discuss;

import java.util.List;

public interface ArticleMapper {
    public List<Article> articlelist();//��ѯ�����۵������б�
    public List<Article> articlelistno();//��ѯû�����۵������б�
    public Article searcharticle(int articleid);//���ݱ�Ų�ѯ��������
    public List<Article> searcharticlebyname(String articleauthor);//�������߲�ѯ����
    /*
    ɾ������
    1.��ɾ������
    2.ɾ������
     */
    public int deletediscuss(int articleid);
    public int deletearticle(int articleid);
}
