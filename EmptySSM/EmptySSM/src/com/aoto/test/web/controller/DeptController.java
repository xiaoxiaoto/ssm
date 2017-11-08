package com.aoto.test.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aoto.test.business.IDeptService;
import com.aoto.test.persistence.pojo.Dept;

@Controller
@RequestMapping(value="/dept")
public class DeptController {
	
	@Resource( name="deptService")
	private IDeptService deptService;
	
	@RequestMapping(value="/insertdept")
	public int insertDept(){
		Dept dept = new Dept();
		dept.setDName("事业一部");
		dept.setLoc("北京");
		return deptService.insertDeptl(dept);
	}
	
}
