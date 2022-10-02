package com.websales.dao.impl;

import com.websales.dao.IOrderDetailDAO;
import com.websales.entity.OrderDetail;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailDAO extends GeneraDAO<OrderDetail, Integer> implements IOrderDetailDAO {
}
