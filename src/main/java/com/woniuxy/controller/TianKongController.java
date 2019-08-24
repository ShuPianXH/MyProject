package com.woniuxy.controller;

import com.woniuxy.pojo.PageBean;
import com.woniuxy.service.ITiankongService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("tiankong")
public class TianKongController {

    @Resource
    private ITiankongService tiankongService;

    @RequestMapping("findAll")
    private @ResponseBody Map findAll(PageBean pageBean){
        Map map = new HashMap();
        map.put("list",tiankongService.findAll(pageBean));
        return map;
    }

    @RequestMapping("findByName")
    private @ResponseBody Map findByName(String name,PageBean pageBean){
        Map map = new HashMap();
        map.put("list",tiankongService.findByName(name,pageBean));
        return map;
    }
}
