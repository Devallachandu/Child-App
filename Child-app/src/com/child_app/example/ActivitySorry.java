package com.child_app.example;

import java.io.IOException;

import com.child_app.example.R.raw;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class ActivitySorry extends Activity implements OnClickListener{

MediaPlayer media;
Button tryagain,quit;
ImageView view;
AnimationDrawable frameanim;
int counter=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_sorry);
		view = (ImageView) findViewById(R.id.imageanimation);

		view.setBackgroundResource(R.drawable.frameanim);

		frameanim = (AnimationDrawable) view.getBackground();
		tryagain=(Button)findViewById(R.id.tryagain);
		quit=(Button)findViewById(R.id.quit1);
		media=MediaPlayer.create(this,raw.soryytone);
		
		quit.setOnClickListener(this);
		tryagain.setOnClickListener(this);
		try {
			media.prepare();//loads the song to be played
		} catch (IllegalStateException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		media.start();
	}
	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		super.onWindowFocusChanged(hasFocus);
		if (hasFocus) {
			frameanim.start();
		} else {
			frameanim.stop();
		}
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		frameanim.stop();
		onDestroy();
	}

	/*@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		frameanim.stop();
		finish();
	}*/
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_activity_sorry, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==tryagain)
		{
			media.stop();
			finish();
		}
		if(v==quit)
		{
			media.stop();
			Intent intent2=new Intent(getBaseContext(),MainActivity.class);
			startActivity(intent2);
		}
	}
}
