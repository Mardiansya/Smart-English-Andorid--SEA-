package com.rpl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Tab_ban_penjawab extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_ban_penjawab);
		
		TextView bahas0 = (TextView) findViewById(R.id.textView0);
		String msg = "Ada dua jenis soal yang disediakan disini. Yaitu Pilihan Ganda dan Isian";								
		bahas0.setText(msg);
		
		TextView bahas2 = (TextView) findViewById(R.id.textView2);
		String msg2 = "1. Tentukan salah satu jawaban yang paling benar \n"
				+"2. Pilih jawaban dengan mengklik radio button \n"
				+"3. Submit dengan menekan tombol Jawab \n";
		bahas2.setText(msg2);
		
		TextView bahas1 = (TextView) findViewById(R.id.textView4);
		String msg1 = "1. Tentukan jawaban yang benar \n"+
				"2. Tuliskan jawaban anda pada Edit Text"
				+"3. Submit dengan menekan tombol Jawab";
		bahas1.setText(msg1);
	}
}

