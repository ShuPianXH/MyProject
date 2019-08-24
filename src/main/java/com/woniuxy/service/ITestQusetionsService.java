package com.woniuxy.service;

import com.woniuxy.pojo.TestQuestions;

import java.util.List;

public interface ITestQusetionsService {
    List<TestQuestions> findAll();
    void save(TestQuestions testQuestions);
    void delete(Integer testQuestionsId);
    void update(TestQuestions testQuestions);
    TestQuestions findOne(Integer testQuestionsId);
}
