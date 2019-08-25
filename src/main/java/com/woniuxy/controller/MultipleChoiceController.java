package com.woniuxy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.woniuxy.pojo.MultipleChoice;
import com.woniuxy.pojo.PageBean;
import com.woniuxy.service.impl.MultipleChoiceServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.service.IMultipleChoiceService;

@Controller
@RequestMapping("/multipleChoice/")
public class MultipleChoiceController {

	@Resource
	private MultipleChoiceServiceImpl multipleChoiceServiceImpl;
	
	@RequestMapping("findByTypename")
	public @ResponseBody Map findByTypename(String typename, PageBean pageBean) {
		Map map = new HashMap();
		map.put("list", multipleChoiceServiceImpl.findByTypename(typename, pageBean));
		return map;
	}
	
	@RequestMapping("findByType")
	public @ResponseBody Map findByType(String typename, PageBean pageBean) {
		Map map = new HashMap();
		map.put("list", multipleChoiceServiceImpl.findByType(typename, pageBean));
		return map;
	}
	
	@RequestMapping("findAll")
	public @ResponseBody Map findAll(@RequestParam(defaultValue="0")int page, @RequestParam(defaultValue="5")int limit) {
		List<MultipleChoice> countdata = multipleChoiceServiceImpl.findAll();
		List<MultipleChoice> data = multipleChoiceServiceImpl.findByPage(page,limit);
		Map<String,Object> map = new HashMap();
		map.put("code",0);
		map.put("msg","");
		map.put("count",countdata.size());
		map.put("data",data);
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
