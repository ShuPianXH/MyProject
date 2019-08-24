package com.woniuxy.controller;

import com.woniuxy.pojo.Jianda;
import com.woniuxy.pojo.PageBean;
import com.woniuxy.pojo.QuestionType;
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
    public @ResponseBody Map findByType(PageBean pageBean, QuestionType typename){
        Map map = new HashMap();
        map.put("list",jiandaServiceImpl.findByType( pageBean,typename));
        return map;
    }

    @RequestMapping("/findByQType")
    //按知识点
    public @ResponseBody Map findByQType(PageBean pageBean,String ZSD){
        Map map = new HashMap();
        map.put("list",jiandaServiceImpl.findByQType( pageBean,ZSD));
        return map;
    }

    @RequestMapping("/findAll")
    public @ResponseBody Map<String,Object> findAll(@RequestParam(defaultValue="0")int page, @RequestParam(defaultValue="5")int limit){
        List<Jianda> countdata = jiandaServiceImpl.findAll();
        List<Jianda> data = jiandaServiceImpl.findByPage(page,limit);
        Map<String,Object> map = new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",countdata.size());
        map.put("data",data);
        return map;
    }


    @RequestMapping("findByName")
    public @ResponseBody Map findByName(String name,PageBean pageBean){
        Map map = new HashMap();
        map.put("list",jiandaServiceImpl.findByName(name,pageBean));
        return map;
    }

    @RequestMapping("findOne")
    public @ResponseBody Map findOne(Integer jiandaId){
        Map map = new HashMap();
        map.put("list",jiandaServiceImpl.findOne(jiandaId));
        return map;
    }
    @RequestMapping("save")
    public String save(Jianda jianda){
        jiandaServiceImpl.save(jianda);
        return "index";
    }

    @RequestMapping("update")
    public String update(Jianda jianda){
        jiandaServiceImpl.update(jianda);
        return "index";
    }

    @RequestMapping("delete")
    public String delete(Integer jiandaId){
        jiandaServiceImpl.delete(jiandaId);
        return "index";
    }
}
