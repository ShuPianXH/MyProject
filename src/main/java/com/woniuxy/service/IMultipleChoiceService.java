package com.woniuxy.service;

import com.woniuxy.pojo.MultipleChoice;
import com.woniuxy.pojo.PageBean;

import java.util.List;

public interface IMultipleChoiceService {
	//分页
	List<MultipleChoice> findAll();
	List<MultipleChoice> findByPage(Integer page,Integer limit);
	//题号
	MultipleChoice findOne(Integer titleid);
	//知识点
	List<MultipleChoice> findAllByType(String typename);
	List<MultipleChoice> findByType(String typename,Integer page,Integer limit);
	//科目名称
	List<MultipleChoice> findAllByQType(String typename);
	List<MultipleChoice> findByQType(String typename,Integer page,Integer limit);
	void save(MultipleChoice mc);
	void delete(Integer titleid);
	void update(MultipleChoice mc);
}
