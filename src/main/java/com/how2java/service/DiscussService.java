package com.how2java.service;

import com.how2java.pojo.Discuss;

import java.util.List;

public interface DiscussService {
    public List<Discuss> discusslist(int disarticleid);//�������±�Ų�ѯ���������б�
    public int insertdiscuss(Discuss discuss);//��������
}
