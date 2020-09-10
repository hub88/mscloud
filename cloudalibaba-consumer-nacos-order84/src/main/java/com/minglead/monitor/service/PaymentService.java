package com.minglead.monitor.service;

import com.minglead.monitor.entities.CommonResult;
import com.minglead.monitor.entities.Payment;
import com.minglead.monitor.service.impl.PaymentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * All rights Reserved, Designed By www.minglead.com
 *
 * @Title: PaymentService
 * @Package com.minglead.monitor.service
 * @Description:
 * @author: luo.gl
 * @date: 2020-09-07 16:31
 * @Copyright: www.minglead.com Inc. All rights reserved.
 * 注意：本内容仅限于广州市明领信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService
{
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}

