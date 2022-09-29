package com.cuber.jiayuanmall.order.dao;

import com.cuber.jiayuanmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author cuber_zjd
 * @email cuber_zjd@gmail.com
 * @date 2022-09-22 22:48:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
