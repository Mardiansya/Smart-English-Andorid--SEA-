package com.rpl;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class Tab_reading extends ListActivity {
	
	static final String[] daftarreading = new String[] { "Narrative", "Report", "Recount"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayTab_reading(this, daftarreading));
		//setContentView(R.layout.tab_reading);
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Object detail = this.getListAdapter().getItem(position);
		String tampil = detail.toString();
		Intent i = null;
		if (tampil == "Narrative") {
			i = new Intent(this, Tab_reading1.class);
			startActivity(i);
		} else if (tampil == "Report") {
			i = new Intent(this, Tab_reading2.class);
			startActivity(i);
		} else if (tampil == "Recount") {
			i = new Intent(this, Tab_reading3.class);
			startActivity(i);
		} else {
			Toast.makeText(this, "Anda Memilih : " + tampil, Toast.LENGTH_SHORT)
					.show();
		}
	}

}
