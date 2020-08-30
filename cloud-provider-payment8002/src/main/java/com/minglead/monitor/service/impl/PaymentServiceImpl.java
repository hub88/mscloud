package com.minglead.monitor.service.impl;

import com.minglead.monitor.dao.PaymentDao;
import com.minglead.monitor.entities.Payment;
import com.minglead.monitor.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById( Long id){

        return paymentDao.getPaymentById(id);

    }
}

