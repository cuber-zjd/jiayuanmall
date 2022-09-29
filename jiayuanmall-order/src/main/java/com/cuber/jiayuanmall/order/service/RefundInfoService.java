package com.cuber.jiayuanmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cuber.common.utils.PageUtils;
import com.cuber.jiayuanmall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author cuber_zjd
 * @email cuber_zjd@gmail.com
 * @date 2022-09-22 22:48:19
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

