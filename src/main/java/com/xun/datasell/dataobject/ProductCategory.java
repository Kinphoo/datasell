package com.xun.datasell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DynamicUpdate
@Data
public class ProductCategory {
    @Id // 主键
    @GeneratedValue
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;
}
