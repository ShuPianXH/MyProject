package com.woniuxy.service.impl;

import com.woniuxy.pojo.QuestionType;
import com.woniuxy.service.IQuestionTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionsTypeServiceImpl implements IQuestionTypeService {
    @Override
    public List<QuestionType> findAll() {
        return null;
    }

    @Override
    public void save(QuestionType questionType) {

    }

    @Override
    public void delete(Integer questionTypeId) {

    }

    @Override
    public void update(QuestionType questionType) {

    }

    @Override
    public QuestionType findOne(Integer questionTypeId) {
        return null;
    }
}
