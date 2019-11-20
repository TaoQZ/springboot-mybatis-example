package xyz.taoqz.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.taoqz.domain.Category;
import xyz.taoqz.mapper.CategoryMapper;

import javax.annotation.Resource;
@Service
@Transactional
public class CategoryService{

    @Resource
    private CategoryMapper categoryMapper;

    public void add(Category category) {
        categoryMapper.insert(category);
    }
}
