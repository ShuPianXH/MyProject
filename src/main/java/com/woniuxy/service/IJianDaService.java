package com.woniuxy.service;

import com.woniuxy.pojo.Jianda;

import java.util.List;

public interface IJianDaService {
    List<Jianda> findAll();
    void save(Jianda jd);
    void delete(Integer jiandaId);
    void update(Jianda jd);
    Jianda findOne(Integer jiandaId);
}
