package com.carrat.TimeLine.enums;

/**
 * @author 枚举 用来返回map
 *
 */
public enum StaffLevel {
	
	STAFF(0), // 普通员工
	DIRECTOR(10), // 主管
	INSPECTOR(20), // 总监
	PRESIDENT(30); // 总经理

	private int staffLevel;

	private StaffLevel(int staffLevel) {
		this.staffLevel = staffLevel;
	}

	public int getStaffLevel() {
		return staffLevel;
	}
}
