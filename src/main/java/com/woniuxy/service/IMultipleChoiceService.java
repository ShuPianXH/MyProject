package com.woniuxy.service;

import com.woniuxy.pojo.MultipleChoice;
import com.woniuxy.pojo.PageBean;

import java.util.List;

public interface IMultipleChoiceService {
	public List<MultipleChoice> findAll(PageBean pageBean);
	public List<MultipleChoice> findByTypename(String typename, PageBean pageBean);
	public MultipleChoice findOne(Integer titleid);
	public void save(MultipleChoice mc);
	public void delete(Integer titleid);
	public void update(MultipleChoice mc);
}
