package com.websales.service;


import com.websales.entity.Order;
import com.websales.entity.Product;
import com.websales.service.impl.CartService;

import java.util.List;
import java.util.Map;

public interface IOrderSevice extends IGeneralService<Order, Integer> {
    Order createOrder();
    void addOrderAndOrderDetail(Order o, CartService cart); // thêm mới đơn hàng vào db
    List<Order> getAllOrderByUser();
    Order findById(Integer id);
    Map<Integer, Product> getPurchasedItems();

}
