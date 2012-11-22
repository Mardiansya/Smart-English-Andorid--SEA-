package com.rpl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Tab_read2_text extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_read2_text);
		
		TextView teks = (TextView) findViewById (R.id.textView1);
		String msg = "    A petrol car engine converts petrol into motion so that the car can move. "+
						"The (..1..) way to do that is to burn the petrol inside an egine (..2..), a car engine is an internal combustion engine – combustion takes place internally. "+ 
						"Almost all cars currently use what \n is (..3..) a four";					
		teks.setText(msg);
	}
}
