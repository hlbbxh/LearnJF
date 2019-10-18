package com.carrat.TimeLine;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.carrat.TimeLine.core.Constant;
import com.carrat.TimeLine.entity.UserFile;
import com.carrat.TimeLine.select.StaffLevelSelect;
import com.carrat.TimeLine.select.UserTypeSelect;
import com.carrat.TimeLine.utils.JsonUtils;
import com.carrat.TimeLine.utils.PropertyUtil;
import com.carrat.TimeLine.utils.RedisOperator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnJfApplicationTests {
	
	@Autowired
	private RedisOperator redisOperator;

	/*
	 * 测试读取属性文件
	 */
	@Test
	public void testProperties() {
		System.err.println(PropertyUtil.getProperty("file.upload"));//测试获取配置属性文件的方法
	}
	
	/*
	 * 测试使用Constant类中的静态 常用变量
	 */
	@Test
	public void testConstant() {
		System.err.println(Constant.DATA_UPLOAD);//上传文件
		System.err.println(Constant.JPG_EXTENSION);//jpg的后缀
	}
	
	/**
	 *测试输出map的中文和英文版本的数据
	 */
	@Test
	public void testOption() {
		StaffLevelSelect select = new StaffLevelSelect();//职称下拉
		Map<String, String> options = select.options();//cn
		UserTypeSelect usertype = new UserTypeSelect();//用户下拉
		Map<String, String> options2 = usertype.options();//en
		System.err.println(options.toString());//输出
		System.err.println(options2.toString());//输出
	}
	
	/**
	 * 测试redis数据库数据
	 */
	@Test
	public void testRedis() {
		redisOperator.set("test","hyd");//放入key value 数据
		System.out.println(redisOperator.get("test"));
		UserFile userFile = new UserFile();//实体
		userFile.setId("1");
		userFile.setFileName("测试文件");
		userFile.setFileUrl("/images/360.png");
		userFile.setCreateTime("2019年10月18日11:28:40");
		redisOperator.set("File:UserFile",JsonUtils.objectToJson(userFile));//放入实体数据
		System.out.println(redisOperator.get("File:UserFile"));//取出数据
	}

}
