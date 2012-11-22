package com.rpl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Tab_ban_pemateri extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_ban_pemateri);
		
		TextView bahas0 = (TextView) findViewById(R.id.textView0);
		String msg = "Untuk masuk menu materi klik button menu MATERI pada halaman utama. Pada menu belajar tersedia beberapa submenu pilihan yaitu tenses, reading, dan conversation. "
				+ "“We have to be careful to choosing the person to chase our live with” ";
		bahas0.setText(msg);
		
		TextView bahas1 = (TextView) findViewById(R.id.textView4);
		String msg1 = "Pada submenu reading tersedia 3 tab yaitu text, soal, dan pembahasan. \n"
				+ "Masuk: Menu Materi-->Tab Reading-->Pilih Reading yang diinginkan ";
		bahas1.setText(msg1);
		
		TextView bahas2 = (TextView) findViewById(R.id.textView2);
		String msg2 = "Pada submenu tenses tersedia sejumlah 16 tenses. Klik nama tenses untuk mempelajarinya. \n"
				+"Masuk: Menu Materi-->Tab Tenses-->Pilih Tenses yang ingin dipelajari";		
		bahas2.setText(msg2);
		
		TextView bahas3 = (TextView) findViewById(R.id.textView6);
		String msg3 = "Pada submenu conversation tersedia sejumlah 5 contoh materi percakapan yang dilengkapi dengan soal latihan. \n"
				+"Untuk mendengarkan percakapan, klik button PLAY. \n"+
				"Masuk: Menu Materi-->Tab Conversation-->Pilih materi yang ingin dipelajari";
		bahas3.setText(msg3);
	}

}
