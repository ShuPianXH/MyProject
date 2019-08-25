package com.woniuxy.service;

import com.woniuxy.pojo.Jianda;
import com.woniuxy.pojo.PageBean;
import com.woniuxy.pojo.QuestionType;

import java.util.List;

public interface IJianDaService {
    List<Jianda> findAll();
    List<Jianda> findByPage(Integer page,Integer limit);
    void save(Jianda jd);
    void delete(Integer jiandaId);
    void update(Jianda jd);
    Jianda findOne(Integer jiandaId);
    //按学科
    List<Jianda> findAllByType(String typeName);
    List<Jianda> findByType(String typeName,Integer page,Integer limit);
    //按知识点
    List<Jianda> findAllByQType(String typename);
    List<Jianda> findByQType(String typeName,Integer page,Integer limit);
    //按名称
    List<Jianda> findByName(String name, PageBean pageBean);
}
