package com.websales.service.impl;


import com.websales.dao.IGeneralDAO;
import com.websales.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GeneralService<L, K> implements IGeneralService<L, K> {
    @Autowired
    private IGeneralDAO<L, K> dao;

    @Override
    public L add(L entity) {
        return dao.create(entity);
    }

    @Override
    public void update(L entity) {
        dao.update(entity);
    }

    @Override
    public void delete(@SuppressWarnings("unchecked") K... ks) {
        dao.delete(ks);
    }

    @Override
    public List<L> findAll() {
        return dao.findAll();
    }

    @Override
    public L findById(K id) {
        return dao.findById(id);
    }

}