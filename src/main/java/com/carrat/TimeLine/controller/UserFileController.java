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
@RequestMapping("/test")
public class UserFileController {
	
	@RequestMapping("/index")
	private String index() {
		return "freemarker/index";
	}
	
    @RequestMapping(value = "saveUserFile", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    @ResponseBody
    public Map<Object, Object> saveWaybillFiles(Model model, @RequestBody List<UserFile> userFiles) {
    	Map<Object, Object> resultMap = new HashMap<Object, Object>();//返回集合
    	if(userFiles.size()<0) {
        	resultMap.put("fail", "Mapfail");
        	return resultMap;
    	}
    	for (int i = 0; i < userFiles.size(); i++) {
			System.out.println(userFiles.get(i).toString());
		}
    	resultMap.put("success", "mapsuccess");
    	return resultMap;
    }
	
}
