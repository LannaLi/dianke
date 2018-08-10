package com.dfdk.yunwei.service.sys.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dfdk.common.ex.InsertRuntimeException;
import com.dfdk.yunwei.dao.sys.SysUserMapper;
import com.dfdk.yunwei.model.sys.SysUser;
import com.dfdk.yunwei.service.sys.SysUserManager;
@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED)
@Service
public class SysUserService implements SysUserManager{
	
	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public int insert(SysUser t) throws SQLException{
		int num = sysUserMapper.insertSelective(t);
		if (num != 1) {
			throw new InsertRuntimeException("添加记录失败!");
		}
		return num;
	}
}
