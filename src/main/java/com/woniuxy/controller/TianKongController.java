package com.woniuxy.controller;

import com.woniuxy.pojo.Tiankong;
import com.woniuxy.service.ITiankongService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/tiankong/")
public class TianKongController {

	@Resource
	private ITiankongService tiankongServiceImpl;

	@RequestMapping("findByQType")
	public @ResponseBody Map<String,Object> findByQType(@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "5") int limit, String typename) {
		List<Tiankong> countdata = tiankongServiceImpl.findAllByQType(typename);
		List<Tiankong> data = tiankongServiceImpl.findByQType(typename, (page-1)*limit, limit);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", countdata.size());
		map.put("data", data);
		return map;
	}

	@RequestMapping("findByType")
	public @ResponseBody Map<String,Object> findByType(@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "5") int limit, String typename) {
		List<Tiankong> countdata = tiankongServiceImpl.findAllByType(typename);
		List<Tiankong> data = tiankongServiceImpl.findByQType(typename, (page-1)*limit, limit);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", countdata.size());
		map.put("data", data);
		return map;
	}

	@RequestMapping("findAll")
	public @ResponseBody Map<String,Object> findAll(@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "5") int limit) {
		List<Tiankong> countdata = tiankongServiceImpl.findAll();
		List<Tiankong> data = tiankongServiceImpl.findByPage((page-1)*limit, limit);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", countdata.size());
		map.put("data", data);
		return map;
	}

	@RequestMapping("/findByName")
	public @ResponseBody Map<String, Object> findByName(@RequestParam(defaultValue = "1") int page,@RequestParam(defaultValue = "5") int limit, String name) {
		List<Tiankong> countdata = tiankongServiceImpl.findAllByName(name);
		List<Tiankong> data = tiankongServiceImpl.findByName(name, (page-1)*limit, limit);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", countdata.size());
		map.put("data", data);
		return map;
	}
	
	@RequestMapping("/findByTwo")
	public @ResponseBody Map<String, Object> findByTwo(@RequestParam(defaultValue = "1") int page,@RequestParam(defaultValue = "5") int limit, String typename,String typename2) {
		List<Tiankong> countdata = tiankongServiceImpl.findAllByTwo(typename,typename2);
		List<Tiankong> data = tiankongServiceImpl.findByTwo(typename,typename2, (page-1)*limit, limit);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", countdata.size());
		map.put("data", data);
		return map;
	}

	@RequestMapping("findOne")
	public @ResponseBody Map<String,Object> findOne(Integer tkid) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("mc", tiankongServiceImpl.findOne(tkid));
		return map;
	}

	@RequestMapping("save")
	public String save(Tiankong tk) {
		tiankongServiceImpl.save(tk);
		return "findAll";
	}

	@RequestMapping("delete")
	public String delete(Integer tkid) {
		tiankongServiceImpl.delete(tkid);
		return "findAll";
	}

	@RequestMapping("update")
	public String update(Tiankong tk) {
		tiankongServiceImpl.update(tk);
		return "findAll";
	}
}
