package com.woniuxy.service;

import java.util.List;

import com.woniuxy.pojo.PageBean;

public interface IMultipleChoiceService {
	public List findAll(PageBean pageBean);

	public List findByTypename(String typename, PageBean pageBean);
}
