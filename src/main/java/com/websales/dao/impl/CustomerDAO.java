package com.websales.dao.impl;

import com.websales.dao.ICustomerDAO;
import com.websales.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAO extends GeneraDAO<Customer, String> implements ICustomerDAO {
    @Override
    public List<Customer> findByRoles(boolean roles) {
        String sql = "From Customer c WHERE c.admin =?0";
        return this.getResultList(sql, roles);
    }
}
