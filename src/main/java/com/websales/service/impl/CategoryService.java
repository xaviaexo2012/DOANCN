package com.websales.service.impl;


import com.websales.dao.ICategoryDAO;
import com.websales.entity.Category;
import com.websales.entity.Product;
import com.websales.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CategoryService extends GeneralService<Category, Integer> implements ICategoryService {
    @Autowired
    private ICategoryDAO dao;

    @Override
    public List<Category> getRamDomByCategory() {
        String hql = "FROM Category c WHERE size(c.products) >=4 ";

        List<Category> list = dao.getResultList(hql);
        Collections.shuffle(list);
        List<Category> result = new ArrayList<Category>();
        for (Category cate : list) {
            List<Product> prods = cate.getProducts();
            if (prods.size() >= 4) {
                Collections.shuffle(prods);
                cate.setProducts(prods.subList(0, 4));
                result.add(cate);
            }
        }
        return list;
    }


}
