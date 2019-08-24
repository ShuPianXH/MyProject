package com.woniuxy.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.pojo.PageBean;
import com.woniuxy.pojo.Trueorfalse;
import com.woniuxy.service.ITrueOrFalseService;

@Controller
@RequestMapping("/trueOrFalse/")
public class TrueorfalseController {
	
	@Resource
	private ITrueOrFalseService trueOrFalseServiceImpl;
	
	@RequestMapping("findByTypename")
	public @ResponseBody Map findByTypename(String typename, PageBean pageBean){
		Map map = new HashMap();
		map.put("list", trueOrFalseServiceImpl.findByTypename(typename, pageBean));
		return map;
	}
	
	@RequestMapping("findByType")
	public @ResponseBody Map findByType(String typename, PageBean pageBean){
		Map map = new HashMap();
		map.put("list", trueOrFalseServiceImpl.findByType(typename, pageBean));
		return map;
	}
	
	@RequestMapping("findAll")
	public @ResponseBody Map findAll(PageBean pageBean) {
		Map map = new HashMap<>();
		map.put("list", trueOrFalseServiceImpl.findAll(pageBean));
		return map;
	}
	
	@RequestMapping("findOne")
	public @ResponseBody Map findOne(Integer tfid) {
		Map map = new HashMap<>();
		map.put("mc",trueOrFalseServiceImpl.findOne(tfid));
		return map;
	}
	
	@RequestMapping("save")
	public String save(Trueorfalse tf) {
		trueOrFalseServiceImpl.save(tf);
		return "findAll";
	}
	
	@RequestMapping("delete")
	public String delete(Integer tfid) {
		trueOrFalseServiceImpl.delete(tfid);
		return "findAll";
	}
	
	@RequestMapping("update")
	public String update(Trueorfalse tf) {
		trueOrFalseServiceImpl.update(tf);
		return "findAll";
	}
}
