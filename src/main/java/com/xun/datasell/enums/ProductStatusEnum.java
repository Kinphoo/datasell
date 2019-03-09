package com.xun.datasell.enums;

import lombok.Getter;

@Getter
public enum ProductStatusEnum {

    UP(0, "已上架"),
    DOWN(1, "已下架");

    private Integer code;
    private String messgae;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.messgae = message;
    }
}
