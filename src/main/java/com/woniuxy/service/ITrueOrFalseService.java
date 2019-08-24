package com.woniuxy.service;

import com.woniuxy.pojo.PageBean;
import com.woniuxy.pojo.Trueorfalse;

import java.util.List;

public interface ITrueOrFalseService {
    List<Trueorfalse> findAll(PageBean pageBean);
    //题号
    Trueorfalse findOne(Integer tfid);
    //知识点
    List<Trueorfalse> findByType(String typename,PageBean pageBean);
    //科目
    List<Trueorfalse> findByTypename(String typename, PageBean pageBean);
    void save(Trueorfalse tf);
    void delete(Integer tfid);
    void update(Trueorfalse tf);
}
