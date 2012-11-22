package com.rpl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Tab_read1_bahas extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_read1_bahas);
		
		TextView bahas1 = (TextView) findViewById(R.id.textView2);
		String msg = "Nilai moral dari cerita tersebut bahwa kita harus berhati-hati dalam memilih seseorang. Maka jawaban yang tepat adalah "
				+ "“We have to be careful to choosing the person to chase our live with” ";
		bahas1.setText(msg);
		
		TextView bahas2 = (TextView) findViewById(R.id.textView4);
		String msg2 = "Nilai moral dari cerita tersebut bahwa kita harus berhati-hati dalam memilih seseorang. Maka jawaban yang tepat adalah "
				+ "“We have to be careful to choosing the person to chase our live with” ";
		bahas2.setText(msg2);
		
		TextView bahas3 = (TextView) findViewById(R.id.textView6);
		String msg3 = "Pada paragraph lima disimpulkan bahwa ratu akan mengujunya dengan melihat reaksi para sheik setelah dihidangkan dengan makanan yang sama yang diberikan kepada ratu. "
				+ "Maka jawaban yang tepat adalah “There sheiks” ";
		bahas3.setText(msg3);
	}

}
