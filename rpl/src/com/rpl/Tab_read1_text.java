package com.rpl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Tab_read1_text extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_read1_text);
		
		TextView teks = (TextView) findViewById (R.id.textView1);
		String msg = "    Maura, who liked to be thought of as the most beautiful and powerful queen of Arabia,  had many suitors. One by one she had discarded them, until her list was reduced to just three sheiks, all equally young and handsome, rich and strong."
					 +"it was very hard to decide who  would be the best of them. \n"
					+ "    One evening, Maura disguised herself and went to the camp of three sheiks, as they were about to have dinner, and asked them for something to eat. \n"
					 +"   The first gave her some leftover food; the second gave her some unappetizing camel’s tail; the third sheik, who was called hakim, offered her some of the most tender and tasty meat. After dinner, the disgulsed  queen left the sheik’s camp. \n"
					+"   The following day the queen invited a plate of delicious meat, refused to eat it if the order  two could not share it with him, and this act  finally convince Queen Maura that he was the man for her. \n"
					 +"    “Without question, Hakim is the most generous of you,” she announced her choice to the sheiks. “So it is Hakim I will marry.” ";
		teks.setText(msg);
	}
}
