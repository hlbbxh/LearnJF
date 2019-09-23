package com.carrat.TimeLine.core;

import java.io.File;

import com.carrat.TimeLine.utils.PropertyUtil;

/**
 * @author 所以的常量 都可以声明在这里面
 *
 */
public class Constant {
    public static String DATA_UPLOAD = PropertyUtil.getProperty("file.upload");//获取属性文件的值  文件的地址
    private static final String OS_NAME = System.getProperty("os.name").toLowerCase();//获取操作系统 
    static {
        if (OS_NAME.indexOf("windows") > -1) {
            DATA_UPLOAD = "D:" + File.separator + "data" + File.separator + "upload" + File.separator;//如果是windows 获取windows// 生产目录
        }
    }
    public static String JPG_EXTENSION = "jpg"; //jpg文件后缀
}
