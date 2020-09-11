package com.minglead.monitor.dao;

import com.minglead.monitor.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * All rights Reserved, Designed By www.minglead.com
 *
 * @Title: OrderDao
 * @Package com.minglead.monitor.dao
 * @Description:
 * @author: luo.gl
 * @date: 2020-09-10 15:08
 * @Copyright: www.minglead.com Inc. All rights reserved.
 * 注意：本内容仅限于广州市明领信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
@Mapper
public interface OrderDao
{
    //新建订单
    void create(Order order);

    //修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
