package com.am.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.am.pojo.Maps;
import org.springframework.web.multipart.MultipartFile;

public interface MapsService {
		public String updateMap(Maps map) throws Exception;
		public List<String> findMapByUserid(int userid) throws Exception;
		public String findLayerTreeByMap(Maps map) throws Exception;
		public String createMap(Maps map) throws Exception;
		public List<String> findMapByMapName(Maps map) throws Exception;
		public String upLoadMap(MultipartFile file) throws Exception;
		public String deleteMap(Maps map) throws Exception;
}
