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
	 * logoҳ��
	 * 
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);//ȡ��������  
		  //ȡ��״̬��  
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN); 
		setContentView(R.layout.logo);
		
		ImageView imageview =(ImageView)findViewById(R.id.img_logo);
		imageview.setImageResource(R.drawable.logo); // ��ǳ����,�Ӱٷ�֮10���ٷ�֮��          
		AlphaAnimation aa = new AlphaAnimation(0.1f, 1.0f);  
		aa.setDuration(3000);//���ö���ʱ��  
		imageview.setAnimation(aa);//��image���ö���  
		aa.setAnimationListener(new AnimationListener() {    
		  public void onAnimationStart(Animation animation) {  
		     
		  }  
		  public void onAnimationRepeat(Animation animation) {  
		  
		  }  		    
		  public void onAnimationEnd(Animation animation) {  
		   Intent intent =new Intent();  
		   intent.setClass(LogoActivity.this,LoginActivity.class);//logoչʾ�����ת����һ��Activity  
		   startActivity(intent);  
		   finish();  
		  }  
		 }); 
	}
}
