package com.websales.service;

import com.websales.entity.Product;

import java.util.Collection;

public interface ICartService {
    void addCart(Integer id);
    void removeCart(Integer id);
    void updateCart(Integer id, int qty);
    void clear();
    int getCountCart();
    double getAmountCart();
    Collection<Product> getItemsCart();
}
