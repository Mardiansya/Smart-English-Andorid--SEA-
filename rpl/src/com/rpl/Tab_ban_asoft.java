package com.rpl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Tab_ban_asoft extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_ban_asoft);
		
		TextView tentang = (TextView) findViewById (R.id.textView4);
		String msg = "Support Android Min. Versi 2.2 \n"+ "Start at 31 Oktober 2012 \n" +
					"S1 Pendidikan Teknik informatika \n";
		tentang.setText(msg);
	}
}
