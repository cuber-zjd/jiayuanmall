package com.cuber.jiayuanmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cuber.common.utils.PageUtils;
import com.cuber.jiayuanmall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author cuber_zjd
 * @email cuber_zjd@gmail.com
 * @date 2022-09-22 22:29:36
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

