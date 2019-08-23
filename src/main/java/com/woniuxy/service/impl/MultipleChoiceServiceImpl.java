package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.woniuxy.mapper.MultipleChoiceMapper;
import com.woniuxy.pojo.PageBean;
import com.woniuxy.service.IMultipleChoiceService;

@Service
public class MultipleChoiceServiceImpl implements IMultipleChoiceService {
	@Resource
	private MultipleChoiceMapper multipleChoiceMapper;

	@Override
	public List findAll(Integer typeid, PageBean pageBean) {
		// TODO Auto-generated method stub
		return multipleChoiceMapper.selectByExample(typeid, new RowBounds(pageBean.getOffset(),pageBean.getLimit()));
	}

}
