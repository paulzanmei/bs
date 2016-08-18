package com.paul.bs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.paul.bs.po.GrabCountry;



public interface GrabCountryMapper {
	
	public boolean insert(List<GrabCountry> list);
	
	@Select(value="SELECT * FROM grab_country")
	public List<GrabCountry> selectAll();
	
	@Select(value="SELECT * FROM grab_country WHERE `id` >= #{id}")
	public List<GrabCountry> selectSection(int id);
}
