package com.rpl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Tab_read3_bahas extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_read3_bahas);
		
		TextView bahas1 = (TextView) findViewById(R.id.textView2);
		String msg = "Pada paragraph terakhir tertera ‘At 04.30 p.m … start their fun camping programs’. pukul 04.30 p.m menunjukkan waktu ‘in the afternoon’. ";				
		bahas1.setText(msg);
		
		TextView bahas2 = (TextView) findViewById(R.id.textView4);
		String msg2 = "Pada paragraph 3 kalimat pertama “… said the leader while pointing at a garden“, maka jawaban yang tepat adalah “at the garden“. ";		
		bahas2.setText(msg2);
		
		TextView bahas3 = (TextView) findViewById(R.id.textView6);
		String msg3 = "Mengacu pada kalimat “ After that, some girls scout made a fire while some others cooked their lunch”, maka ‘some others’ mengacu pada girls scouts. ";				
		bahas3.setText(msg3);
	}

}
