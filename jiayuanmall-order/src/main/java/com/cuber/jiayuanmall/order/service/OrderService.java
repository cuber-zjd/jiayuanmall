package com.cuber.jiayuanmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cuber.common.utils.PageUtils;
import com.cuber.jiayuanmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author cuber_zjd
 * @email cuber_zjd@gmail.com
 * @date 2022-09-22 22:48:19
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

