package com.websales.service;


import com.websales.entity.Product;

import java.util.List;

public interface IProductService extends IGeneralService<Product, Integer> {
    List<Product> findByKeywords(String keyWords);
    List<Product> findAllProductByCategory(int id);
    List<Product> findByHot(String key);
    List<Product>  getViewProduct(String name,String id); //  get những sản phẩm da xem thông qua mảng id sp trong Cookie
    List<Product>  getFaVoProduct(String name,String id); // get những sản phẩm yêu thích thông qua mảng id sp trong Cookie
    List<Product>  findByIdsInCookie(String ids);
}
