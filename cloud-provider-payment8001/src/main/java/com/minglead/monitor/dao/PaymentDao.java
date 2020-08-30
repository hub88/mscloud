package com.minglead.monitor.dao;

import com.minglead.monitor.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读
}
