package com.aoto.test.persistence.pojo;

import org.apache.ibatis.type.Alias;

@Alias("Dept")
public class Dept {
	private Integer deptNo;
	private String DName;
	private String Loc;
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	public String getDName() {
		return DName;
	}
	public void setDName(String dName) {
		DName = dName;
	}
	public String getLoc() {
		return Loc;
	}
	public void setLoc(String loc) {
		Loc = loc;
	}
}
