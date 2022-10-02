package com.websales.service;

import com.websales.entity.Category;

import java.util.List;

public interface ICategoryService extends IGeneralService<Category, Integer>{
    List<Category> getRamDomByCategory();
}
