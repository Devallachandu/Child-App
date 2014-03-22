package com.child_app.example;

import java.io.IOException;

import com.child_app.example.R.raw;

import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.app.Activity;
import android.content.Intent;


public class SplasActivity extends Activity {

private final int SPLASH_DISPLAY_LENGHT = 5000;
MediaPlayer mp=null;


/** Called when the activity is first created. */

@Override

public void onCreate(Bundle icicle) {

super.onCreate(icicle);

setContentView(R.layout.activity_splas);
mp=MediaPlayer.create(this,raw.stone);
try {
	mp.prepare();//loads the song to be played
} catch (IllegalStateException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
mp.start();
/* New Handler to start the Menu-Activity

* and close this Splash-Screen after some seconds.*/

new Handler().postDelayed(new Runnable(){

@Override

public void run() {


/* Create an Intent that will start the Menu-Activity. */

Intent mainIntent = new Intent(SplasActivity.this,MainActivity.class);

SplasActivity.this.startActivity(mainIntent);

SplasActivity.this.finish();
//mp.stop();
}

}, SPLASH_DISPLAY_LENGHT);



}
}