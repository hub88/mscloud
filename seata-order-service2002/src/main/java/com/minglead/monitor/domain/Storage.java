package com.minglead.monitor.domain;

import lombok.Data;

/**
 * All rights Reserved, Designed By www.minglead.com
 *
 * @Title: Storage
 * @Package com.minglead.monitor.domain
 * @Description:
 * @author: luo.gl
 * @date: 2020-09-10 15:24
 * @Copyright: www.minglead.com Inc. All rights reserved.
 * 注意：本内容仅限于广州市明领信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
@Data
public class Storage {

    private Long id;

    // 产品id
    private Long productId;

    //总库存
    private Integer total;


    //已用库存
    private Integer used;


    //剩余库存
    private Integer residue;
}
