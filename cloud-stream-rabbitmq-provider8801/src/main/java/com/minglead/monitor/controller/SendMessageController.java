package com.minglead.monitor.controller;

import com.minglead.monitor.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * All rights Reserved, Designed By www.minglead.com
 *
 * @Title: SendMessageController
 * @Package com.minglead.monitor.controller
 * @Description:
 * @author: luo.gl
 * @date: 2020-09-03 10:17
 * @Copyright: www.minglead.com Inc. All rights reserved.
 * 注意：本内容仅限于广州市明领信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
@RestController
public class SendMessageController
{
    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage()
    {
        return messageProvider.send();
    }

}


