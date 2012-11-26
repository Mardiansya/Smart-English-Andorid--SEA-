package com.rpl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class Tab_lat_tenses1_text extends Activity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_lat_tenses1_text);        
        
        TextView teks = (TextView) findViewById (R.id.textView1);
		String msg = "    Elizabeth II, born on 21st April 1926, is the eldest daughter of george VI and Elizabeth bowes – Elyon."
					 +"She married phillip mountbatten, a distant cousin, I 1947. The pair has four children: Charles, Prince of Walles, Anne, Andrew and Edward. "
					+ "She is the first monarch to send her children to boarding schools in order to remove them from the ever-probing media. She has a strong sense of duty and diligence. "
					 +"Her knowledge of current situation and trends is up to date. She possesses a sense of humorous rarely exhibited in public where a dignified presence is her goal.";									
		teks.setText(msg);
	}
}
