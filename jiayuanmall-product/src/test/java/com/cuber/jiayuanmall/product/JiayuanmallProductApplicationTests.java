package com.cuber.jiayuanmall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cuber.jiayuanmall.product.entity.BrandEntity;
import com.cuber.jiayuanmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JiayuanmallProductApplicationTests {

	@Autowired
	private BrandService brandService;

	@Test
	public void contextLoads() {
//		BrandEntity brandEntity=new BrandEntity();
//		brandEntity.setBrandId(1L);
//
//		brandEntity.setDescript("huawei");
//		brandEntity.setName("华为");
//		brandService.save(brandEntity);
//
//		brandService.updateById(brandEntity);

		List<BrandEntity> brands = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
		brands.forEach((item)->{
			System.out.println(item);
		});
	}

}
