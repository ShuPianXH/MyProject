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
    List findByType(PageBean pageBean, QuestionType typename);

    List findByQType(PageBean pageBean, String typename);
}
