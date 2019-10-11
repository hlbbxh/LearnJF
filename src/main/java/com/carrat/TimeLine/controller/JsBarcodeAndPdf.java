package com.carrat.TimeLine.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.carrat.TimeLine.entity.UserFile;

/**
 * @author DELL 模拟list数据进行fmk解析
 *
 */
@Controller
@RequestMapping("/test")
public class JsBarcodeAndPdf {
	
	@RequestMapping("/JsBarcodeAndPdf")
	private String index(Model model) {
		List<UserFile> listUserfile = new ArrayList<UserFile>();//list 实体类数据
		UserFile UserFile1 = new UserFile();//1
		UserFile1.setId("F000000123");
		UserFile UserFile2 = new UserFile();//2
		UserFile2.setId("F000000789");
		listUserfile.add(UserFile1);//放入
		listUserfile.add(UserFile2);
		model.addAttribute("listUserfile", listUserfile);//放入作用域
		return "freemarker/JsBarcodeAndPdf";
	}
}
