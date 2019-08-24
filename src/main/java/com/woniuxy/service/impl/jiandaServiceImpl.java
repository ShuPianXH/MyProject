package com.woniuxy.service.impl;

import com.woniuxy.mapper.JiandaMapper;
import com.woniuxy.pojo.Jianda;
import com.woniuxy.pojo.PageBean;
import com.woniuxy.pojo.QuestionType;
import com.woniuxy.service.IJianDaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class jiandaServiceImpl implements IJianDaService {
    @Resource
    private JiandaMapper jiandaMapper;

    @Override
    public List<Jianda> findAll() {
        List<Jianda> list = jiandaMapper.findAll();
        System.out.println(list.size());
        return jiandaMapper.findAll();
    }

    @Override
    public List<Jianda> findByPage(Integer page,Integer limit) {
        List<Jianda> list = jiandaMapper.findByPage(page,limit);
        System.out.println(list.size());
        return jiandaMapper.findByPage(page,limit);
    }

    @Override
    public void save(Jianda jd) {

    }

    @Override
    public void delete(Integer jiandaId) {

    }

    @Override
    public void update(Jianda jd) {

    }

    @Override
    public Jianda findOne(Integer jiandaId) {
        return null;
    }

    @Override
    public List findByType(PageBean pageBean, QuestionType typename) {
        return null;
    }

    @Override
    public List findByQType(PageBean pageBean, String typename) {
        return null;
    }

    @Override
    public List<Jianda> findByName(String name, PageBean pageBean) {
        return null;
    }
}
