package com.spring.news.vo;

import java.sql.Date;

public class NewsVO {
	private int aid;
	private String title;
	private String img;
	private Date date;
	private String content;
	
	public NewsVO() {
		
	}
	
	public NewsVO(int aid, String title, String img, Date date, String content) {
		this.aid = aid;
		this.title = title;
		this.img = img;
		this.date = date;
		this.content = content;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
