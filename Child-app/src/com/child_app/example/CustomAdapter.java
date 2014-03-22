package com.child_app.example;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class CustomAdapter extends BaseAdapter {
	String arr_alphabet[]={"A   for","B   for   ","C   for","D   for","E   for","F   for","G   for","H   for","I   for","J   for","K   for","L   for","M   for"};
	int images[]={R.drawable.apple,R.drawable.ball,R.drawable.crow,R.drawable.dogi,R.drawable.ele,R.drawable.fish,R.drawable.gun,R.drawable.hap,R.drawable.inc,R.drawable.jug,R.drawable.kite,R.drawable.le,R.drawable.mou};
	
	public LayoutInflater vi;
	@SuppressWarnings("static-access")
	public CustomAdapter(Context context){
		try{
			vi=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
				
		}catch(Exception e){
				System.out.println("exception in customadapter is:"+e);
		}
	}
	public CustomAdapter() {
		// TODO Auto-generated constructor stub
			
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 13;//returns the no of cells on the list view
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		View v=arg1;//returns the first cell initially
		v=vi.inflate(R.layout.custom, null);
		ViewHolder holder=new ViewHolder();
		holder.img=(ImageView)v.findViewById(R.id.imageView1);
		holder.tv1=(TextView)v.findViewById(R.id.textView1);
	//	holder.tv2=(TextView)v.findViewById(R.id.textView2);
		
		holder.img.setImageResource(images[arg0]);
		holder.tv1.setText(arr_alphabet[arg0].toString());
		//holder.tv2.setText(arr_marks[arg0].toString());
		return v;
	
	}
static class ViewHolder{
	TextView tv1;
	ImageView img;
}



}

