package com.example.platform_android.bean;
/**
 * ����bean
 * @author Administrator
 *
 */

public class NoticeBean {
	
	private String title; //����
	private String content; // ����
	private long  time;
	
	public NoticeBean(String title,String content,long time){
		this.title=title;
		this.content=content;
		this.time=time;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	public long getTime(){
		return time;
	}
}
