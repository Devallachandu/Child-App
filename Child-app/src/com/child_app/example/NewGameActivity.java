package com.child_app.example;




import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class NewGameActivity extends Activity {
ListView alphabetlist;
CustomAdapter cum=new CustomAdapter();
String alpha[]=cum.arr_alphabet;
String A[]={"Aplle","Apple","Aappl","Alple"};
String[] B={"Bull","Boll","Ball","Baal"};
String[] C={"Crow","Crro","Coro","Coor"};
String[] D={"Dug","Dgo","Dig","Dog"};
String[] E={"Elephan","Elepant","Elephant","Elppant"};
String[] F={"pish","Fish","Fiis","Fesh"};
String[] G={"Gon","Gun","Guun","Gum"};
String[] H={"Horse","Hoors","Harse","Hrse"};
String[] I={"Inc","Icn","Ink","Ino"};
String[] J={"Jog","Jag","Jagg","Jug"};
String[] K={"Kate","kite","kiat","kati"};
String[] L={"liaf","loef","leaf","leef"};
String[] M={"Mose","Mice","Mouse","Mour"};
String[] alphacontain={"Apple","Ball","Crow","Dog","Elephant","Fish","Gun","Horse","Ink","Jug","Kite","Leaf","Mouse"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_game);
		alphabetlist=(ListView)findViewById(R.id.alphabetlist);
		CustomAdapter cu=new CustomAdapter(this);
		alphabetlist.setAdapter(cu);
		
		
		alphabetlist.setOnItemClickListener(new OnItemClickListener() {
			
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
			
				Intent intent = new Intent(getBaseContext(), GameSecondActivity.class);
				Bundle b=new Bundle();
				switch(arg2)
				{
				case 0: b.putString("key", alpha[0]);
				b.putInt("key2", 1);
				b.putStringArray("key1", A);
				b.putString("key3", alphacontain[0]);
				intent.putExtras(b);
				startActivity(intent);
				break;
				case 1: b.putString("key", alpha[1]);
				b.putStringArray("key1", B);
				b.putInt("key2", 2);
				b.putString("key3", alphacontain[1]);
				intent.putExtras(b);
				startActivity(intent);
				break;
				case 2: b.putString("key", alpha[2]);
				b.putInt("key2", 0);
				b.putStringArray("key1", C);
				b.putString("key3", alphacontain[2]);
				intent.putExtras(b);
				startActivity(intent);
				break;
				case 3: b.putString("key", alpha[3]);
				b.putStringArray("key1", D);
				b.putInt("key2", 3);
				b.putString("key3", alphacontain[3]);
				intent.putExtras(b);
				startActivity(intent);
				break;
				case 4: b.putString("key", alpha[4]);
				b.putStringArray("key1", E);
				b.putInt("key2", 2);
				b.putString("key3", alphacontain[4]);
				intent.putExtras(b);
				startActivity(intent);
				break;
				case 5: b.putString("key", alpha[5]);
				b.putStringArray("key1", F);
				b.putInt("key2", 1);
				b.putString("key3", alphacontain[5]);
				intent.putExtras(b);
				startActivity(intent);
				break;
				case 6: b.putString("key", alpha[6]);
				b.putStringArray("key1", G);
				b.putInt("key2", 1);
				b.putString("key3", alphacontain[6]);
				intent.putExtras(b);
				startActivity(intent);
				break;
				case 7: b.putString("key", alpha[7]);
				b.putStringArray("key1", H);
				b.putInt("key2", 0);
				b.putString("key3", alphacontain[7]);
				intent.putExtras(b);
				startActivity(intent);
				break;
				case 8: b.putString("key", alpha[8]);
				b.putStringArray("key1", I);
				b.putInt("key2", 2);
				b.putString("key3", alphacontain[8]);
				intent.putExtras(b);
				startActivity(intent);
				break;
				case 9: b.putString("key", alpha[9]);
				b.putStringArray("key1", J);
				b.putInt("key2", 3);
				b.putString("key3", alphacontain[9]);
				intent.putExtras(b);
				startActivity(intent);
				break;
				case 10: b.putString("key", alpha[10]);
				b.putStringArray("key1", K);
				b.putInt("key2", 1);
				b.putString("key3", alphacontain[10]);
				intent.putExtras(b);
				startActivity(intent);
				break;
				case 11: b.putString("key", alpha[11]);
				b.putStringArray("key1", L);
				b.putInt("key2", 2);
				b.putString("key3", alphacontain[11]);
				intent.putExtras(b);
				startActivity(intent);
				break;
				case 12: b.putString("key", alpha[12]);
				b.putStringArray("key1", M);
				b.putInt("key2", 2);
				b.putString("key3", alphacontain[12]);
				intent.putExtras(b);
				startActivity(intent);
				break;
				}
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_new_game, menu);
		return true;
	}

}
