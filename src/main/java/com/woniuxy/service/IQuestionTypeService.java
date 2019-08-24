package com.woniuxy.service;

import com.woniuxy.pojo.QuestionType;

import java.util.List;

public interface IQuestionTypeService {
    List<QuestionType> findAll();
    void save(QuestionType questionType);
    void delete(Integer questionTypeId);
    void update(QuestionType questionType);
    QuestionType findOne(Integer questionTypeId);
}
