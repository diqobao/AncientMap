package com.am.pojo;

public class Maps {
	private int id; 
	private String mapname;
	private int userid;
	private Boolean accessibility;
	private float centerx;
	private float centery;
	private int zoomlevel;
	public String getLayertreejson() {
		return layertreejson;
	}
	public void setLayertreejson(String layertreejson) {
		this.layertreejson = layertreejson;
	}
	private String layertreejson;
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
	public void setUserid(int userid) {
		this.userid = userid;
	}
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


}
