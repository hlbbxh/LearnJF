package com.carrat.TimeLine.controller;

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
 * @author DELL 用户文件控制器
 *
 */
@Controller
@RequestMapping("/learn")
public class LearnController {
	
	@RequestMapping("/learnVue")
	private String index() {
		return "freemarker/vue/learnVue";
	}
	
}
