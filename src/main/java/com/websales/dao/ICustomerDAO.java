package com.websales.dao;

import com.websales.entity.Customer;

import java.util.List;

public interface ICustomerDAO extends IGeneralDAO<Customer, String> {
    List<Customer> findByRoles(boolean roles);

}
