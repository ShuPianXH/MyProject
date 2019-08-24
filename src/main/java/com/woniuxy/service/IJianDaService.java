package com.woniuxy.service;

import com.woniuxy.pojo.Jianda;
import com.woniuxy.pojo.PageBean;
import com.woniuxy.pojo.QuestionType;

import java.util.List;

public interface IJianDaService {
    List<Jianda> findAll(PageBean pageBean);
    void save(Jianda jd);
    void delete(Integer jiandaId);
    void update(Jianda jd);
    Jianda findOne(Integer jiandaId);
    //按学科
    List<Jianda> findByType(PageBean pageBean, QuestionType typename);
    //按知识点
    List<Jianda> findByQType(PageBean pageBean, String typename);
    //按名称
    List<Jianda> findByName(String name, PageBean pageBean);
}
