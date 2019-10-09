package com.carrat.TimeLine.select;

import java.util.LinkedHashMap;
import java.util.Map;

import com.carrat.TimeLine.enums.StaffLevel;
import com.carrat.TimeLine.enums.UserType;
import com.carrat.TimeLine.utils.MyLocaleUtils;

/**
 * @author 用户等级下拉map 返回map集合
 *
 */
public class StaffLevelSelect {
    public Map<String, String> options() {
        Map<String, String> options = new LinkedHashMap<>();
        MyLocaleUtils myLocale = new MyLocaleUtils("cn");//注意这里和属性文件对应
        for (UserType userType : UserType.values()) {//遍历map集合 找到对应 cn 的内容
            options.put(String.valueOf(userType.getType()), myLocale.getText(userType.toString()));
        }
        return options;
    }
}
