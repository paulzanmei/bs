package com.paul.bs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.paul.bs.po.GrabCompanyInfo;



public interface GrabCompanyInfoMapper {

	public boolean insert(List<GrabCompanyInfo> list)throws Exception;
	
	@Select(value="SELECT GCI.id AS id,`GCI.grab_company.id` AS grabCompanyId,GCI.email AS email FROM grab_company_info GCI")
	public List<GrabCompanyInfo> selectAll();
}
