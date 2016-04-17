package com.example.firstdemo;

import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.opengl.CCGLSurfaceView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class start extends ActionBarActivity implements OnClickListener{
	
	protected Intent Serviceintent = new Intent("com.angel.Android.MUSIC"); 
	private Button button3;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
        
		button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        startService(Serviceintent); 
	}
	@Override
	public void onClick(View v) {
		Intent intent = new Intent(start.this,MainActivity.class);
		startActivity(intent);
	}

}
