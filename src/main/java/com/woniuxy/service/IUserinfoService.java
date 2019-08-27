package com.woniuxy.service;

import java.util.List;

import com.woniuxy.pojo.Userinfo;

public interface IUserinfoService {
	public Userinfo login(Userinfo info);
	public void save(Userinfo info,Integer[] chk);
	public List<Userinfo> findAll();
	public Userinfo findById(Integer uid);
	public void update(Userinfo info, Integer[] chk);
	public void delete(Integer uid);
	public void revoke(Integer uid);
}
