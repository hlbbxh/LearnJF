package com.carrat.TimeLine;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.carrat.TimeLine.core.Constant;
import com.carrat.TimeLine.select.StaffLevelSelect;
import com.carrat.TimeLine.select.UserTypeSelect;
import com.carrat.TimeLine.utils.PropertyUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnJfApplicationTests {

	/*
	 * 测试读取属性文件
	 */
	@Test
	public void testProperties() {
		System.err.println(PropertyUtil.getProperty("file.upload"));//测试获取配置属性文件的方法
	}
	
	/*
	 * 测试使用Constant类中的静态倡常用变量
	 */
	@Test
	public void testConstant() {
		System.err.println(Constant.DATA_UPLOAD);
		System.err.println(Constant.JPG_EXTENSION);
	}
	
	/**
	 *测试输出map的中文和英文版本的数据
	 */
	@Test
	public void testOption() {
		StaffLevelSelect select = new StaffLevelSelect();
		Map<String, String> options = select.options();
		UserTypeSelect usertype = new UserTypeSelect();
		Map<String, String> options2 = usertype.options();
		System.err.println(options.toString());
		System.err.println(options2.toString());
	}
	
	
}
