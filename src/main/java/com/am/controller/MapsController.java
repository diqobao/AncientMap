package com.am.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.am.pojo.Maps;
import com.am.service.MapsService;

@Controller
public class MapsController {

	@Autowired
	private MapsService mapsService;
	
	@RequestMapping("/mapSave.action")
	@ResponseBody
	public String mapSave(Maps map,HttpSession session) throws Exception {
		map.setUserid((int)session.getAttribute("id"));
		String result = mapsService.updateMap(map);	
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
