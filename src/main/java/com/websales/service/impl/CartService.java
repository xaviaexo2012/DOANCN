package com.websales.service.impl;

import com.websales.dao.IProductDAO;
import com.websales.entity.Product;
import com.websales.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@SessionScope
@Service("cart")
public class CartService implements ICartService {
    @Autowired
    private IProductDAO daoProduct;

    Map<Integer, Product> map = new HashMap<Integer, Product>();

    @Override
    public void addCart(Integer id) {
        Product p = map.get(id);
        if (p != null) {
            p.setQuantity(p.getQuantity() + 1);
        } else {
            p = daoProduct.findById(id);
            p.setQuantity(1);
            map.put(id, p);
        }
    }


    @Override
    public void removeCart(Integer id) {
        map.remove(id);
    }


    @Override
    public void updateCart(Integer id, int qty) {
        Product product = map.get(id);
        product.setQuantity(qty);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public int getCountCart() {
        Collection<Product> product = this.getItemsCart();
        int count = 0;
        for (Product p : product) {
            count += p.getQuantity();
        }
        return count;
    }

    @Override
    public double getAmountCart() {
        Collection<Product> ps = this.getItemsCart();
        double amount = 0;
        for (Product product : ps) {
            amount += (product.getQuantity() * (product.getUnitPrice() - (product.getUnitPrice() * product.getDiscount())));
        }
        return amount;
    }


    @Override
    public Collection<Product> getItemsCart() {
        return map.values();
    }


}
