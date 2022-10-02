package com.websales.dao;

import com.websales.entity.Customer;
import com.websales.entity.Order;
import com.websales.service.impl.CartService;

import java.util.List;

public interface IOrderDAO extends IGeneralDAO<Order, Integer>{
    void create(Order o, CartService cart);
    List<Order> findByUser(Customer user);
}
