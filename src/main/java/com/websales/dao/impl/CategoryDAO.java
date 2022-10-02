package com.websales.dao.impl;

import com.websales.dao.ICategoryDAO;
import com.websales.entity.Category;
import org.springframework.stereotype.Repository;


@Repository
public class CategoryDAO extends GeneraDAO<Category, Integer> implements ICategoryDAO {

}
