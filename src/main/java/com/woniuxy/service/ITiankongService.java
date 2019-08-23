package com.woniuxy.service;

import java.util.List;

import com.woniuxy.pojo.Tiankong;

public interface ITiankongService {
	List<Tiankong> findAll();
	void save(Tiankong tk);
	void delete(Integer tiankongId);
	void update(Tiankong tk);
	Tiankong findOne(Integer tiankongId);
	
}
