package com.woniuxy.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.pojo.MultipleChoice;
import com.woniuxy.pojo.PageBean;
import com.woniuxy.service.IMultipleChoiceService;

@Controller
@RequestMapping("/multipleChoice/")
public class MultipleChoiceController {

	@Resource
	private IMultipleChoiceService multipleChoiceServiceImpl;
	
	@RequestMapping("findByTypename")
	public @ResponseBody Map findByTypename(String typename, PageBean pageBean) {
		Map map = new HashMap();
		map.put("list", multipleChoiceServiceImpl.findByTypename(typename, pageBean));
		return map;
	}
	
	@RequestMapping("findAll")
	public @ResponseBody Map findAll(PageBean pageBean) {
		System.out.println("MultipleChoiceController.findAll()");
		Map map = new HashMap<>();
		map.put("list", multipleChoiceServiceImpl.findAll(pageBean));
		return map;
	}
	
	@RequestMapping("findOne")
	public @ResponseBody Map findOne(Integer titleid) {
		System.out.println("MultipleChoiceController.findOne()");
		Map map = new HashMap<>();
		map.put("mc",multipleChoiceServiceImpl.findOne(titleid));
		return map;
	}
	
	@RequestMapping("save")
	public String save(MultipleChoice mc) {
		multipleChoiceServiceImpl.save(mc);
		return "findAll";
	}
	
	@RequestMapping("delete")
	public String delete(Integer titleid) {
		multipleChoiceServiceImpl.delete(titleid);
		return "findAll";
	}
	
	@RequestMapping("update")
	public String update(MultipleChoice mc) {
		multipleChoiceServiceImpl.update(mc);
		return "findAll";
	}
	
}
