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
	public List<MultipleChoice> findAll() {
		// TODO Auto-generated method stub
		return multipleChoiceMapper.findAll();
	}

	@Override
	public List<MultipleChoice> findByPage(Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return multipleChoiceMapper.findByPage(page, limit);
	}

	@Override
	public MultipleChoice findOne(Integer titleid) {
		// TODO Auto-generated method stub
		return multipleChoiceMapper.selectByPrimaryKey(titleid);
	}

	@Override
	public List<MultipleChoice> findAllByType(String typename) {
		// TODO Auto-generated method stub
		return multipleChoiceMapper.findAllByType(typename);
	}

	@Override
	public List<MultipleChoice> findByType(String typename, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return multipleChoiceMapper.findByType(typename, page, limit);
	}

	@Override
	public List<MultipleChoice> findAllByQType(String typename) {
		// TODO Auto-generated method stub
		return multipleChoiceMapper.findAllByQType(typename);
	}

	@Override
	public List<MultipleChoice> findByQType(String typename, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return multipleChoiceMapper.findByQType(typename, page, limit);
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
		multipleChoiceMapper.updateByPrimaryKeySelective(mc);
	}

	@Override
	public List<MultipleChoice> findAllByName(String name) {
		// TODO Auto-generated method stub
		return multipleChoiceMapper.findAllByName(name);
	}

	@Override
	public List<MultipleChoice> findByName(String name, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return multipleChoiceMapper.findByName(name, page, limit);
	}

	@Override
	public List<MultipleChoice> findAllByTwo(String typename, String typename2) {
		// TODO Auto-generated method stub
		return multipleChoiceMapper.findAllByTwo(typename, typename2);
	}

	@Override
	public List<MultipleChoice> findByTwo(String typename, String typename2, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return multipleChoiceMapper.findByTwo(typename, typename2, page, limit);
	}

	
}
