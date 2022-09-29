package com.cuber.jiayuanmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cuber.common.utils.PageUtils;
import com.cuber.jiayuanmall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author cuber_zjd
 * @email cuber_zjd@gmail.com
 * @date 2022-09-22 22:52:31
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

