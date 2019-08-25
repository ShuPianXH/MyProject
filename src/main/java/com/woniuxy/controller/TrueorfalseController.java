package com.woniuxy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.pojo.Jianda;
import com.woniuxy.pojo.Trueorfalse;
import com.woniuxy.service.ITrueOrFalseService;

@Controller
@RequestMapping("/tureOrFalse/")
public class TrueorfalseController {

	@Resource
	private ITrueOrFalseService trueOrFalseServiceImpl;

	@RequestMapping("findByQType")
	public @ResponseBody Map<String,Object> findByQType(@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = "5") int limit, String typename) {
		List<Trueorfalse> countdata = trueOrFalseServiceImpl.findAllByQType(typename);
		List<Trueorfalse> data = trueOrFalseServiceImpl.findByQType(typename, page, limit);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", countdata.size());
		map.put("data", data);
		return map;
	}

	@RequestMapping("findByType")
	public @ResponseBody Map<String,Object> findByType(@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = "5") int limit, String typename) {
		List<Trueorfalse> countdata = trueOrFalseServiceImpl.findAllByType(typename);
		List<Trueorfalse> data = trueOrFalseServiceImpl.findByQType(typename, page, limit);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", countdata.size());
		map.put("data", data);
		return map;
	}

	@RequestMapping("findAll")
	public @ResponseBody Map<String,Object> findAll(@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = "5") int limit) {
		List<Trueorfalse> countdata = trueOrFalseServiceImpl.findAll();
		List<Trueorfalse> data = trueOrFalseServiceImpl.findByPage(page, limit);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", countdata.size());
		map.put("data", data);
		return map;
	}

	@RequestMapping("/findByName")
	public @ResponseBody Map<String, Object> findByName(@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = "5") int limit, String name) {
		List<Trueorfalse> countdata = trueOrFalseServiceImpl.findAllByName(name);
		List<Trueorfalse> data = trueOrFalseServiceImpl.findByName(name, page, limit);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", countdata.size());
		map.put("data", data);
		return map;
	}
	
	@RequestMapping("/findByTwo")
	public @ResponseBody Map<String, Object> findByTwo(@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = "5") int limit, String typaname,String typename2) {
		List<Trueorfalse> countdata = trueOrFalseServiceImpl.findAllByTwo(typaname,typename2);
		List<Trueorfalse> data = trueOrFalseServiceImpl.findByTwo(typaname,typename2, page, limit);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", countdata.size());
		map.put("data", data);
		return map;
	}

	@RequestMapping("findOne")
	public @ResponseBody Map<String,Object> findOne(Integer tfid) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("mc", trueOrFalseServiceImpl.findOne(tfid));
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
