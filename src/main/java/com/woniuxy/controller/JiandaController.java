package com.woniuxy.controller;

import com.woniuxy.pojo.Jianda;

import com.woniuxy.service.IJianDaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Jianda")
public class JiandaController {
    @Resource
    private IJianDaService jiandaServiceImpl;

    @RequestMapping("/findByType")
    //按科目
    public @ResponseBody Map<String,Object> findByType(@RequestParam(defaultValue="0")int page, @RequestParam(defaultValue="5")int limit,String typename){
    	List<Jianda> countdata = jiandaServiceImpl.findAllByType(typename);
        List<Jianda> data = jiandaServiceImpl.findByType(typename,page,limit);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",countdata.size());
        map.put("data",data);
        return map;
    }

    @RequestMapping("/findByQType")
    //按知识点
    public @ResponseBody Map<String,Object> findByQType(@RequestParam(defaultValue="0")int page, @RequestParam(defaultValue="5")int limit,String typename){
    	List<Jianda> countdata = jiandaServiceImpl.findAllByQType(typename);
        List<Jianda> data = jiandaServiceImpl.findByQType(typename,page,limit);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",countdata.size());
        map.put("data",data);
        return map;
    }

    @RequestMapping("/findAll")
    public @ResponseBody Map<String,Object> findAll(@RequestParam(defaultValue="0")int page, @RequestParam(defaultValue="5")int limit){
        List<Jianda> countdata = jiandaServiceImpl.findAll();
        List<Jianda> data = jiandaServiceImpl.findByName("jianda",page,limit);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",countdata.size());
        map.put("data",data);
        return map;
    }

    @RequestMapping("/findByName")
    public @ResponseBody Map<String,Object> findByName(@RequestParam(defaultValue="0")int page, @RequestParam(defaultValue="5")int limit, String name){
        List<Jianda> countdata = jiandaServiceImpl.findAllByName(name);
        List<Jianda> data = jiandaServiceImpl.findByName(name, page, limit);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",countdata.size());
        map.put("data",data);
        return map;
    }
    
    @RequestMapping("/findByTwo")
    public @ResponseBody Map<String,Object> findByTwo(@RequestParam(defaultValue="0")int page, @RequestParam(defaultValue="5")int limit, String typename, String typename2){
        List<Jianda> countdata = jiandaServiceImpl.findAllByTwo(typename,typename2);
        List<Jianda> data = jiandaServiceImpl.findByTwo(typename,typename2, page, limit);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",countdata.size());
        map.put("data",data);
        return map;
    }

    @RequestMapping("/findOne")
    public @ResponseBody Map<String,Object> findOne(Integer jiandaId){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list",jiandaServiceImpl.findOne(jiandaId));
        return map;
    }
    @RequestMapping("/save")
    public String save(Jianda jianda){
        jiandaServiceImpl.save(jianda);
        return "index";
    }

    @RequestMapping("/update")
    public String update(Jianda jianda){
        jiandaServiceImpl.update(jianda);
        return "index";
    }

    @RequestMapping("/delete")
    public String delete(Integer jiandaId){
        jiandaServiceImpl.delete(jiandaId);
        return "index";
    }
}
