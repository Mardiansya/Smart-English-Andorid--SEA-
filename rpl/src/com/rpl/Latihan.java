package com.rpl;

import android.app.ListActivity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;
import android.widget.TabHost.TabSpec;

public class Latihan extends ListActivity {

	static final String[] daftarlatihan = new String[] { "Tenses 1","Tenses 2","Reading 1","Reading 2","So & Too","Either & Neither" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayLatihan(this, daftarlatihan));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Object detail = this.getListAdapter().getItem(position);
		String tampil = detail.toString();
		Intent i = null;
		if (tampil == "Tenses 1") {
			i = new Intent(this, Tab_lat_tenses1.class);
			startActivity(i);
		} else if (tampil == "Tenses 2") {
			i = new Intent(this, Tab_ban_about.class);
			startActivity(i);
		} else {
			Toast.makeText(this, "Anda Memilih : " + tampil, Toast.LENGTH_SHORT)
					.show();
		}
	}
}
