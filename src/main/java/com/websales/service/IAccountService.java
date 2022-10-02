package com.websales.service;

import com.websales.entity.Customer;

import java.util.List;

public interface IAccountService extends IGeneralService<Customer, String> {
    boolean sendActivedUser(Customer user);
    void updateUser(Customer user);
    List<Customer> findByRoles(boolean admin);

}
