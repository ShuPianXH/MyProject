package com.woniuxy.controller;

import com.woniuxy.pojo.PageBean;
import com.woniuxy.pojo.TestQuestions;
import com.woniuxy.service.ITestQusetionsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("TestQuestions")
public class TestQuestionsController {
    @Resource
    private ITestQusetionsService testQusetionsServiceImpl;

    @RequestMapping("findByZSD")//按知识点查找
    public @ResponseBody Map findByZSD(PageBean pageBean,String ZSD){
        Map map = new HashMap();
        map.put("list",testQusetionsServiceImpl.findByZSD(pageBean,ZSD));
        return map;
    }

    @RequestMapping("findAll")
    public @ResponseBody Map fiindAll(PageBean pageBean){
        Map map = new HashMap();
        map.put("list",testQusetionsServiceImpl.findAll(pageBean));
        return map;
    }

    @RequestMapping("findOne")
    public @ResponseBody Map fiindOne(Integer testQuestionId){
        Map map = new HashMap();
        map.put("list",testQusetionsServiceImpl.findOne(testQuestionId));
        return map;
    }

    @RequestMapping("save")
    public String save(TestQuestions testQuestions){
        testQusetionsServiceImpl.save(testQuestions);
        return "idex";
    }

    @RequestMapping("delete")
    public String delete(Integer testQuestionsId){
        testQusetionsServiceImpl.delete(testQuestionsId);
        return "idex";
    }

    @RequestMapping("update")
    public String update(TestQuestions testQuestions){
        testQusetionsServiceImpl.update(testQuestions);
        return "idex";
    }

}
