package com.websales.service.impl;


import com.websales.dao.ICustomerDAO;
import com.websales.entity.Customer;
import com.websales.service.IAccountService;
import com.websales.service.IHttpService;
import com.websales.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService extends GeneralService<Customer, String> implements IAccountService {

    @Autowired
    private ICustomerDAO dao;

    @Autowired
    private IHttpService http;

    @Autowired
    private IMailService mailer;

    @Override
    public Customer findById(String id) {
        return dao.findById(id);
    }

    @Override
    public void updateUser(Customer user) {
        dao.update(user);
    }

    @Override
    public boolean sendActivedUser(Customer user) {
        String to = user.getEmail();
        String subject = "Welcome to WEB SALES ";
        String url = http.getCurrentUrl().replace("register", "activate/" + http.encode(user.getId()));
        String body = "<a href='" + url + "'>Click to activate your account!</a>";
        return mailer.send(to, subject, body);
    }

    @Override
    public List<Customer> findByRoles(boolean roles) {
        return dao.findByRoles(roles);
    }

}
