package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.woniuxy.mapper.MultipleChoiceMapper;
import com.woniuxy.pojo.MultipleChoice;
import com.woniuxy.pojo.PageBean;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.woniuxy.service.IMultipleChoiceService;

@Service
public class MultipleChoiceServiceImpl implements IMultipleChoiceService {
	@Resource
	private MultipleChoiceMapper multipleChoiceMapper;

	@Override
	public List findByTypename(String typename, PageBean pageBean) {
		// TODO Auto-generated method stub
		return multipleChoiceMapper.findByTypename(typename, new RowBounds(pageBean.getOffset(),pageBean.getLimit()));
	}

	@Override
	public List<MultipleChoice> findByPage(Integer page, Integer limit) {
		return multipleChoiceMapper.findByPage(page,limit);
	}


	@Override
	public List<MultipleChoice> findAll() {
		return multipleChoiceMapper.findAll();
	}

	@Override
	public MultipleChoice findOne(Integer titleid) {
		// TODO Auto-generated method stub
		return multipleChoiceMapper.selectByPrimaryKey(titleid);
	}

	@Override
	public void save(MultipleChoice mc) {
		// TODO Auto-generated method stub
		multipleChoiceMapper.insertSelective(mc);
	}

	@Override
	public void delete(Integer titleid) {
		// TODO Auto-generated method stub
		multipleChoiceMapper.deleteByPrimaryKey(titleid);
	}

	@Override
	public void update(MultipleChoice mc) {
		// TODO Auto-generated method stub
		multipleChoiceMapper.updateByPrimaryKey(mc);
	}

	@Override
	public List<MultipleChoice> findByType(String typename, PageBean pageBean) {
		// TODO Auto-generated method stub
		return multipleChoiceMapper.findByType(typename, new RowBounds(pageBean.getOffset(),pageBean.getLimit()));
	}

}
