package com.atyyx.mybatis_plus_datasource.Enum;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @author yyx
 * @version 1.0
 * @date 2022/8/14 0:42
 */
public enum Sex {
    Boy(1,"男"),
    Gril(0,"女");

    @EnumValue
    private Integer gender;
    private String genderName;

    Sex(Integer gender, String genderName) {
        this.gender = gender;
        this.genderName = genderName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }
}
