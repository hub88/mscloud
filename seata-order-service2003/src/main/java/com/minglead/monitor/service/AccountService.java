package com.minglead.monitor.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * All rights Reserved, Designed By www.minglead.com
 *
 * @Title: AccountService
 * @Package com.minglead.monitor.service
 * @Description:
 * @author: luo.gl
 * @date: 2020-09-10 15:44
 * @Copyright: www.minglead.com Inc. All rights reserved.
 * 注意：本内容仅限于广州市明领信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public interface AccountService {

    /**
     * 扣减账户余额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
