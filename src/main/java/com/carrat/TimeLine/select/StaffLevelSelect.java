package com.carrat.TimeLine.select;

import java.util.LinkedHashMap;
import java.util.Map;

import com.carrat.TimeLine.enums.StaffLevel;
import com.carrat.TimeLine.enums.UserType;
import com.carrat.TimeLine.utils.MyLocaleUtils;

public class StaffLevelSelect {
    public Map<String, String> options() {
        Map<String, String> options = new LinkedHashMap<>();
        MyLocaleUtils myLocale = new MyLocaleUtils("cn");
        for (UserType userType : UserType.values()) {
            options.put(String.valueOf(userType.getType()), myLocale.getText(userType.toString()));
        }
        return options;
    }
}
