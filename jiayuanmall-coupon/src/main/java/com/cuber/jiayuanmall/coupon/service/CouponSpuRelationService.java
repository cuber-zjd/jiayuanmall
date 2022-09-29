package com.cuber.jiayuanmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cuber.common.utils.PageUtils;
import com.cuber.jiayuanmall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author cuber_zjd
 * @email cuber_zjd@gmail.com
 * @date 2022-09-22 22:29:36
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

