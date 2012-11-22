package com.rpl;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Tab_reading3 extends TabActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_reading3);

		TabHost tabHost = getTabHost();

		TabSpec textSpec = tabHost.newTabSpec("Text");
		textSpec.setIndicator("Text",
				getResources().getDrawable(R.drawable.reading));
		Intent textIntent = new Intent(this,Tab_read3_text.class);
		textSpec.setContent(textIntent);

		TabSpec soalSpec = tabHost.newTabSpec("Latihan");
		soalSpec.setIndicator("Latihan",
				getResources().getDrawable(R.drawable.tulis));
		Intent soalIntent = new Intent(this, Tab_read3_soal.class);
		soalSpec.setContent(soalIntent);
		
		TabSpec bahasSpec = tabHost.newTabSpec("Pembahasan");
		bahasSpec.setIndicator("Pembahasan",
				getResources().getDrawable(R.drawable.bahas));
		Intent bahasIntent = new Intent(this, Tab_read3_bahas.class);
		bahasSpec.setContent(bahasIntent);
		
		tabHost.addTab(textSpec);
		tabHost.addTab(soalSpec);
		tabHost.addTab(bahasSpec);
	}
}
