package xyz.taoqz.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// lombok 相关注解
@Data
@AllArgsConstructor
@NoArgsConstructor
// 指定表名
@Table(name = "category")
public class Category {
    // 设置主键id
    @Id
    // 对应列名
    @Column(name = "id")
    // 自增id 在插入后可以通过getId()获取到插入后的id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "`name`")
    private String name;
}