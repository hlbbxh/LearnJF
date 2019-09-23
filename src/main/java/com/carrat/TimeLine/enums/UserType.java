package com.carrat.TimeLine.enums;

public enum UserType {
    
    USER(0), // 用户
    CUSTOMER(1), // 客户
    SYSTEM(2); // 系统
    
    private UserType(Integer type) {
        this.type = type;
    }
    
    private Integer type;
    
    public Integer getType() {
        return type;
    }
}
