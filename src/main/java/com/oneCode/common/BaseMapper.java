package com.oneCode.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Description  通用mapper
 * @Author LXJ
 * @Date 2020/1/9 11:29
 */
public interface BaseMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
