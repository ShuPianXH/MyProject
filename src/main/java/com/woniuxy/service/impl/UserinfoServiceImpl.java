package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.pojo.Userinfo;
import com.woniuxy.pojo.UserinfoExample;
import com.woniuxy.pojo.UserinforoleExample;
import com.woniuxy.pojo.UserinforoleKey;
import com.woniuxy.mapper.UserinfoMapper;
import com.woniuxy.mapper.UserinforoleMapper;
import com.woniuxy.service.IUserinfoService;

@Service
public class UserinfoServiceImpl implements IUserinfoService {
	
	@Resource
	private UserinforoleMapper userinforoleMapper;

	@Resource
	private UserinfoMapper userinfoMapper;
	
	@Override
	@Transactional(readOnly = true)
	public Userinfo login(Userinfo info) {
		// TODO Auto-generated method stub
		return userinfoMapper.login(info);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Userinfo> findAll() {
		// TODO Auto-generated method stub
		return userinfoMapper.selectByExample(null);
	}

	@Override
	public void save(Userinfo info, Integer[] chk) {
		// TODO Auto-generated method stub
		//插入userinfo
		userinfoMapper.insert(info);
		//插入userinforole
		if (chk!=null) {
			for (Integer rid : chk) {
				UserinforoleKey key = new UserinforoleKey();
				key.setUid(info.getUid());
				key.setRid(rid);
				userinforoleMapper.insert(key);
			}
		}
	}

	@Override
	public void delete(Integer uid) {
		// TODO Auto-generated method stub
		Userinfo info = new Userinfo();
		info.setUid(uid);
		info.setIsdelete(true);
		userinfoMapper.updateByPrimaryKeySelective(info);
	}

	@Override
	public void revoke(Integer uid) {
		// TODO Auto-generated method stub
		Userinfo info = new Userinfo();
		info.setUid(uid);
		info.setIsdelete(false);
		userinfoMapper.updateByPrimaryKeySelective(info);
	}

	@Override
	public Userinfo findById(Integer uid) {
		// TODO Auto-generated method stub
		return userinfoMapper.selectByPrimaryKey(uid);
	}

	@Override
	public void update(Userinfo info, Integer[] chk) {
		// TODO Auto-generated method stub
		//修改userinfo
		userinfoMapper.updateByPrimaryKeySelective(info);
		
		//删除原userinforole
		UserinforoleExample example = new UserinforoleExample();
		example.createCriteria().andUidEqualTo(info.getUid());
		userinforoleMapper.deleteByExample(example);
		
		//新增userinforole
		if (chk!=null) {
			for (Integer rid : chk) {
				UserinforoleKey key = new UserinforoleKey();
				key.setUid(info.getUid());
				key.setRid(rid);
				userinforoleMapper.insert(key);
			}
		}
	}

}
