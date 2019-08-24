package com.woniuxy.service;

import com.woniuxy.pojo.PageBean;
import com.woniuxy.pojo.TestQuestions;

import java.util.List;

public interface ITestQusetionsService {
    List<TestQuestions> findAll(PageBean pageBean);
    void save(TestQuestions testQuestions);
    void delete(Integer testQuestionsId);
    void update(TestQuestions testQuestions);
    TestQuestions findOne(Integer testQuestionsId);
    List findByZSD(PageBean pageBean, String zsd);
}
