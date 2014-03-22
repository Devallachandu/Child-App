package com.child_app.example;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends ActivitySorry implements OnClickListener {
VideoView vp;
Button quit,back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video);
		vp=(VideoView)findViewById(R.id.videoView1);
		back=(Button)findViewById(R.id.back0);
		quit=(Button)findViewById(R.id.quits);
		Bundle bundle=getIntent().getExtras();
		   String string=bundle.getString("key0");	
		   if(string.equals("notapple"))
		   {
		 Uri path=Uri.parse("android.resource://"+getPackageName().toString()+"/"+R.raw.applevideo);
			vp.setVideoURI(path);
			vp.setMediaController(new MediaController(this));
			vp.requestFocus();
			vp.start();
		   }
		   else if(string.equals("notball"))
		   {
			   Uri path=Uri.parse("android.resource://"+getPackageName().toString()+"/"+R.raw.ballvideo);
				vp.setVideoURI(path);
				vp.setMediaController(new MediaController(this));
				vp.requestFocus();
				vp.start();
		   }
		   else if(string.equals("notleaf"))
		   {
			   Uri path=Uri.parse("android.resource://"+getPackageName().toString()+"/"+R.raw.leafvideo);
				vp.setVideoURI(path);
				vp.setMediaController(new MediaController(this));
				vp.requestFocus();
				vp.start();
		   }
		   else if(string.equals("notcrow"))
		   {
			   Uri path=Uri.parse("android.resource://"+getPackageName().toString()+"/"+R.raw.crowvideo);
				vp.setVideoURI(path);
				vp.setMediaController(new MediaController(this));
				vp.requestFocus();
				vp.start();
		   }
		   else if(string.equals("notdog"))
		   {
			   Uri path=Uri.parse("android.resource://"+getPackageName().toString()+"/"+R.raw.dogvideo);
				vp.setVideoURI(path);
				vp.setMediaController(new MediaController(this));
				vp.requestFocus();
				vp.start();
		   }else if(string.equals("notelephant"))
		   {
			   Uri path=Uri.parse("android.resource://"+getPackageName().toString()+"/"+R.raw.elephantvideo);
				vp.setVideoURI(path);
				vp.setMediaController(new MediaController(this));
				vp.requestFocus();
				vp.start();
		   }
		   else if(string.equals("notfish"))
		   {
			   Uri path=Uri.parse("android.resource://"+getPackageName().toString()+"/"+R.raw.fishvideo);
				vp.setVideoURI(path);
				vp.setMediaController(new MediaController(this));
				vp.requestFocus();
				vp.start();
		   }
		   else if(string.equals("notgun"))
		   {
			   Uri path=Uri.parse("android.resource://"+getPackageName().toString()+"/"+R.raw.gunvideo);
				vp.setVideoURI(path);
				vp.setMediaController(new MediaController(this));
				vp.requestFocus();
				vp.start();
		   }
		   else if(string.equals("nothorse"))
		   {
			   Uri path=Uri.parse("android.resource://"+getPackageName().toString()+"/"+R.raw.horsevideo);
				vp.setVideoURI(path);
				vp.setMediaController(new MediaController(this));
				vp.requestFocus();
				vp.start();
		   }
		   else if(string.equals("notink"))
		   {
			   Uri path=Uri.parse("android.resource://"+getPackageName().toString()+"/"+R.raw.inkvideo);
				vp.setVideoURI(path);
				vp.setMediaController(new MediaController(this));
				vp.requestFocus();
				vp.start();
		   }
		   else if(string.equals("notjug"))
		   {
			   Uri path=Uri.parse("android.resource://"+getPackageName().toString()+"/"+R.raw.jugvideo);
				vp.setVideoURI(path);
				vp.setMediaController(new MediaController(this));
				vp.requestFocus();
				vp.start();
		   }
		   else if(string.equals("notkite"))
		   {
			   Uri path=Uri.parse("android.resource://"+getPackageName().toString()+"/"+R.raw.kitevideo);
				vp.setVideoURI(path);
				vp.setMediaController(new MediaController(this));
				vp.requestFocus();
				vp.start();
		   }
		   else if(string.equals("notmouse"))
		   {
			   Uri path=Uri.parse("android.resource://"+getPackageName().toString()+"/"+R.raw.mousevideo);
				vp.setVideoURI(path);
				vp.setMediaController(new MediaController(this));
				vp.requestFocus();
				vp.start();
		   }
		back.setOnClickListener(this);
		quit.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_video, menu);
		return true;
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==back)
		{
			vp.stopPlayback();
			vp.destroyDrawingCache();
			finish();
		}
		if(v==quit)
		{
			vp.stopPlayback();
			vp.destroyDrawingCache();
			Intent intent=new Intent(getBaseContext(),MainActivity.class);
			startActivity(intent);
		}
	}

}
