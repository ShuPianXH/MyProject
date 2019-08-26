package com.woniuxy.controller;

import com.woniuxy.pojo.Jianda;
import com.woniuxy.pojo.MultipleChoice;
import com.woniuxy.pojo.Tiankong;
import com.woniuxy.pojo.Trueorfalse;
import com.woniuxy.service.IJianDaService;
import com.woniuxy.service.ITiankongService;
import com.woniuxy.service.ITrueOrFalseService;
import com.woniuxy.service.impl.MultipleChoiceServiceImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;

@Controller
@RequestMapping("/select/")
public class SelectController {
    @Resource
    private IJianDaService jiandaServiceImpl;

    @Resource
    private ITrueOrFalseService trueOrFalseServiceImpl;

    @Resource
    private ITiankongService tiankongServiceImpl;

    @Resource
    private MultipleChoiceServiceImpl multipleChoiceServiceImpl;

    @RequestMapping("findByName")
    public @ResponseBody Map findByName(@RequestParam("coursename")String coursename,
                                        @RequestParam(("kemu")) String kemu,
                                        @RequestParam("Qtype")String Qtype,
                                        @RequestParam(defaultValue="1")Integer page,
                                        @RequestParam(defaultValue="5")Integer limit
                                        ){
        page=(page-1)*limit;
        List<Jianda> countdata = null;
        List<Jianda> data = null;
        if ("选择题".equals(Qtype)) {
//            multipleChoiceServiceImpl.findAllByQType(coursename);
//            multipleChoiceServiceImpl.findByQType(coursename, page, limit);
        }else if ("填空题".equals(Qtype)) {
//            tiankongServiceImpl.findAllByQType(coursename);
//            tiankongServiceImpl.findByQType(coursename, page, limit);
        }else if ("判断题".equals(Qtype)) {
//            countdata = trueOrFalseServiceImpl.findAllByQType(coursename);
//            data =  trueOrFalseServiceImpl.findByQType(coursename, page, limit);
        }else if ("简答题".equals(Qtype)) {
           countdata = jiandaServiceImpl.findAllByName(coursename);
           data = jiandaServiceImpl.findByName(coursename,page,limit);
        }
        System.out.println(page+"   "+limit);
        System.out.println(data.size()+"  "+countdata.size());
        System.out.println(coursename+"  "+Qtype+"  "+kemu);
        Map<String,Object> map = new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",countdata.size());
        map.put("data",data);
        return map;
    }
}
