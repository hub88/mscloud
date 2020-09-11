package com.minglead.monitor.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * All rights Reserved, Designed By www.minglead.com
 *
 * @Title: AccountDao
 * @Package com.minglead.monitor.dao
 * @Description:
 * @author: luo.gl
 * @date: 2020-09-10 15:41
 * @Copyright: www.minglead.com Inc. All rights reserved.
 * 注意：本内容仅限于广州市明领信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
@Mapper
public interface AccountDao {

    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
