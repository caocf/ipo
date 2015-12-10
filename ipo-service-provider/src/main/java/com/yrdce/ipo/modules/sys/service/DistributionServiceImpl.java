package com.yrdce.ipo.modules.sys.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yrdce.ipo.modules.sys.dao.IpoDistributionMapper;
import com.yrdce.ipo.modules.sys.entity.IpoDistribution;
import com.yrdce.ipo.modules.sys.entity.IpoDistributionExtended;
import com.yrdce.ipo.modules.sys.vo.Distribution;

@Service("distributionService")

public class DistributionServiceImpl implements DistributionService {

	@Autowired
	private IpoDistributionMapper ipoDistributionMapper;

	public IpoDistributionMapper getIpoDistributionMapper() {
		return ipoDistributionMapper;
	}

	public void setIpoDistributionMapper(IpoDistributionMapper ipoDistributionMapper) {
		this.ipoDistributionMapper = ipoDistributionMapper;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Distribution> getDistriList(String page, String rows, String userid) throws Exception {
		page = (page == null ? "1" : page);
		rows = (rows == null ? "5" : rows);
		int curpage = Integer.parseInt(page);
		int pagesize = Integer.parseInt(rows);
		List<Distribution> list2 = new ArrayList<Distribution>();
		List<IpoDistributionExtended> list = ipoDistributionMapper.getAllByPage((curpage - 1) * pagesize + 1, curpage * pagesize, userid);
		for (int i = 0; i < list.size(); i++) {
			Distribution distrib = new Distribution();
			BeanUtils.copyProperties(list.get(i), distrib);
			list2.add(distrib);
		}
		return list2;
	}

	@Override
	public int getAllDistris(String userid) throws Exception {
		return ipoDistributionMapper.countByExample(userid);
	}

	/*
	 * 获取客户所有配号信息
	 */
	@Override
	public List<Distribution> findAll() throws Exception {
		List<Distribution> list2 = new ArrayList<Distribution>();
		List<IpoDistribution> list = ipoDistributionMapper.selectAll();
		for (int i = 0; i < list.size(); i++) {
			Distribution distrib = new Distribution();
			BeanUtils.copyProperties(list.get(i), distrib);
			list2.add(distrib);
		}
		return list2;
	}

	@Override
	public List<Distribution> getDistriAllList(String page, String rows) throws Exception {
		page = (page == null ? "1" : page);
		rows = (rows == null ? "5" : rows);
		int curpage = Integer.parseInt(page);
		int pagesize = Integer.parseInt(rows);
		List<Distribution> list2 = new ArrayList<Distribution>();
		List<IpoDistribution> list = ipoDistributionMapper.selectByPage((curpage - 1) * pagesize + 1, curpage * pagesize);
		for (int i = 0; i < list.size(); i++) {
			Distribution distrib = new Distribution();
			BeanUtils.copyProperties(list.get(i), distrib);
			list2.add(distrib);
		}
		return list2;
	}

	@Override
	public int getAllDistribution() throws Exception {
		int i = 0;
		i = ipoDistributionMapper.selectByCount();
		return i;
	}
}
