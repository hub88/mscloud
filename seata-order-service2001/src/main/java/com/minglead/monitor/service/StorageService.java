package com.minglead.monitor.service;

import com.minglead.monitor.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * All rights Reserved, Designed By www.minglead.com
 *
 * @Title: StorageService
 * @Package com.minglead.monitor.service
 * @Description:
 * @author: luo.gl
 * @date: 2020-09-10 15:11
 * @Copyright: www.minglead.com Inc. All rights reserved.
 * 注意：本内容仅限于广州市明领信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService{

    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);

}
