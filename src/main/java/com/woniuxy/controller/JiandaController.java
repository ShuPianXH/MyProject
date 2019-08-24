package com.woniuxy.controller;

import com.woniuxy.pojo.Jianda;
import com.woniuxy.pojo.PageBean;
import com.woniuxy.pojo.QuestionType;
import com.woniuxy.service.IJianDaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("Jianda")
public class JiandaController {
    @Resource
    private IJianDaService jianDaServiceImpl;

    @RequestMapping("findByType")
    //按科目
    public @ResponseBody Map findByType(PageBean pageBean, QuestionType typename){
        Map map = new HashMap();
        map.put("list",jianDaServiceImpl.findByType( pageBean,typename));
        return map;
    }

    @RequestMapping("findByQType")
    //按知识点
    public @ResponseBody Map findByQType(PageBean pageBean,String ZSD){
        Map map = new HashMap();
        map.put("list",jianDaServiceImpl.findByQType( pageBean,ZSD));
        return map;
    }

    @RequestMapping("findAll")
    public @ResponseBody Map findAll(PageBean pageBean){
        Map map = new HashMap();
        map.put("list",jianDaServiceImpl.findAll(pageBean));
        return map;
    }
    @RequestMapping("findOne")
    public @ResponseBody Map findOne(Integer jiandaId){
        Map map = new HashMap();
        map.put("list",jianDaServiceImpl.findOne(jiandaId));
        return map;
    }
    @RequestMapping("save")
    public String save(Jianda jianda){
        jianDaServiceImpl.save(jianda);
        return "index";
    }

    @RequestMapping("update")
    public String update(Jianda jianda){
        jianDaServiceImpl.update(jianda);
        return "index";
    }

    @RequestMapping("delete")
    public String delete(Integer jiandaId){
        jianDaServiceImpl.delete(jiandaId);
        return "index";
    }
}
