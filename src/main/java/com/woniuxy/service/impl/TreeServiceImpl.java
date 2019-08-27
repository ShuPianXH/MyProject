package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniuxy.mapper.TreeMapper;
import com.woniuxy.service.ITreeService;

@Service
public class TreeServiceImpl implements ITreeService {

	@Resource
	private TreeMapper treeMapper;
	
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return treeMapper.selectByExample(null);
	}

}
