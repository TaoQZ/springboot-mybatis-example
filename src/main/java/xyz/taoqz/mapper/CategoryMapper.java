package xyz.taoqz.mapper;

import tk.mybatis.mapper.common.Mapper;
import xyz.taoqz.domain.Category;

// 注意类上使用的是org.apache.ibatis 添加该注解后springboot自动扫描并管理该bean
//@org.apache.ibatis.annotations.Mapper
// 这里使用在启动类中添加注解进行统一扫描
public interface CategoryMapper extends Mapper<Category> {
}