package com.am.pojo;

import java.util.List;

public class Maps {
	private int id; 
	private String mapname;
	private int userid;
	private float centerx;
	private float centery;
	private int zoomlevel;
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
    public String getJsonMap() { return jsonmap;}
    public void setJsonMap(String jsonMap) {this.jsonmap = jsonMap;}


}
