package com.woniuxy.service.impl;

import com.woniuxy.pojo.PageBean;
import com.woniuxy.pojo.TestQuestions;
import com.woniuxy.service.ITestQusetionsService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestQuestionsServiceImpl implements ITestQusetionsService {

   @Override
    public List<TestQuestions> findAll(PageBean pageBean) {
        return null;
    }

    @Override
    public void save(TestQuestions testQuestions) {

    }

    @Override
    public void delete(Integer testQuestionsId) {

    }

    @Override
    public void update(TestQuestions testQuestions) {

    }

    @Override
    public TestQuestions findOne(Integer testQuestionsId) {
        return null;
    }

    @Override
    public List findByZSD(PageBean pageBean, String zsd) {
        return null;
    }
}
