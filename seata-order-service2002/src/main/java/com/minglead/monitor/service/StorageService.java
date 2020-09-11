package com.minglead.monitor.service;

/**
 * All rights Reserved, Designed By www.minglead.com
 *
 * @Title: StorageService
 * @Package com.minglead.monitor.service
 * @Description:
 * @author: luo.gl
 * @date: 2020-09-10 15:28
 * @Copyright: www.minglead.com Inc. All rights reserved.
 * 注意：本内容仅限于广州市明领信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public interface StorageService {

    // 扣减库存
    void decrease(Long productId, Integer count);

}
