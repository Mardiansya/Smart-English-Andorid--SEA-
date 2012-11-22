package com.rpl;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class Tab_conver extends ListActivity{
	
	static final String[] daftarconver = new String[] { "Conversation 1", "Conversation 2",
		"Conversation 3", "Conversation 4", "Conversation 5"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayTab_conver(this, daftarconver));
		//setContentView(R.layout.tab_conver);
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Object detail = this.getListAdapter().getItem(position);
		String tampil = detail.toString();
		Intent i = null;
		if (tampil == "Conversation 1") {
			i = new Intent(this, Conversation_1.class);
			startActivity(i);
		} else if (tampil == "Conversation 2") {
			i = new Intent(this, Conversation_2.class);
			startActivity(i);			
		} else if (tampil == "Conversation 3") {
			i = new Intent(this, Conversation_3.class);
			startActivity(i);
		} else if (tampil == "Conversation 4") {
			i = new Intent(this, Conversation_4.class);
			startActivity(i);
		} else if (tampil == "Conversation 5") {
			i = new Intent(this, Conversation_5.class);
			startActivity(i);
		} else {
			Toast.makeText(this, "Anda Memilih : " + tampil, Toast.LENGTH_SHORT)
					.show();
		}
	}



}
