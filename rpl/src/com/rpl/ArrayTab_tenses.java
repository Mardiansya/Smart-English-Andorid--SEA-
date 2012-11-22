package com.rpl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ArrayTab_tenses extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
	
	public ArrayTab_tenses(Context context, String[] values) {
		super(context, R.layout.tab_tenses, values);
		this.context = context;
		this.values = values;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View rowView = inflater.inflate(R.layout.tab_tenses, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
		textView.setText(values[position]);

		// Change icon based on name
		String s = values[position];
 
		System.out.println(s);
		
		if (s.equals("Simple Present")) {
			imageView.setImageResource(R.drawable.tenses);
		} else if (s.equals("Present Continues")) {
			imageView.setImageResource(R.drawable.tenses);
		} else if (s.equals("Present Perfect")) {
			imageView.setImageResource(R.drawable.tenses);
		} else if (s.equals("Present Perfect Continues")) {
			imageView.setImageResource(R.drawable.tenses);
		} else if (s.equals("Simple Past")) {
			imageView.setImageResource(R.drawable.tenses);
		} else if (s.equals("Past Continues")) {
			imageView.setImageResource(R.drawable.tenses);
		} else if (s.equals("Past Perfect")) {
			imageView.setImageResource(R.drawable.tenses);
		} else if (s.equals("Past Perfect Continues")) {
			imageView.setImageResource(R.drawable.tenses);
		} else if (s.equals("Simple Future")) {
			imageView.setImageResource(R.drawable.tenses);
		} else if (s.equals("Future Continues")) {
			imageView.setImageResource(R.drawable.tenses);
		} else if (s.equals("Future Perfect")) {
			imageView.setImageResource(R.drawable.tenses);
		} else if (s.equals("Future Perfect Continues")) {
			imageView.setImageResource(R.drawable.tenses);
		} else if (s.equals("Past Future")) {
			imageView.setImageResource(R.drawable.tenses);
		} else if (s.equals("Past Future Continues")) {
			imageView.setImageResource(R.drawable.tenses);
		} else if (s.equals("Past Future Perfect")) {
			imageView.setImageResource(R.drawable.tenses);
		} else if (s.equals("Past Future Perfect Continues")) {
			imageView.setImageResource(R.drawable.tenses);
		} else {
			imageView.setImageResource(R.drawable.help);
		}
 
		return rowView;
	}
}

