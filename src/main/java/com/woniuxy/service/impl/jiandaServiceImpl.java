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
        return jiandaMapper.findAll();
    }

    @Override
    public List<Jianda> findByPage(Integer page,Integer limit) {
        List<Jianda> list = jiandaMapper.findByPage(page,limit);
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
	public List<Jianda> findAllByType(String typename) {
		// TODO Auto-generated method stub
		return jiandaMapper.findAllByType(typename);
	}

	@Override
	public List<Jianda> findByType(String typename, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return jiandaMapper.findByType(typename, page, limit);
	}
	@Override
	public List<Jianda> findAllByQType(String typename) {
		// TODO Auto-generated method stub
		return jiandaMapper.findAllByQType(typename);
	}

	@Override
	public List<Jianda> findByQType(String typename, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return jiandaMapper.findByQType(typename, page, limit);
	}

	@Override
	public List<Jianda> findAllByName(String name) {
		// TODO Auto-generated method stub
		List l = jiandaMapper.findAllByName(name);

		return jiandaMapper.findAllByName(name);
	}

	@Override
	public List<Jianda> findByName(String name, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		System.out.println(name+"  "+page+limit);
		return jiandaMapper.findByName(name, page, limit);
	}

	@Override
	public List<Jianda> findAllByTwo(String typename, String typename2) {
		// TODO Auto-generated method stub
		return jiandaMapper.findAllByTwo(typename, typename2);
	}

	@Override
	public List<Jianda> findByTwo(String typename, String typename2, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return jiandaMapper.findByTwo(typename, typename2, page, limit);
	}
}
