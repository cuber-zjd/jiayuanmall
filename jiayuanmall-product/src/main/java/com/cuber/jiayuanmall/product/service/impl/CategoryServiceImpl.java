package com.cuber.jiayuanmall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cuber.common.utils.PageUtils;
import com.cuber.common.utils.Query;

import com.cuber.jiayuanmall.product.dao.CategoryDao;
import com.cuber.jiayuanmall.product.entity.CategoryEntity;
import com.cuber.jiayuanmall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 列表树形结构展示
     *
     * @return {@link @return {@link List }<{@link CategoryEntity }>}
     * @params
     * @date 2022/09/29
     */
    @Override
    public List<CategoryEntity> listWithTree() {
//        查出所有分类
        List<CategoryEntity> categoryEntities = categoryDao.selectList(null);

        List<CategoryEntity> level1Menu = categoryEntities.stream().filter(categoryEntity ->
            categoryEntity.getParentCid() == 0
        ).map((menu)->{
            menu.setChildren(getChildren(menu,categoryEntities));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?9:menu2.getSort());
        }).collect(Collectors.toList());
        return level1Menu;
    }

    /**
     * 获取子分类
     *
     * @return {@link @return {@link List }<{@link CategoryEntity }>}
     * @params
     * @date 2022/09/29
     */
    private List<CategoryEntity> getChildren(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid().equals( root.getCatId());
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getChildren(categoryEntity,all));
            return categoryEntity;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?9:menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }

}