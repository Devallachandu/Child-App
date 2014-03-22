package com.child_app.example;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class ImageActivity extends Activity implements OnClickListener {

private ImageView img;
Button quit,cont;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image);
		img=(ImageView)findViewById(R.id.imagefinal);
		quit=(Button)findViewById(R.id.quit9);
		cont=(Button)findViewById(R.id.cont1);
		Bundle bundle=getIntent().getExtras();
	   String string=bundle.getString("key6");	
	  quit.setOnClickListener(this);
	   cont.setOnClickListener(this);
	   Animation animation = AnimationUtils.loadAnimation(
				getApplicationContext(),R.anim.scale);
		img.startAnimation(animation);
	    if(string.equals("Apple1"))
	    {
	    	img.setImageResource(R.drawable.apple);
	    }
	    else if(string.equals("Ball1"))
	    {
	    	img.setImageResource(R.drawable.ball);
	    }
	    else if(string.equals("Crow1"))
	    {
	    	img.setImageResource(R.drawable.crow);
	    }
	    else if(string.equals("Dog1"))
	    {
	    	img.setImageResource(R.drawable.dogi);
	    }
	    else if(string.equals("Elephant1"))
	    {
	    	img.setImageResource(R.drawable.ele);
	    }
	    else if(string.equals("Fish1"))
	    {
	    	img.setImageResource(R.drawable.fish);
	    }
	    else if(string.equals("Gun1"))
	    {
	    	img.setImageResource(R.drawable.gun);
	    }
	    else if(string.equals("Horse1"))
	    {
	    	img.setImageResource(R.drawable.hap);
	    }
	    else if(string.equals("Ink1"))
	    {
	    	img.setImageResource(R.drawable.inc);
	    }
	    else if(string.equals("Jug1"))
	    {
	    	img.setImageResource(R.drawable.jug);
	    }
	    else if(string.equals("Kite1"))
	    {
	    	img.setImageResource(R.drawable.kite);
	    }
	    else if(string.equals("Leaf1"))
	    {
	    	img.setImageResource(R.drawable.le);
	    }
	    else if(string.equals("Mouse1"))
	    {
	    	img.setImageResource(R.drawable.mou);
	    }

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_image, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==quit)
		{
			Intent inte=new Intent(getBaseContext(),MainActivity.class);
			startActivity(inte);
		}
		if(v==cont)
		{
			Intent intent=new Intent(getBaseContext(),NewGameActivity.class);
			startActivity(intent);
		}
	

	
	}


}
