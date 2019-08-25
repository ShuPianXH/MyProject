package com.woniuxy.service;

import com.woniuxy.pojo.MultipleChoice;
import com.woniuxy.pojo.PageBean;

import java.util.List;

public interface IMultipleChoiceService {
	List<MultipleChoice> findAll();
	//题号
	MultipleChoice findOne(Integer titleid);
	//知识点
	List<MultipleChoice> findByType(String typename,PageBean pageBean);
	//科目名称
	List<MultipleChoice> findByTypename(String typename, PageBean pageBean);
	//分页
	List<MultipleChoice> findByPage(Integer page,Integer limit);
	void save(MultipleChoice mc);
	void delete(Integer titleid);
	void update(MultipleChoice mc);
}
