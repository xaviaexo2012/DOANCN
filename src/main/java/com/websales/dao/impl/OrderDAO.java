package com.websales.dao.impl;

import com.websales.dao.IOrderDAO;
import com.websales.dao.IOrderDetailDAO;
import com.websales.entity.Customer;
import com.websales.entity.Order;
import com.websales.entity.OrderDetail;
import com.websales.entity.Product;
import com.websales.service.impl.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public class OrderDAO extends GeneraDAO<Order, Integer> implements IOrderDAO {
    @Autowired
    private IOrderDetailDAO dao;

    @Override
    public void create(Order o, CartService cart) {
        this.create(o);
        Collection<Product> items = cart.getItemsCart();
        items.forEach(p -> {
            OrderDetail detail = new OrderDetail();
            detail.setOrder(o);
            detail.setProduct(p);
            detail.setUnitPrice(p.getUnitPrice());
            detail.setDiscount(p.getDiscount());
            detail.setQuantity(p.getQuantity());
            dao.create(detail);
        });

    }

    @Override
    public List<Order> findByUser(Customer user) {
        String sql = "FROM Order o WHERE o.customer.id=?0 ORDER BY o.orderDate DESC";
        return this.getResultList(sql, user.getId());
    }
}
