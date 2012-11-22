package com.rpl;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class Help extends ListActivity {

	static final String[] daftarbantuan = new String[] { "Petunjuk","About SEA" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayHelp(this, daftarbantuan));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Object detail = this.getListAdapter().getItem(position);
		String tampil = detail.toString();
		Intent i = null;
		if (tampil == "Petunjuk") {
			i = new Intent(this, Tab_ban_petunjuk.class);
			startActivity(i);
		} else if (tampil == "About SEA") {
			i = new Intent(this, Tab_ban_about.class);
			startActivity(i);
		} else {
			Toast.makeText(this, "Anda Memilih : " + tampil, Toast.LENGTH_SHORT)
					.show();
		}
	}
}
