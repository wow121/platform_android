package com.example.platform_android.activity;


import com.example.platform_android.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

public class LogoActivity extends Activity {
	/**
	 * logo页面
	 * 
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);//取消标题栏  
		  //取消状态栏  
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN); 
		setContentView(R.layout.logo);
		
		ImageView imageview =(ImageView)findViewById(R.id.img_logo);
		imageview.setImageResource(R.drawable.logo); // 从浅到深,从百分之10到百分之百          
		AlphaAnimation aa = new AlphaAnimation(0.1f, 1.0f);  
		aa.setDuration(3000);//设置动画时间  
		imageview.setAnimation(aa);//给image设置动画  
		aa.setAnimationListener(new AnimationListener() {    
		  public void onAnimationStart(Animation animation) {  
		     
		  }  
		  public void onAnimationRepeat(Animation animation) {  
		  
		  }  		    
		  public void onAnimationEnd(Animation animation) {  
		   Intent intent =new Intent();  
		   intent.setClass(LogoActivity.this,LoginActivity.class);//logo展示完毕跳转至另一个Activity  
		   startActivity(intent);  
		   finish();  
		  }  
		 }); 
	}
}
