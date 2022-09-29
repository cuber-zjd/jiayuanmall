package com.cuber.jiayuanmall.member.feigh;

import com.cuber.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cuber
 * @create 2022/9/25 23:30
 */
@FeignClient("jiayuanmall-coupon")
public interface CouponbFeignService {

   /**
     * 会员优惠券
     *
     * @return {@link R}
     * @params
     * @date 2022/09/25
     */
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();

}
