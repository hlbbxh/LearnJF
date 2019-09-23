package com.carrat.TimeLine.select;

import java.util.LinkedHashMap;
import java.util.Map;

import com.carrat.TimeLine.enums.StaffLevel;
import com.carrat.TimeLine.utils.MyLocaleUtils;

public class UserTypeSelect {
    public Map<String, String> options() {
        Map<String, String> options = new LinkedHashMap<>();
        MyLocaleUtils myLocale = new MyLocaleUtils("en");
        for (StaffLevel staffLevel : StaffLevel.values()) {
            options.put(String.valueOf(staffLevel.getStaffLevel()), myLocale.getText(staffLevel.toString()));
        }
        return options;
    }
}
