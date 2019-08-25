package com.woniuxy.service;

import com.woniuxy.pojo.Tiankong;

import java.util.List;

public interface ITiankongService {
	List<Tiankong> findAll();
	List<Tiankong> findByPage(Integer page, Integer limit);
	
	List<Tiankong> findAllByType(String typename);
	List<Tiankong> findByType(String typename, Integer page, Integer limit);
	
	List<Tiankong> findAllByQType(String typename);
	List<Tiankong> findByQType(String typename, Integer page, Integer limit);
	
	List<Tiankong> findAllByName(String name);
    List<Tiankong> findByName(String name, Integer page,Integer limit);
    
    List<Tiankong> findAllByTwo(String typename,String typename2);
    List<Tiankong> findByTwo(String typename,String typename2,Integer page, Integer limit);
	
	void save(Tiankong tk);
	void delete(Integer tiankongId);
	void update(Tiankong tk);
	Tiankong findOne(Integer tiankongId);

}
