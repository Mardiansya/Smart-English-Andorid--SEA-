package com.rpl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Tab_read3_text extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_read3_text);
		
		TextView teks = (TextView) findViewById (R.id.textView1);
		String msg = "    Last weekend the girl scouts and the boy scouts of my school had their first fun camping outside the school. \n"+
				"     They left for Cikoneng at 05.00 a.m. After a long and thrilling drive they arrived at the village and found a good camping site. \n"+ 
				"     “Let’set up our tents there,” said the leader while pointing at a garden. Then, they started to work. in a short time the tents were ready and they put a small flag on the top of each tent. After that, some girl scouts made a fire while some others cooked their lunch. The boys were busy working.\n"
				+"     The lunch was ready at 03.00 and they immediately  started to eat. After that, they took a little rest. \n"+
				"     At 04.00 p.m the leader blew his whistle and all the girl scouts and the boy scouts gathered around to start their fun camping programs. ";					
		teks.setText(msg);
	}

}
