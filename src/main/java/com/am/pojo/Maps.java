package com.am.pojo;

import java.util.List;

public class Maps {
	private int id; 
	private String mapname;
	private int userid;
	private Boolean accessibility;
	private float centerx;
	private float centery;
	private int zoomlevel;
	private String layertreejson;
	private String jsonmap;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMapname() {
		return mapname;
	}
	public void setMapname(String mapname) {
		this.mapname = mapname;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) { this.userid = userid; }
	public Boolean getAccessibility() {
		return accessibility;
	}
	public void setAccessibility(Boolean accessibility) {
		this.accessibility = accessibility;
	}
	public float getCenterx() {
		return centerx;
	}
	public void setCenterx(float centerx) {
		this.centerx = centerx;
	}
	public float getCentery() {
		return centery;
	}
	public void setCentery(float centery) {
		this.centery = centery;
	}
	public int getZoomlevel() {
		return zoomlevel;
	}
	public void setZoomlevel(int zoomlevel) {
		this.zoomlevel = zoomlevel;
	}
	public String getLayertreejson() {
		return layertreejson;
	}
	public void setLayertreejson(String layertreejson) {
		this.layertreejson = layertreejson;
	}
    public String getJsonMap() { return jsonmap;}
    public void setJsonMap(String jsonMap) {this.jsonmap = jsonMap;}


}
