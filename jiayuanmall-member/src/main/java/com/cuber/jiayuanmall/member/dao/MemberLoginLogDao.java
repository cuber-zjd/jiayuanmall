package com.cuber.jiayuanmall.member.dao;

import com.cuber.jiayuanmall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author cuber_zjd
 * @email cuber_zjd@gmail.com
 * @date 2022-09-22 22:39:20
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
