package com.woniuxy.controller;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/select/")
public class selectController {
//    @Resource
//    private IJianDaService iJianDaService;
//    @Resource
//    private IMultipleChoiceService iMultipleChoiceService;
//    @Resource
//    private IQuestionTypeService iQuestionTypeService;
//    @Resource
//    private ITestQusetionsService iTestQusetionsService;
//    @Resource
//    private ITiankongService iTiankongService;
//    @Resource
//    private ITrueOrFalseService iTrueOrFalseService;

    @RequestMapping("findByName")
    public @ResponseBody Map findByName(@Param("courseid") String coursename ){
        System.out.println(coursename);
        Map map = new HashMap();
        return map;
    }
}
