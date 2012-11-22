package com.rpl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ArrayTab_reading  extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
	
	public ArrayTab_reading(Context context, String[] values) {
		super(context, R.layout.tab_reading, values);
		this.context = context;
		this.values = values;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View rowView = inflater.inflate(R.layout.tab_reading, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
		textView.setText(values[position]);

		// Change icon based on name
		String s = values[position];
 
		System.out.println(s);
		
		if (s.equals("Narrative")) {
			imageView.setImageResource(R.drawable.reading);
		} else if (s.equals("Report")) {
			imageView.setImageResource(R.drawable.reading);
		} else if (s.equals("Recount")) {
			imageView.setImageResource(R.drawable.reading);
		} else {
			imageView.setImageResource(R.drawable.reading);
		}
 
		return rowView;
	}
}
