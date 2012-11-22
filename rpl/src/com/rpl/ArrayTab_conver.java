package com.rpl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ArrayTab_conver extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
	
	public ArrayTab_conver(Context context, String[] values) {
		super(context, R.layout.tab_conver, values);
		this.context = context;
		this.values = values;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View rowView = inflater.inflate(R.layout.tab_conver, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
		textView.setText(values[position]);

		// Change icon based on name
		String s = values[position];
 
		System.out.println(s);
		
		if (s.equals("Conversation 1")) {
			imageView.setImageResource(R.drawable.conver2);
		} else if (s.equals("Conversation 2")) {
			imageView.setImageResource(R.drawable.conver2);
		} else if (s.equals("Conversation 3")) {
			imageView.setImageResource(R.drawable.conver2);
		} else if (s.equals("Conversation 4")) {
			imageView.setImageResource(R.drawable.conver2);
		} else if (s.equals("Conversation 5")) {
			imageView.setImageResource(R.drawable.conver2);
		} else {
			imageView.setImageResource(R.drawable.conver2);
		}
 
		return rowView;
	}
}
