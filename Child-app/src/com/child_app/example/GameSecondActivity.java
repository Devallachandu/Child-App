package com.child_app.example;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class GameSecondActivity extends Activity {
TextView Spell;
ListView list;
int pos;
Button exit,pause;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game_second);
		exit=(Button)findViewById(R.id.exit);
		pause=(Button)findViewById(R.id.pause);
		Spell=(TextView)findViewById(R.id.textalpha);
		Bundle b=getIntent().getExtras();
	    String str=b.getString("key");
		Spell.setText(str);
		pos=b.getInt("key2");
		final String alcont=b.getString("key3");
		list=(ListView)findViewById(R.id.list);
		String[] str_spell=b.getStringArray("key1"); 
		list.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,str_spell));
		list.setTextFilterEnabled(true);
        list.setOnItemClickListener(new OnItemClickListener() {
        	@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
        		// TODO Auto-generated method stub
        		if(arg2==pos)
				{
					Intent intent = new Intent(getBaseContext(), ColorActivity.class);
					Bundle bund=new Bundle();
					bund.putString("key4", alcont);
					intent.putExtras(bund);
					startActivity(intent);
				}
        		if(arg2!=pos)
        		{
        			Intent intent = new Intent(getBaseContext(),ActivitySorry.class);
					startActivity(intent);
        		}

			}
        	
        });
        exit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(getBaseContext(),MainActivity.class);
				startActivity(intent);
			}
		});
        pause.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//onPause();
				onResume();
				
				//Intent i=new Intent(getBaseContext(),MainActivity.class);
				//startActivity(i);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_game_second, menu);
		return true;
	}

}
