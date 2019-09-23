package com.carrat.TimeLine.utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class MyLocaleUtils {    
	
    private String c = "language";    
    private String country;    
    private String launage;    
    private Locale locale;    
    private ResourceBundle resourceBundle;
    
    public MyLocaleUtils(String language) {//构造方法
        String str = language;
        setLocale(new Locale(str));
        setResourceBundle(ResourceBundle.getBundle(this.c, this.locale));
    }
    
    public String getText(String paramString) {
        paramString = convert(paramString);
        String str = paramString;
        try {
            str = this.resourceBundle.getString(paramString);
        } catch (Exception localException1) {
        }
        str = str.replaceAll("\\{name\\}", "new name");//替换操作
        return str;
    }
    
    public String convert(String paramString) {
        return paramString.replaceAll("_", ".").toLowerCase();
    }
    
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLaunage() {
		return launage;
	}
	public void setLaunage(String launage) {
		this.launage = launage;
	}
	public Locale getLocale() {
		return locale;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	public ResourceBundle getResourceBundle() {
		return resourceBundle;
	}
	public void setResourceBundle(ResourceBundle resourceBundle) {
		this.resourceBundle = resourceBundle;
	}   
    
}