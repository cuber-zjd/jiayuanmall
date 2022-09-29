package com.cuber.jiayuanmall.member.dao;

import com.cuber.jiayuanmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author cuber_zjd
 * @email cuber_zjd@gmail.com
 * @date 2022-09-22 22:39:20
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
