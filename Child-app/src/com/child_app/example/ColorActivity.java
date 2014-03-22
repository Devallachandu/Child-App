package com.child_app.example;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class ColorActivity extends Activity implements OnClickListener {
	Button quit,red,blue,green,brown,black,yellow,colors,gray,purple;
ImageView image;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_color);
		quit=(Button)findViewById(R.id.quit6);
		red=(Button)findViewById(R.id.red);
		brown=(Button)findViewById(R.id.brown);
		green=(Button)findViewById(R.id.green);
		black=(Button)findViewById(R.id.black);
		yellow=(Button)findViewById(R.id.yello);
		colors=(Button)findViewById(R.id.colors);
		gray=(Button)findViewById(R.id.gray);
		blue=(Button)findViewById(R.id.blue);
		purple=(Button)findViewById(R.id.purple);
		
	    quit.setOnClickListener(this);
	    red.setOnClickListener(this);
	    blue.setOnClickListener(this);
	    black.setOnClickListener(this);
	    brown.setOnClickListener(this);
	    colors.setOnClickListener(this);
	    yellow.setOnClickListener(this);
	    gray.setOnClickListener(this);
	    green.setOnClickListener(this);
	    purple.setOnClickListener(this);
	    image=(ImageView)findViewById(R.id.image);
	    Bundle b=getIntent().getExtras();
		   String alphastr=b.getString("key4");	   
		 if(alphastr.equals("Apple") )
		    {
		    image.setImageResource(R.drawable.applesketch);
		    
		   red.setOnClickListener(new OnClickListener() {
				  // @Override
				public void onClick(View v) {
						// TODO Auto-generated method stub
						if(v==red)
						{
							Intent intent=new Intent(getApplicationContext(),ImageActivity.class);
							Bundle bundle=new Bundle();
						bundle.putString("key6","Apple1");
						intent.putExtras(bundle);
						startActivity(intent);
						}
					}		  
			}); 
		    }
		 else if(alphastr.equals("Ball"))
		    {
		    image.setImageResource(R.drawable.ballsketch);
		  green.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(v==green)
					{
						Intent intent=new Intent(getApplicationContext(),ImageActivity.class);
						Bundle bundle=new Bundle();
					bundle.putString("key6","Ball1");
					intent.putExtras(bundle);
					startActivity(intent);
					}
				}
				});
		    }	
		    else if(alphastr.equals("Leaf") )
		    {
		    image.setImageResource(R.drawable.leafsketch);
		  green.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(v==green)
					{
						Intent intent=new Intent(getApplicationContext(),ImageActivity.class);
						Bundle bundle=new Bundle();
					bundle.putString("key6","Leaf1");
					intent.putExtras(bundle);
					startActivity(intent);
					}
					
				}
				});
		    }	
		    else if(alphastr.equals("Elephant") )
		    {
		    image.setImageResource(R.drawable.elephantsketch);
		  gray.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(v==gray)
					{
						Intent intent=new Intent(getApplicationContext(),ImageActivity.class);
						Bundle bundle=new Bundle();
					bundle.putString("key6","Elephant1");
					intent.putExtras(bundle);
					startActivity(intent);
					}
					
				}
				});
		 
		    }	
		    else if(alphastr.equals("Fish") )
		    {
		    image.setImageResource(R.drawable.fizhsketch);
		   yellow.setOnClickListener(new OnClickListener() {
			   
				   @Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						if(v==yellow)
						{
							Intent intent=new Intent(getApplicationContext(),ImageActivity.class);
							Bundle bundle=new Bundle();
						bundle.putString("key6","Fish1");
						intent.putExtras(bundle);
						startActivity(intent);
						}
						
					
					}
				});
		   
		    }
		    else if(alphastr.equals("Gun") )
		    {
		    image.setImageResource(R.drawable.gunsketch);
		   black.setOnClickListener(new OnClickListener() {
			   
				   @Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						if(v==black)
						{
							Intent intent=new Intent(getApplicationContext(),ImageActivity.class);
							Bundle bundle=new Bundle();
						bundle.putString("key6","Gun1");
						intent.putExtras(bundle);
						startActivity(intent);
						}	
					}
				});
		  
		    }
		    else if(alphastr.equals("Mouse") )
		    {
		    image.setImageResource(R.drawable.mousesketch);
		  gray.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(v==gray)
					{
						Intent intent=new Intent(getApplicationContext(),ImageActivity.class);
						Bundle bundle=new Bundle();
					bundle.putString("key6","Mouse1");
					intent.putExtras(bundle);
					startActivity(intent);
					}
					
				}
				});
		    }	
		    else if(alphastr.equals("Dog") )
		    {
		    image.setImageResource(R.drawable.dogsketch);
		  brown.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(v==brown)
					{
						Intent intent=new Intent(getApplicationContext(),ImageActivity.class);
						Bundle bundle=new Bundle();
					bundle.putString("key6","Dog1");
					intent.putExtras(bundle);
					startActivity(intent);
					}
				}
				});
		    }	
		    else if(alphastr.equals("Horse") )
		    {
		    image.setImageResource(R.drawable.horsesketch);
		  brown.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(v==brown)
					{
						Intent intent=new Intent(getApplicationContext(),ImageActivity.class);
						Bundle bundle=new Bundle();
					bundle.putString("key6","Horse1");
					intent.putExtras(bundle);
					startActivity(intent);
					}
					
				}
				});
		    }	
		    
		    else if(alphastr.equals("Crow") )
		    {
		    image.setImageResource(R.drawable.crowsketch);
		  black.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(v==black)
					{
						Intent intent=new Intent(getApplicationContext(),ImageActivity.class);
						Bundle bundle=new Bundle();
					bundle.putString("key6","Crow1");
					intent.putExtras(bundle);
					startActivity(intent);
					}	
				}
				});
		    }	
		    else if(alphastr.equals("Ink") )
		    {
		    image.setImageResource(R.drawable.inksketch);
		  blue.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(v==blue)
					{
						Intent intent=new Intent(getApplicationContext(),ImageActivity.class);
						Bundle bundle=new Bundle();
					bundle.putString("key6","Ink1");
					intent.putExtras(bundle);
					startActivity(intent);
					}
					
				}
				});
		    }	
		    else if(alphastr.equals("Jug") )
		    {
		    image.setImageResource(R.drawable.jugsketch);
		   yellow.setOnClickListener(new OnClickListener() {
			   
				   @Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						if(v==yellow)
						{
							Intent intent=new Intent(getApplicationContext(),ImageActivity.class);
							Bundle bundle=new Bundle();
						bundle.putString("key6","Jug1");
						intent.putExtras(bundle);
						startActivity(intent);
						}
						
					
					}
				});
		    }
		    else if(alphastr.equals("Kite") )
		    {
		    image.setImageResource(R.drawable.kitesketch);
		   colors.setOnClickListener(new OnClickListener() {
			   
				   @Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						if(v==colors)
						{
							Intent intent=new Intent(getApplicationContext(),ImageActivity.class);
							Bundle bundle=new Bundle();
						bundle.putString("key6","Kite1");
						intent.putExtras(bundle);
						startActivity(intent);
						}
					}
				});
		    }
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_color, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v==red || v==blue || v==brown || v== green || v==black || v==colors || v==yellow || v==gray || v==purple)
		{
			Bundle b=getIntent().getExtras();
		   String alphastr=b.getString("key4");	
		   if(alphastr.equals("Apple"))
		   {
			if(v!=red)
			{
				Intent inten=new Intent(getBaseContext(),VideoActivity.class);
				Bundle b1=new Bundle();
				b1.putString("key0", "notapple");
				inten.putExtras(b1);
				startActivity(inten);
			}
		   }
			else if(alphastr.equals("Ball"))
				{
				 if(v!=green)
					{
						Intent inten=new Intent(getBaseContext(),VideoActivity.class);
						Bundle b1=new Bundle();
						b1.putString("key0", "notball");
						inten.putExtras(b1);
						startActivity(inten);
					}
				}
			  else if(alphastr.equals("Leaf") )
			    {
				  if(v!=green)
					{
						Intent inten=new Intent(getBaseContext(),VideoActivity.class);
						Bundle b1=new Bundle();
						b1.putString("key0", "notleaf");
						inten.putExtras(b1);
						startActivity(inten);
					}
				
			    }
			  else if(alphastr.equals("Elephant") )
			    {
				  if(v!=gray)
					{
						Intent inten=new Intent(getBaseContext(),VideoActivity.class);
						Bundle b1=new Bundle();
						b1.putString("key0", "notelephant");
						inten.putExtras(b1);

						startActivity(inten);
					}
			    }
			  else if(alphastr.equals("Fish") )
			    {
				  if(v!=yellow)
					{
						Intent inten=new Intent(getBaseContext(),VideoActivity.class);
						Bundle b1=new Bundle();
						b1.putString("key0", "notfish");
						inten.putExtras(b1);
						startActivity(inten);
					}
			    }
			  else if(alphastr.equals("Gun") )
			    {
				  if(v!=black)
					{
						Intent inten=new Intent(getBaseContext(),VideoActivity.class);
						Bundle b1=new Bundle();
						b1.putString("key0", "notgun");
						inten.putExtras(b1);
						startActivity(inten);
					}
			    }
			  else if(alphastr.equals("Mouse") )
			    {
				  if(v!=gray)
					{
						Intent inten=new Intent(getBaseContext(),VideoActivity.class);
						Bundle b1=new Bundle();
						b1.putString("key0", "notmouse");
						inten.putExtras(b1);
						startActivity(inten);
					}
			    }
			  else if(alphastr.equals("Dog") )
			    {
				  if(v!=brown)
					{
						Intent inten=new Intent(getBaseContext(),VideoActivity.class);
						Bundle b1=new Bundle();
						b1.putString("key0", "notdog");
						inten.putExtras(b1);
						startActivity(inten);
					}
			    }
			  else if(alphastr.equals("Horse") )
			    {
				  if(v!=brown)
					{
						Intent inten=new Intent(getBaseContext(),VideoActivity.class);
						Bundle b1=new Bundle();
						b1.putString("key0", "nothorse");
						inten.putExtras(b1);
						startActivity(inten);
					}
			    }
			  else if(alphastr.equals("Crow") )
			    {
				  if(v!=black)
					{
						Intent inten=new Intent(getBaseContext(),VideoActivity.class);
						Bundle b1=new Bundle();
						b1.putString("key0", "notcrow");
						inten.putExtras(b1);
						startActivity(inten);
					}
			    }
			  else if(alphastr.equals("Ink") )
			    {
				  if(v!=blue)
					{
						Intent inten=new Intent(getBaseContext(),VideoActivity.class);
						Bundle b1=new Bundle();
						b1.putString("key0", "notink");
						inten.putExtras(b1);
						startActivity(inten);
					}
			    }
			  else if(alphastr.equals("Jug") )
			    {
				  if(v!=yellow)
			    
				{
					Intent inten=new Intent(getBaseContext(),VideoActivity.class);
					Bundle b1=new Bundle();
					b1.putString("key0", "notjug");
					inten.putExtras(b1);
					startActivity(inten);
				}
			    }
			  else if(alphastr.equals("Kite") )
			    {
				  if(v!=colors)
					{
						Intent inten=new Intent(getBaseContext(),VideoActivity.class);
						Bundle b1=new Bundle();
						b1.putString("key0", "notkite");
						inten.putExtras(b1);
						startActivity(inten);
					}	
			    }
		}
		if(v==quit)
		{
			finish();
		}
	
	
	}

	
}


