package com.minglead.monitor.controller;

import com.minglead.monitor.domain.CommonResult;
import com.minglead.monitor.domain.Order;
import com.minglead.monitor.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * All rights Reserved, Designed By www.minglead.com
 *
 * @Title: OrderController
 * @Package com.minglead.monitor.controller
 * @Description:
 * @author: luo.gl
 * @date: 2020-09-10 15:13
 * @Copyright: www.minglead.com Inc. All rights reserved.
 * 注意：本内容仅限于广州市明领信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
@RestController
public class OrderController{

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}