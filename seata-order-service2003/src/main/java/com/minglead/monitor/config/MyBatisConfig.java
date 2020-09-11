package com.minglead.monitor.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * All rights Reserved, Designed By www.minglead.com
 *
 * @Title: MyBatisConfig
 * @Package com.minglead.monitor.config
 * @Description:
 * @author: luo.gl
 * @date: 2020-09-10 15:49
 * @Copyright: www.minglead.com Inc. All rights reserved.
 * 注意：本内容仅限于广州市明领信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
@Configuration
@MapperScan({"com.minglead.monitor.dao"})
public class MyBatisConfig {
}
