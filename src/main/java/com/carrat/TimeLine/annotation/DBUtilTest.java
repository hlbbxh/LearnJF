package com.carrat.TimeLine.annotation;
@JDBCConfig(ip = "127.0.0.1", database = "test", encoding = "UTF-8", loginName = "root", password = "admin")//注解
public class DBUtilTest {
	public static void main(String[] args) {
		//接下来就通过反射，获取这个DBUtil这个类上的注解对象
		JDBCConfig config = DBUtilTest.class.getAnnotation(JDBCConfig.class);//获取当前注解 
        String ip = config.ip();//
        int port = config.port();
        String database = config.database();
        String encoding = config.encoding();
        String loginName = config.loginName();
        String password = config.password();
        //输出
        System.out.println(ip);
        System.out.println(port);
        System.out.println(database);
        System.out.println(encoding);
        System.out.println(loginName);
        System.out.println(password);
	}
}
