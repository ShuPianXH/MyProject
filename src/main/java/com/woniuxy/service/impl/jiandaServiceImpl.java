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
    	jiandaMapper.insertSelective(jd);
    }

    @Override
    public void delete(Integer jiandaId) {
    	jiandaMapper.deleteByPrimaryKey(jiandaId);
    }

    @Override
    public void update(Jianda jd) {
    	jiandaMapper.updateByPrimaryKeySelective(jd);
    }

    @Override
    public Jianda findOne(Integer jiandaId) {
        return jiandaMapper.selectByPrimaryKey(jiandaId);
    }


	@Override
	public List<Jianda> findAllByType(String typeName) {
		// TODO Auto-generated method stub
		return jiandaMapper.findAllByType(typeName);
	}

	@Override
	public List<Jianda> findByType(String typeName, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return jiandaMapper.findByType(typeName, page, limit);
	}
	@Override
	public List<Jianda> findAllByQType(String typeQname) {
		// TODO Auto-generated method stub
		return jiandaMapper.findAllByQType(typeQname);
	}

	@Override
	public List<Jianda> findByQType(String typeQname, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return jiandaMapper.findByQType(typeQname, page, limit);
	}

	@Override
	public List<Jianda> findAllByName(String name) {
		// TODO Auto-generated method stub
		return jiandaMapper.findAllByName(name);
	}

	@Override
	public List<Jianda> findByName(String name, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return jiandaMapper.findByName(name, page, limit);
	}
}
