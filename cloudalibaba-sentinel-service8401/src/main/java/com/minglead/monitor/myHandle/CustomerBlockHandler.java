package com.minglead.monitor.myHandle;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.minglead.monitor.entities.CommonResult;

/**
 * All rights Reserved, Designed By www.minglead.com
 *
 * @Title: CustomerBlockHandler
 * @Package com.minglead.monitor.myHandle
 * @Description:
 * @author: luo.gl
 * @date: 2020-09-07 15:42
 * @Copyright: www.minglead.com Inc. All rights reserved.
 * 注意：本内容仅限于广州市明领信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");

    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler2");

    }
}

