package com.rpl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Tab_read2_bahas extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_read2_bahas);
		
		TextView bahas1 = (TextView) findViewById(R.id.textView2);
		String msg = "Kata sifat yang paling tepat untuk melengkapi teks diatas dalam bentuk superlative dari clue ‘the’ adalah although ";				
		bahas1.setText(msg);
		
		TextView bahas2 = (TextView) findViewById(R.id.textView4);
		String msg2 = "Kata penghubung yang tepat untuk melengkapi teks diatas adalah ‘although’ secara konteks. ";		
		bahas2.setText(msg2);
		
		TextView bahas3 = (TextView) findViewById(R.id.textView6);
		String msg3 = "Kalimat yang harius dilengkapi adalah kalimat pasif, maka kata kerja yang tepat untuk melengkapi adalah ‘called’ ";				
		bahas3.setText(msg3);
	}
}
