package com.minglead.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * All rights Reserved, Designed By www.minglead.com
 *
 * @Title: OrderNacosMain84
 * @Package com.minglead.monitor
 * @Description:
 * @author: luo.gl
 * @date: 2020-09-07 16:15
 * @Copyright: www.minglead.com Inc. All rights reserved.
 * 注意：本内容仅限于广州市明领信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain84 {

    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain84.class,args);
    }

}
