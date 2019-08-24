package com.woniuxy.service;

import com.woniuxy.pojo.PageBean;
import com.woniuxy.pojo.Tiankong;

import java.util.List;

public interface ITiankongService {
	List<Tiankong> findAll(PageBean pageBean);
	void save(Tiankong tk);
	void delete(Integer tiankongId);
	void update(Tiankong tk);
	Tiankong findOne(Integer tiankongId);
	List<Tiankong> findByName(String tiankong,PageBean pageBean);
}
