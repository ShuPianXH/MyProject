package com.woniuxy.service;

import com.woniuxy.pojo.Trueorfalse;

import java.util.List;

public interface ITrueOrFalseService {
	//分页
	List<Trueorfalse> findAll();
	List<Trueorfalse> findByPage(Integer page,Integer limit);
    //题号
    Trueorfalse findOne(Integer tfid);
    //知识点
    List<Trueorfalse> findAllByType(String typename);
    List<Trueorfalse> findByType(String typename,Integer page,Integer limit);
    //科目
    List<Trueorfalse> findAllByQType(String typename);
    List<Trueorfalse> findByQType(String typename,Integer page,Integer limit);
    //按名称
    List<Trueorfalse> findAllByName(String name);
    List<Trueorfalse> findByName(String name, Integer page,Integer limit);
    
    List<Trueorfalse> findAllByTwo(String typename,String typename2);
    List<Trueorfalse> findByTwo(String typename,String typename2,Integer page, Integer limit);
    void save(Trueorfalse tf);
    void delete(Integer tfid);
    void update(Trueorfalse tf);
}
