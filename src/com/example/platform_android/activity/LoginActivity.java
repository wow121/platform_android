package com.example.platform_android.activity;

import org.json.JSONObject;

import com.example.platform_android.R;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BasicNetWorkActivity implements OnClickListener{
	/**
	 * 用户登录页面
	 * 
	 */
	EditText username,password;
	Button   confirm,changePassword;
	
	private final int LOGIN=1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		username=(EditText)findViewById(R.id.login_username);
		password=(EditText)findViewById(R.id.login_password);
		confirm=(Button)findViewById(R.id.login_confirm);
		confirm.setOnClickListener(this);
//		changePassword=(Button)findViewById(R.id.login_change_password);
//		changePassword.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
//		case R.id.login_change_password:
//			Intent intent=new Intent();
//			intent.setClass(this, ChangePasswordActivity.class);
//			startActivity(intent);
//			break;
		case R.id.login_confirm:
			String strusername=username.getText().toString();
			String strpassword=password.getText().toString();
			if(strusername.length()==0||strpassword.length()==0){
				Toast.makeText(LoginActivity.this, "用户名或密码不能为空", Toast.LENGTH_SHORT).show();
			}
			else {
				String urlString="http://121.40.86.242/user/login?name="+strusername+"&password="+strpassword;
				putJsonRequest(urlString, LOGIN);
			}
		default:
			break;
		}
		
	}
	
	

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		this.finish();
	}

	@Override
	protected boolean onRequestEnd(Object response, int type) {
		// TODO Auto-generated method stub
		
		
		
		JSONObject jsonObject=(JSONObject)response;
		
		showToast(jsonObject.toString());
		
		
		return true;
	}

	
}
