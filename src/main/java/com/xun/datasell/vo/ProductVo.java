package com.xun.datasell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProductVo {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private int categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVo> productInfoVoList;

}
