package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.woniuxy.mapper.TiankongMapper;
import com.woniuxy.pojo.PageBean;
import com.woniuxy.pojo.Tiankong;
import org.springframework.stereotype.Service;

import com.woniuxy.service.ITiankongService;

@Service
public class TiankongServiceImpl implements ITiankongService {

	@Resource
	private TiankongMapper tiankongMapper;

	@Override
	public List<Tiankong> findAll() {
		// TODO Auto-generated method stub
		return tiankongMapper.findAll();
	}

	@Override
	public List<Tiankong> findByPage(Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return tiankongMapper.findByPage(page, limit);
	}

	@Override
	public List<Tiankong> findAllByType(String typename) {
		// TODO Auto-generated method stub
		return tiankongMapper.findAllByType(typename);
	}

	@Override
	public List<Tiankong> findByType(String typename, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return tiankongMapper.findByType(typename, page, limit);
	}

	@Override
	public List<Tiankong> findAllByQType(String typename) {
		// TODO Auto-generated method stub
		return tiankongMapper.findAllByQType(typename);
	}

	@Override
	public List<Tiankong> findByQType(String typename, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return tiankongMapper.findByQType(typename, page, limit);
	}

	@Override
	public void save(Tiankong tk) {
		// TODO Auto-generated method stub
		tiankongMapper.insertSelective(tk);
	}

	@Override
	public void delete(Integer tiankongId) {
		// TODO Auto-generated method stub
		tiankongMapper.deleteByPrimaryKey(tiankongId);
	}

	@Override
	public void update(Tiankong tk) {
		// TODO Auto-generated method stub
		tiankongMapper.updateByPrimaryKeySelective(tk);
	}

	@Override
	public Tiankong findOne(Integer tiankongId) {
		// TODO Auto-generated method stub
		return tiankongMapper.selectByPrimaryKey(tiankongId);
	}

	@Override
	public List<Tiankong> findByName(String tiankong, PageBean pageBean) {
		// TODO Auto-generated method stub
		return null;
	}


}
