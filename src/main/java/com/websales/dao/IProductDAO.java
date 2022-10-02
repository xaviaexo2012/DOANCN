package com.websales.dao;

import com.websales.entity.Product;

import java.util.List;

public interface IProductDAO  extends IGeneralDAO<Product, Integer>{
    List<Product> findByKeywords(String keywords);
    List<Product> findByCategoryId(Integer id);
    List<Product> findItemByHot(String key);
    List<Product> findByIdsInCookie(String id);
}
