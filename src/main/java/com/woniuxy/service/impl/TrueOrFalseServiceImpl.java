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
    public void save(Trueorfalse trueorfalse) {
    	trueorfalseMapper.insertSelective(trueorfalse);
    }

    @Override
    public void delete(Integer tfId) {
    	trueorfalseMapper.deleteByPrimaryKey(tfId);
    }

    @Override
    public void update(Trueorfalse trueorfalse) {
    	trueorfalseMapper.updateByPrimaryKeySelective(trueorfalse);
    }

    @Override
    public Trueorfalse findOne(Integer tfId) {
        return trueorfalseMapper.selectByPrimaryKey(tfId);
    }

	@Override
	public List<Trueorfalse> findAll(PageBean pageBean) {
		// TODO Auto-generated method stub
		return trueorfalseMapper.selectByExample(new RowBounds(pageBean.getOffset(),pageBean.getLimit()));
	}

	@Override
	public List<Trueorfalse> findByType(String typename, PageBean pageBean) {
		// TODO Auto-generated method stub
		return trueorfalseMapper.findByType(typename,new RowBounds(pageBean.getOffset(),pageBean.getLimit()));
	}

	@Override
	public List<Trueorfalse> findByTypename(String typename, PageBean pageBean) {
		// TODO Auto-generated method stub
		return trueorfalseMapper.findByTypename(typename, new RowBounds(pageBean.getOffset(),pageBean.getLimit()));
	}
}
