package com.woniuxy.service.impl;

import com.woniuxy.pojo.Trueorfalse;
import com.woniuxy.service.ITrueOrFalseService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrueOrFalseServiceImpl implements ITrueOrFalseService {
    @Override
    public List<Trueorfalse> findAll() {
        return null;
    }

    @Override
    public void save(Trueorfalse trueorfalse) {

    }

    @Override
    public void delete(Integer trueorfalseid) {

    }

    @Override
    public void update(Trueorfalse trueorfalse) {

    }

    @Override
    public Trueorfalse findOne(Integer trueorfalseid) {
        return null;
    }
}
