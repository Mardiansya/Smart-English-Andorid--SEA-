package com.rpl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Tab_lat_tenses2_text extends Activity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_lat_tenses1_text);   
        
        TextView teks = (TextView) findViewById (R.id.textView1);
		String msg = "    Many people call platypus duckbill because the animal has a bill like duckbill. Platypus is a native Tasmania and Southern and Eastern Australia."
					 +"Platypus (..9..) a flat tail and webbed feet. Its body length is 30 to 45 cm and covered with a thick and woolly layer of fur."
					+ "Its bill is detecting prey and stirring up mud. Platypus’s eyes and head are small. It has no ears but has ability to sense sound and light.\n"
					 +"   Platypus lives in streams, rivers, and lake. Female platypus usually dig burrows in streams or river banks. "
					+"The burrows are blocked with soil to (..10..) it from intruders and flooding. In the other hand, male platypus does not need burrows to stay.";					 
		teks.setText(msg);
	}
}
