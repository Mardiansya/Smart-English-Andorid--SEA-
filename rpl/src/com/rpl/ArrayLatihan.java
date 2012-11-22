package com.rpl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ArrayLatihan extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
	
	public ArrayLatihan(Context context, String[] values) {
		super(context, R.layout.latihan, values);
		this.context = context;
		this.values = values;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View rowView = inflater.inflate(R.layout.latihan, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
		textView.setText(values[position]);

		// Change icon based on name
		String s = values[position];
 
		System.out.println(s);
		
		if (s.equals("Tenses 1")) {
			imageView.setImageResource(R.drawable.tenses);
		} else if (s.equals("Tenses 2")) {
			imageView.setImageResource(R.drawable.tenses);
		} else if (s.equals("Reading 1")) {
			imageView.setImageResource(R.drawable.reading);
		} else if (s.equals("Reading 2")) {
			imageView.setImageResource(R.drawable.reading);
		} else if (s.equals("So & Too")) {
			imageView.setImageResource(R.drawable.help);
		} else if (s.equals("Either & Neither")) {
			imageView.setImageResource(R.drawable.help);
		} else {
			imageView.setImageResource(R.drawable.help);
		}
 
		return rowView;
	}
}