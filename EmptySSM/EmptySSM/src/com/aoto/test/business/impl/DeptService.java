package com.aoto.test.business.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aoto.test.business.IDeptService;
import com.aoto.test.persistence.dao.IDeptDao;
import com.aoto.test.persistence.pojo.Dept;

@Service("deptService")
public class DeptService implements IDeptService {
	
	@Resource
	private IDeptDao deptDao;

	@Override
	public int insertDeptl(Dept dept) {
		return deptDao.insertDeptl(dept);
	}
}
