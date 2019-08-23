package com.woniuxy.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.pojo.PageBean;
import com.woniuxy.service.IMultipleChoiceService;

@Controller
@RequestMapping("/multipleChoice/")
public class MultipleChoiceController {

	@Resource
	private IMultipleChoiceService multipleChoiceServiceImpl;
	
	@RequestMapping("findAll")
	public @ResponseBody Map findAll(Integer typeid, PageBean pageBean) {
		Map map = new HashMap();
		map.put("list", multipleChoiceServiceImpl.findAll(typeid, pageBean));
		return map;
	}
	
}
