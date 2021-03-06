package com.yrdce.ipo.modules.warehouse.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yrdce.ipo.common.dao.MyBatisDao;
import com.yrdce.ipo.modules.warehouse.entity.IpoStorage;
import com.yrdce.ipo.modules.warehouse.entity.IpoStorageExtended;

@MyBatisDao
public interface IpoStorageMapper {

	/**
	 * 分页查询入库单
	 * 
	 * @param beginnum
	 * @param endnum
	 * @param record
	 * @return
	 */
	List<IpoStorageExtended> findStoragesByPage(
			@Param("beginnum") int beginnum, @Param("endnum") int endnum,
			@Param("record") IpoStorageExtended record);

	/**
	 * 获取入库单总记录数
	 * 
	 * @param record
	 * @return
	 */
	int getTotalNum(IpoStorageExtended record);

	/**
	 * 分页查询发售可转持仓入库单
	 * 
	 * @param beginnum
	 * @param endnum
	 * @param record
	 * @return
	 */
	List<IpoStorageExtended> findStoragesBySale(
			@Param("beginnum") int beginnum, @Param("endnum") int endnum,
			@Param("record") IpoStorageExtended record);

	/**
	 * 获取发售可转持仓入库单总记录数
	 * 
	 * @param record
	 * @return
	 */
	int getSaleTotalNum(IpoStorageExtended record);

	// sequence序列，拼接入库单号
	int sequence();

	// 1.申请 2.仓库通过 3.仓库驳回 4.市场通过 5.市场驳回(storagedate对应数字)
	int insert(IpoStorage record);

	int updateByPrimaryKey(IpoStorage record);

	IpoStorage getStorageByPrimary(String storageid);

	IpoStorageExtended getStorageByStorageId(String storageid);

	int updateStorageState(@Param("storageid") String storageid,
			@Param("checker") String checker, @Param("state") String state);

	String getWarehouseId(String userId);

	Long getWarehousePrimaryKey(String userId);

	int updateTransferstatusByPrimaryKey(@Param("storageid") String storageid,
			@Param("transferstate") int transferstate);

}