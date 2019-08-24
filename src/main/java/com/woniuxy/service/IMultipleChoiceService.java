package com.woniuxy.service;

import com.woniuxy.pojo.MultipleChoice;
import com.woniuxy.pojo.PageBean;

import java.util.List;

public interface IMultipleChoiceService {
	public List<MultipleChoice> findAll(PageBean pageBean);
	//题号
	public MultipleChoice findOne(Integer titleid);
	//知识点
	public List<MultipleChoice> findByType(String typename,PageBean pageBean);
	//科目名称
	public List<MultipleChoice> findByTypename(String typename, PageBean pageBean);
	public void save(MultipleChoice mc);
	public void delete(Integer titleid);
	public void update(MultipleChoice mc);
}
