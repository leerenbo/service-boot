package com.yibaijin.service.boot.web.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class TestRequest {
    private Boolean bool;
    private Byte i8;
    private Short i16;
    @ApiModelProperty(value = "整型", required = true)
    @Min(100l)
    private Integer i32 = 1;
    @Max(999l)
    private Long i64;
    @NotNull
    private Float f32;
    private Double f64;
    @ApiModelProperty(value = "字符串类型", example = "asdf")
    private String str;

    public Boolean getBool() {
        return bool;
    }

    public void setBool(Boolean bool) {
        this.bool = bool;
    }

    public Byte getI8() {
        return i8;
    }

    public void setI8(Byte i8) {
        this.i8 = i8;
    }

    public Short getI16() {
        return i16;
    }

    public void setI16(Short i16) {
        this.i16 = i16;
    }

    public Integer getI32() {
        return i32;
    }

    public void setI32(Integer i32) {
        this.i32 = i32;
    }

    public Long getI64() {
        return i64;
    }

    public void setI64(Long i64) {
        this.i64 = i64;
    }

    public Float getF32() {
        return f32;
    }

    public void setF32(Float f32) {
        this.f32 = f32;
    }

    public Double getF64() {
        return f64;
    }

    public void setF64(Double f64) {
        this.f64 = f64;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
