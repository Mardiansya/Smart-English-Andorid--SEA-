package com.rpl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ArrayHelp extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
	
	public ArrayHelp(Context context, String[] values) {
		super(context, R.layout.help, values);
		this.context = context;
		this.values = values;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View rowView = inflater.inflate(R.layout.help, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
		textView.setText(values[position]);

		// Change icon based on name
		String s = values[position];
 
		System.out.println(s);
		
		if (s.equals("Petunjuk")) {
			imageView.setImageResource(R.drawable.petunjuk);
		} else if (s.equals("About SEA")) {
			imageView.setImageResource(R.drawable.about1);
		} else {
			imageView.setImageResource(R.drawable.help);
		}
 
		return rowView;
	}
}
