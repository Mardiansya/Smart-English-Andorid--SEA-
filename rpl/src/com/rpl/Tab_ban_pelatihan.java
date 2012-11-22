package com.rpl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Tab_ban_pelatihan extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_ban_pelatihan);
		
		TextView bahas0 = (TextView) findViewById(R.id.textView0);
		String msg = "Menu latihan berisi soal-soal untuk mengukur hasil belajar dari materi yang ada pada media ini. Menu ini berisi soal-soal dalam bentuk pilihan ganda dan isian. Untuk memilih jenis soal penguna cukup mengklik submenu peket soal yang ada."+				
				"Pada menu latihan tersedia 6 submenu pilihan paket soal yaitu 2 tenses, 2 reading, so & too, serta either & neither \n"+
				"Masuk: Menu Latihan-->Pilih Paket Soal yang diinginkan";
		bahas0.setText(msg);
	}

}
