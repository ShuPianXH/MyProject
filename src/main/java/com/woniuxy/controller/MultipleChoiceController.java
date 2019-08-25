package com.woniuxy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.woniuxy.pojo.Jianda;
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
	
	@RequestMapping("findByQType")
	public @ResponseBody Map<String,Object> findByQType(@RequestParam(defaultValue="0")int page, @RequestParam(defaultValue="5")int limit,String typename) {
		List<MultipleChoice> countdata = multipleChoiceServiceImpl.findAllByQType(typename);
		List<MultipleChoice> data = multipleChoiceServiceImpl.findByQType(typename, page, limit);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code",0);
		map.put("msg","");
		map.put("count",countdata.size());
		map.put("data",data);
		return map;
	}
	
	@RequestMapping("findByType")
	public @ResponseBody Map<String,Object> findByType(@RequestParam(defaultValue="0")int page, @RequestParam(defaultValue="5")int limit,String typename) {
		List<MultipleChoice> countdata = multipleChoiceServiceImpl.findAllByType(typename);
		List<MultipleChoice> data = multipleChoiceServiceImpl.findByQType(typename, page, limit);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code",0);
		map.put("msg","");
		map.put("count",countdata.size());
		map.put("data",data);
		return map;
	}
	
	@RequestMapping("findAll")
	public @ResponseBody Map<String,Object> findAll(@RequestParam(defaultValue="0")int page, @RequestParam(defaultValue="5")int limit) {
		List<MultipleChoice> countdata = multipleChoiceServiceImpl.findAll();
		List<MultipleChoice> data = multipleChoiceServiceImpl.findByPage(page,limit);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code",0);
		map.put("msg","");
		map.put("count",countdata.size());
		map.put("data",data);
		return map;
	}
	
	@RequestMapping("/findByName")
    public @ResponseBody Map<String,Object> findByName(@RequestParam(defaultValue="0")int page, @RequestParam(defaultValue="5")int limit, String name){
        List<MultipleChoice> countdata = multipleChoiceServiceImpl.findAllByName(name);
        List<MultipleChoice> data = multipleChoiceServiceImpl.findByName(name, page, limit);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",countdata.size());
        map.put("data",data);
        return map;
    }
	
	@RequestMapping("/findByTwo")
    public @ResponseBody Map<String,Object> findByTwo(@RequestParam(defaultValue="0")int page, @RequestParam(defaultValue="5")int limit, String typename,String typename2){
        List<MultipleChoice> countdata = multipleChoiceServiceImpl.findAllByTwo(typename,typename2);
        List<MultipleChoice> data = multipleChoiceServiceImpl.findByTwo(typename,typename2, page, limit);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",countdata.size());
        map.put("data",data);
        return map;
    }
	
	@RequestMapping("findOne")
	public @ResponseBody Map<String,Object> findOne(Integer titleid) {
		Map<String,Object> map = new HashMap<String,Object>();
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
