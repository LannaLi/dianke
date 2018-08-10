package com.dfdk.yunwei.dao.base;

import java.sql.SQLException;

public interface BaseMapper<T>{
	/**
	 * 根据ID删除
	 * @param userid
	 * @return
	 * @author Lanna
	 * @date 2018年8月9日
	 */
	int deleteByPrimaryKey(String userid) throws SQLException;
	/**
	 * 添加
	 * @param record
	 * @return
	 * @author Lanna
	 * @date 2018年8月9日
	 */
    int insert(T record) throws SQLException;
    /**
     * 有选择的添加
     * @param record
     * @return
     * @author Lanna
     * @date 2018年8月9日
     */
    int insertSelective(T record) throws SQLException;
    /**
     * 根据ID查找,返回尸体
     * @param userid
     * @return
     * @author Lanna
     * @date 2018年8月9日
     */
    T selectByPrimaryKey(String userid) throws SQLException;
    /**
     * 有选择的更新
     * @param record
     * @return
     * @author Lanna
     * @date 2018年8月9日
     */
    int updateByPrimaryKeySelective(T record) throws SQLException;
    /**
     * 更新
     * @param record
     * @return
     * @author Lanna
     * @date 2018年8月9日
     */
    int updateByPrimaryKey(T record) throws SQLException;
	
}
