package com.how2java.mapper;

import com.how2java.pojo.Discuss;

import java.util.List;

public interface DiscussMapper {
    public List<Discuss> discusslist(int disarticleid);//�������±�Ų�ѯ���������б�
    public int insertdiscuss(Discuss discuss);//��������
}
