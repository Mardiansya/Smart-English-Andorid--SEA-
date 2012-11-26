package com.rpl;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Tab_lat_tenses2 extends TabActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_lat_tenses2);

		TabHost tabHost = getTabHost();

		TabSpec petunjukSpec = tabHost.newTabSpec("Soal");
		petunjukSpec.setIndicator("Soal",
				getResources().getDrawable(R.drawable.tulis));
		Intent petunjukIntent = new Intent(this,Tab_lat_tenses2_soal.class);
		petunjukSpec.setContent(petunjukIntent);

		TabSpec petunjuk2Spec = tabHost.newTabSpec("Text");
		petunjuk2Spec.setIndicator("Text",
				getResources().getDrawable(R.drawable.reading));
		Intent petunjuk2Intent = new Intent(this, Tab_lat_tenses2_text.class);
		petunjuk2Spec.setContent(petunjuk2Intent);
		
		tabHost.addTab(petunjukSpec);
		tabHost.addTab(petunjuk2Spec);		
	}
}
