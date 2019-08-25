package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.woniuxy.mapper.TiankongMapper;
import com.woniuxy.pojo.PageBean;
import com.woniuxy.pojo.Tiankong;
import org.springframework.stereotype.Service;

import com.woniuxy.service.ITiankongService;

@Service
public class TiankongService implements ITiankongService {

	@Resource
	private TiankongMapper tiankongMapper;



	@Override
	public List<Tiankong> findAll() {
		return tiankongMapper.findAll();
	}

	@Override
	public void save(Tiankong tk) {
		tiankongMapper.insertSelective(null);
		
	}

	@Override
	public void delete(Integer tiankongId) {
		tiankongMapper.deleteByPrimaryKey(tiankongId);
		
	}

	@Override
	public void update(Tiankong tk) {
		tiankongMapper.updateByPrimaryKeySelective(null);
	}

	@Override
	public Tiankong findOne(Integer tiankongId) {
		// TODO Auto-generated method stub
		return tiankongMapper.selectByPrimaryKey(tiankongId);
	}

	@Override
	public List<Tiankong> findByName(String tiankong, PageBean pageBean) {
		return null;
	}

	@Override
	public List<Tiankong> findByPage(int page, int limit) {
		return tiankongMapper.findByPage(page,limit);
	}

}
