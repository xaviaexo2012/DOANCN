package com.websales.service.impl;


import com.websales.dao.IReportDAO;
import com.websales.service.IReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService implements IReportService {

    @Autowired
    private IReportDAO dao;

    @Override
    public List<Object[]> inventory() {
        return dao.inventory();
    }

    @Override
    public List<Object[]> revenueByCategory() {
        return dao.revenueByCategory();
    }

    @Override
    public List<Object[]> revenueByCustomer() {
        return dao.revenueByCustomer();
    }

    @Override
    public List<Object[]> revenueByYear() {
        return dao.revenueByYear();
    }

    @Override
    public List<Object[]> revenueByQuarter() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Object[]> revenueByMonth() {
        return dao.revenueByMonth();
    }

    @Override
    public List<Object[]> revenueByProduct(Integer categoryId) {
        return dao.revenueByProduct(categoryId);
    }

}