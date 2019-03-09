package com.xun.datasell.vo;

import lombok.Data;

@Data
public class ResultVo<T> {
    private int code;
    private String msg;
    private T data;
}
