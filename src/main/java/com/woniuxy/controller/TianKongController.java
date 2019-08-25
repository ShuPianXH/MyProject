package com.woniuxy.controller;

import com.woniuxy.pojo.PageBean;
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
    private ITiankongService tiankongService;

    @RequestMapping("findAll")
    public @ResponseBody Map findAll(@RequestParam(defaultValue="0")int page, @RequestParam(defaultValue="5")int limit) {
        List<Tiankong> countdata = tiankongService.findAll();
        List<Tiankong> data = tiankongService.findByPage(page,limit);
        Map<String,Object> map = new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",countdata.size());
        map.put("data",data);
        return map;
    }

    @RequestMapping("findByName")
    private @ResponseBody Map findByName(String name,PageBean pageBean){
        Map map = new HashMap();
        map.put("list",tiankongService.findByName(name,pageBean));
        return map;
    }
}
