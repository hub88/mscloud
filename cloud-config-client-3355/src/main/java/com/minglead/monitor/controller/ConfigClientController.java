package com.minglead.monitor.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * All rights Reserved, Designed By www.minglead.com
 *
 * @Title: ConfigClientController
 * @Package com.minglead.monitor.controller
 * @Description:
 * @author: luo.gl
 * @date: 2020-09-02 10:01
 * @Copyright: www.minglead.com Inc. All rights reserved.
 * 注意：本内容仅限于广州市明领信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;  //要访问的3344上的信息

    @GetMapping("/configInfo")	//请求地址
    public String getConfigInfo(){
        return configInfo;
    }
}