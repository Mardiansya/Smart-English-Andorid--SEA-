package com.rpl;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;

import com.rpl.ArrayTab_tenses;
import com.rpl.R;

public class Tab_tenses extends ListActivity {

	static final String[] daftartenses = new String[] { "Simple Present",
			"Present Continues", "Present Perfect",
			"Present Perfect Continues", "Simple Past", "Past Continues",
			"Past Perfect", "Past Perfect Continues", "Simple Future",
			"Future Continues", "Future Perfect", "Future Perfect Continues",
			"Past Future", "Past Future Continues", "Past Future Perfect",
			"Past Future Perfect Continues" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayTab_tenses(this, daftartenses));
		// setContentView(R.layout.tab_tenses);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// get selected items
		// String selectedValue = (String) getListAdapter().getItem(position);
		// Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();
		Object detail = this.getListAdapter().getItem(position);
		String tampil = detail.toString();
		Intent i = null;
		if (tampil == "Simple Present") {
			i = new Intent(this, Tenses_1.class);
			startActivity(i);
		} else if (tampil == "Present Continues") {
			i = new Intent(this, Tenses_2.class);
			startActivity(i);
		} else if (tampil == "Present Perfect") {
			i = new Intent(this, Tenses_3.class);
			startActivity(i);
		} else if (tampil == "Present Perfect Continues") {
			i = new Intent(this, Tenses_4.class);
			startActivity(i);
		} else if (tampil == "Simple Past") {
			i = new Intent(this, Tenses_5.class);
			startActivity(i);
		} else if (tampil == "Past Continues") {
			i = new Intent(this, Tenses_6.class);
			startActivity(i);
		} else if (tampil == "Past Perfect") {
			i = new Intent(this, Tenses_7.class);
			startActivity(i);
		} else if (tampil == "Past Perfect Continues") {
			i = new Intent(this, Tenses_8.class);
			startActivity(i);
		} else if (tampil == "Simple Future") {
			i = new Intent(this, Tenses_9.class);
			startActivity(i);
		} else if (tampil == "Future Continues") {
			i = new Intent(this, Tenses_10.class);
			startActivity(i);
		} else if (tampil == "Future Perfect") {
			i = new Intent(this, Tenses_11.class);
			startActivity(i);
		} else if (tampil == "Future Perfect Continues") {
			i = new Intent(this, Tenses_12.class);
			startActivity(i);
		} else {
			Toast.makeText(this, "Anda Memilih : " + tampil, Toast.LENGTH_SHORT)
					.show();
		}
	}
}
