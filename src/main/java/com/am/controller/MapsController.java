package com.am.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.am.pojo.Maps;
import com.am.service.MapsService;

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
	@RequestMapping(value = "/mapSave.action", method = RequestMethod.POST/*,consumes = "application/json"*/)
	@ResponseBody
	public String mapSave(Maps map, @RequestParam("jsonmap") String jsonMap,HttpSession session, HttpServletRequest request) throws Exception {
		//This line is useless
		//map.setMapname((String)session.getAttribute("mapname"));
		map.setUserid((int)session.getAttribute("id"));
		map.setJsonMap(jsonMap);
		String result;
		if(mapsService.findMapByMapName(map).size()!=0) {
			result = mapsService.updateMap(map);
		}
		else {
			result = mapsService.createMap(map)+"JsonMap: "+map.getJsonMap();
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
	@RequestMapping("/layerTreeRefresh.action")
	@ResponseBody
	public String layerTreeRefresh(Maps map,HttpSession session) throws Exception {
		map.setUserid((int)session.getAttribute("id"));
		String result = mapsService.findLayerTreeByMap(map);
		return result;
	}

}
