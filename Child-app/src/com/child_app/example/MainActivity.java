package com.child_app.example;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
Button newgame,help,quit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		newgame=(Button)findViewById(R.id.newgame);
		help=(Button)findViewById(R.id.help);
		quit=(Button)findViewById(R.id.quit);
		newgame.setOnClickListener(this);
		help.setOnClickListener(this);
		quit.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==newgame)
		{
			Intent intent=new Intent(this,NewGameActivity.class);
			startActivity(intent);
		}
		if(v==help)
		{
			Intent intent1=new Intent(this,HelpActivity.class);
			startActivity(intent1);
		}
		if(v==quit)
		{
			finish();
		}
	}

	

}
