package com.woniuxy.service;

import com.woniuxy.pojo.Trueorfalse;

import java.util.List;

public interface ITrueOrFalseService {
    List<Trueorfalse> findAll();
    void save(Trueorfalse trueorfalse);
    void delete(Integer trueorfalseid);
    void update(Trueorfalse trueorfalse);
    Trueorfalse findOne(Integer trueorfalseid);
}
