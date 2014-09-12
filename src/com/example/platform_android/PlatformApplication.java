package com.example.platform_android;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import android.app.Application;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class PlatformApplication extends Application {
	
	private static PlatformApplication instance;
	private String token; // ���ص���֤��Ϣ�� �����´����½
	private int screen_width,screen_height; //��Ļ�Ŀ��

	RequestQueue mQueue;




	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		instance=this;
		DisplayMetrics displaymetrics = new DisplayMetrics();
		WindowManager window=(WindowManager)(this.getSystemService(Context.WINDOW_SERVICE));
		window.getDefaultDisplay().getMetrics(displaymetrics);
		screen_width=displaymetrics.widthPixels;
		screen_height=displaymetrics.heightPixels;
		super.onCreate();
		
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	

	
	public int getScreen_width() {
		return screen_width;
	}

	public int getScreen_height() {
		return screen_height;
	}

	public static PlatformApplication getInstance(){
		return instance; 
	}

	public RequestQueue getRequestQueue(){
		if(mQueue==null){
			mQueue=Volley.newRequestQueue(getApplicationContext());
		}
		return mQueue;
	}
}
