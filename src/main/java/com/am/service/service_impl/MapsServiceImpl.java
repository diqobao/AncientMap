package com.am.service.service_impl;

import java.util.ArrayList;
import java.util.List;
import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import com.am.dao.MapsMapper;
import com.am.pojo.Maps;
import com.am.service.MapsService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.am.utils.csvparser;

@Component
public class MapsServiceImpl implements MapsService{

	@Autowired
	private MapsMapper mapsMapper;
	
	@Override
	public String updateMap(Maps map) throws Exception {
		mapsMapper.updateMaps(map);
		return "success";
	}
	public List<String> findMapByUserid(int userid) throws Exception{
		List<String> result = new ArrayList<String>();
		result = mapsMapper.findMapsByUserid(userid);
		return result;
	}
	public String findLayerTreeByMap(Maps map) throws Exception {
		String result = mapsMapper.findLayerTreeByMaps(map);
		return result;
	}
	public String createMap(Maps map) throws Exception
	{
		mapsMapper.createMap(map);
		return "success";
	}
	public List<String> findMapByMapName(Maps map) throws Exception
	{
		List<String> result = mapsMapper.findMapsByMapName(map);
		return result;
	}

	public String upLoadMap(MultipartFile file0) throws Exception {
		File file = new File(file0.getOriginalFilename());
		file0.transferTo(file);
		csvparser parser = new csvparser(file);
		String output = parser.csv2json();
		return output;
	}

	public String deleteMap(Maps map) throws Exception
	{
		mapsMapper.deleteMap(map);
		return "success";
	}
}
