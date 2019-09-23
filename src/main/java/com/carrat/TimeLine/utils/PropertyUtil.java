package com.carrat.TimeLine.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author DELL 该工具类 会加载 OtherAppConfig.properties文件的所有的属性
 * 
 */
public class PropertyUtil {
    private static final Logger logger = LoggerFactory.getLogger(PropertyUtil.class);//日志处理
    
    private static Properties props;//读取属性文件
    
    synchronized static private void loadProps() {//同步的方法 加载的时候就已经创建了事例
        logger.info("开始加载properties文件内容.......");
        props = new Properties();//new 一个Properties
        InputStream in = null;//输入流
        try {
            in = PropertyUtil.class.getResourceAsStream("/etc/OtherAppConfig.properties");//读取文件的路径
            props.load(in);//load输入流即可
        } catch (FileNotFoundException e) {
            logger.error("app.properties文件未找到");
        } catch (IOException e) {
            logger.error("出现IOException");
        } finally {
            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    logger.error("project.properties文件流关闭出现异常");
                }
            }
        }
        
    }
    
    /**
     * @param 按照属性获取值
     * @return
     */
    public static String getProperty(String key) {
        if (null == props) {
            loadProps();
        }
        return props.getProperty(key);
    }
    
    
    /**
     * @param key
     * @param defaultValue 按照属性获取值  没获取到就用传的参数值
     * @return
     */
    public static String getProperty(String key, String defaultValue) {
        if (null == props) {
            loadProps();
        }
        return props.getProperty(key, defaultValue);
    }
}
