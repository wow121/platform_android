package com.example.platform_android.bean;
/**
 * 公告bean
 * @author Administrator
 *
 */

public class NoticeBean {
	
	private String title; //标题
	private String content; // 内容
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
