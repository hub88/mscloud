package com.minglead.monitor.service.impl;

import com.minglead.monitor.entities.CommonResult;
import com.minglead.monitor.entities.Payment;
import com.minglead.monitor.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * All rights Reserved, Designed By www.minglead.com
 *
 * @Title: PaymentFallbackService
 * @Package com.minglead.monitor.service.impl
 * @Description:
 * @author: luo.gl
 * @date: 2020-09-07 16:33
 * @Copyright: www.minglead.com Inc. All rights reserved.
 * 注意：本内容仅限于广州市明领信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}

