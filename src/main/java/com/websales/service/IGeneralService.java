package com.websales.service;


import java.util.List;

public interface IGeneralService<L,K> {
    L add(L entity);
    void update(L entity);
    void delete(@SuppressWarnings("unchecked") K...ks);
    List<L> findAll();
    L findById(K id);

}
