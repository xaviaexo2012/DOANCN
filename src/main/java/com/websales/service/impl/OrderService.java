package com.websales.service.impl;


import com.websales.dao.IOrderDAO;
import com.websales.dao.IOrderDetailDAO;
import com.websales.entity.Customer;
import com.websales.entity.Order;
import com.websales.entity.OrderDetail;
import com.websales.entity.Product;
import com.websales.service.IOrderSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderService extends GeneralService<Order, Integer> implements IOrderSevice {

    @Autowired
    private CartService cart;

    @Autowired
    private HttpService http;

    @Autowired
    private IOrderDAO orderDAO;

    @Autowired
    private IOrderDetailDAO detailDAO;

    @Override
    public Order createOrder() {
        Customer customer = http.getSession("user");
        Order order = new Order();
        order.setOrderDate(new Date());
        order.setAmount(cart.getAmountCart());
        order.setCustomer(customer);
        return order;
    }

    @Override
    public void addOrderAndOrderDetail(Order o, CartService cart) {
        o.setStatus(1);
        orderDAO.create(o);
        Collection<Product> items = cart.getItemsCart();
        items.forEach(p -> {
            OrderDetail detail = new OrderDetail();
            detail.setOrder(o);
            detail.setProduct(p);
            detail.setUnitPrice(p.getUnitPrice());
            detail.setDiscount(p.getDiscount());
            detail.setQuantity(p.getQuantity());
            detailDAO.create(detail);
        });
    }

    @Override
    public List<Order> getAllOrderByUser() {
        Customer user = http.getSession("user");
        return orderDAO.findByUser(user);
    }

    @Override
    public Order findById(Integer id) {
        return orderDAO.findById(id);
    }

    @Override
    public Map<Integer, Product> getPurchasedItems() {
        Customer user = http.getSession("user");
        List<Order> list = orderDAO.findByUser(user);
        Map<Integer, Product> prods = new HashMap<Integer, Product>();
        list.forEach(order -> {
            order.getOrderDetails().forEach(details -> {
                Product p = details.getProduct();
                prods.put(p.getId(), p);
            });

        });
        return prods;
    }

}
