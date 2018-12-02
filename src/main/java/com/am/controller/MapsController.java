package com.am.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.am.pojo.Maps;
import com.am.service.MapsService;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
public class MapsController {

	@Autowired
	private MapsService mapsService;

//	@RequestMapping("/mapSave")
//	@ResponseBody
//	public String mapSave(Maps map,HttpSession session) throws Exception {
//		map.setUserid((int)session.getAttribute("id"));
//		String result = mapsService.updateMap(map);
//		return result;
//	}
	@RequestMapping(value = "/mapSave.action"/*,consumes = "application/json"*/)
	@ResponseBody
	public String mapSave(Maps map, HttpSession session) throws Exception {
		//This line is useless
		//map.setMapname((String)session.getAttribute("mapname"));
		map.setUserid((int)session.getAttribute("id"));
		String result;
		if(mapsService.findMapByMapName(map).size()!=0) {
			result = mapsService.updateMap(map);
		}
		else {
			result = mapsService.createMap(map)+session.getAttribute("jsonmap");
		}
		return result;
	}


	@RequestMapping("/mapFind.action")
	@ResponseBody
	public List<String> mapFind(HttpSession session) throws Exception {
		int userid = (int)session.getAttribute("id");
		List<String> result = new ArrayList<String>();
		result = mapsService.findMapByUserid(userid);
		return result;
	}
	@RequestMapping("/x.action")
	@ResponseBody
	public String layerTreeRefresh(Maps map, HttpSession session) throws Exception {
		map.setUserid((int)session.getAttribute("id"));
		String result = mapsService.findLayerTreeByMap(map);
		return result;
	}

	@RequestMapping("/upload.action")
	@ResponseBody
	public String mapUpload(@RequestParam("file") MultipartFile file) throws Exception {
		if(file == null) return "failed";
		if (!file.isEmpty()) {
			try {
				String output = mapsService.upLoadMap(file);
				System.out.println(output);
				return output;
			} catch (Exception e) {
				return "failed";
			}
		}
		return "failed";

	}
}
