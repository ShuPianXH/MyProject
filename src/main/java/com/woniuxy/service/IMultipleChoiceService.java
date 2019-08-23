package com.woniuxy.service;

import java.util.List;

import com.woniuxy.pojo.PageBean;

public interface IMultipleChoiceService {
	public List findAll(Integer typeid, PageBean pageBean);
}
