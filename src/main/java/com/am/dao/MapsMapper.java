package com.am.dao;

import java.util.List;

import com.am.pojo.Maps;

import org.springframework.stereotype.Component;


//@Component(value = "mapsService")

public interface MapsMapper {

	public void updateMaps(Maps map) throws Exception;
	public List<String> findMapsByUserid(int userid) throws Exception;
	public String findLayerTreeByMaps(Maps map) throws Exception;
}