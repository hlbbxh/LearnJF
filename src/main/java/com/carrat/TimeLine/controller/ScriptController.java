package com.carrat.TimeLine.controller;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("task")
@Controller
public class ScriptController {
    @Autowired
    private HttpServletRequest request; 
    
    @RequestMapping("runScript")
    @ResponseBody
    public String runScript() {
    	String type = this.request.getParameter("type");//参数为需要执行的包名称
        if (null == type) {
            System.out.println("请求包名为空");
            return "success";
        }
        String parms = this.request.getParameter("args");//获取参数
        type = type.replace("/", ".");//替换/为.的包名
        String packageName = "com.carrat.TimeLine." + type;//拼接完整包名
        String methodName = "sendEmail"; //方法名称
        try {
            Class<?> localClass = Class.forName(packageName);//反射
            Method localMethod = localClass.getMethod(methodName, new Class[] {String.class});//方法名称
            Boolean result = (Boolean) localMethod.invoke(localClass.newInstance(), new Object[] {parms});//参数
            if(result) {
            	return "success";
            }else {
            	return "fasle";
            }
        } catch (Exception localException) {
            localException.printStackTrace();
            return "fasle";
        }
    }
}
