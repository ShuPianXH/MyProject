package com.woniuxy.service.impl;

import com.woniuxy.mapper.TrueorfalseMapper;
import com.woniuxy.pojo.PageBean;
import com.woniuxy.pojo.Trueorfalse;
import com.woniuxy.service.ITrueOrFalseService;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;

@Service
public class TrueOrFalseServiceImpl implements ITrueOrFalseService {
	@Resource
	private TrueorfalseMapper trueorfalseMapper;

	@Override
	public List<Trueorfalse> findAll() {
		// TODO Auto-generated method stub
		return trueorfalseMapper.findAll();
	}

	@Override
	public List<Trueorfalse> findByPage(Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return trueorfalseMapper.findByPage(page, limit);
	}

	@Override
	public Trueorfalse findOne(Integer tfid) {
		// TODO Auto-generated method stub
		return trueorfalseMapper.selectByPrimaryKey(tfid);
	}

	@Override
	public List<Trueorfalse> findAllByType(String typename) {
		// TODO Auto-generated method stub
		return trueorfalseMapper.findAllByType(typename);
	}

	@Override
	public List<Trueorfalse> findByType(String typename, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return trueorfalseMapper.findByType(typename, page, limit);
	}

	@Override
	public List<Trueorfalse> findAllByQType(String typename) {
		// TODO Auto-generated method stub
		return trueorfalseMapper.findAllByQType(typename);
	}

	@Override
	public List<Trueorfalse> findByQType(String typename, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return trueorfalseMapper.findByQType(typename, page, limit);
	}

	@Override
	public void save(Trueorfalse tf) {
		// TODO Auto-generated method stub
		trueorfalseMapper.insertSelective(tf);
	}

	@Override
	public void delete(Integer tfid) {
		// TODO Auto-generated method stub
		trueorfalseMapper.deleteByPrimaryKey(tfid);
	}

	@Override
	public void update(Trueorfalse tf) {
		// TODO Auto-generated method stub
		trueorfalseMapper.updateByPrimaryKeySelective(tf);
	}

	@Override
	public List<Trueorfalse> findAllByName(String name) {
		// TODO Auto-generated method stub
		return trueorfalseMapper.findAllByName(name);
	}

	@Override
	public List<Trueorfalse> findByName(String name, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return trueorfalseMapper.findByName(name, page, limit);
	}

	@Override
	public List<Trueorfalse> findAllByTwo(String typename, String typename2) {
		// TODO Auto-generated method stub
		return trueorfalseMapper.findAllByTwo(typename, typename2);
	}

	@Override
	public List<Trueorfalse> findByTwo(String typename, String typename2, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return trueorfalseMapper.findByTwo(typename, typename2, page, limit);
	}

}
