package com.am.dao;

import java.util.List;

import com.am.pojo.Maps;

import org.springframework.stereotype.Component;


//@Component(value = "mapsService")

public interface MapsMapper {
	public void updateMaps(Maps map) throws Exception;
	public List<String> findMapsByUserid(int userid) throws Exception;
	public List<String> findMapsByMapName(Maps map) throws Exception;
	public String findLayerTreeByMaps(Maps map) throws Exception;
	public void createMap(Maps map) throws Exception;
	public void deleteMap(Maps map) throws Exception;
}