package com.rpl;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Tab_ban_about extends TabActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_ban_about);

		TabHost tabHost = getTabHost();

		TabSpec petunjukSpec = tabHost.newTabSpec("SEA");
		petunjukSpec.setIndicator("SEA",
				getResources().getDrawable(R.drawable.about1));
		Intent petunjukIntent = new Intent(this,Tab_ban_asoft.class);
		petunjukSpec.setContent(petunjukIntent);

		TabSpec petunjuk2Spec = tabHost.newTabSpec("Maker");
		petunjuk2Spec.setIndicator("Maker",
				getResources().getDrawable(R.drawable.about2));
		Intent petunjuk2Intent = new Intent(this, Tab_ban_amaker.class);
		petunjuk2Spec.setContent(petunjuk2Intent);
		
		tabHost.addTab(petunjukSpec);
		tabHost.addTab(petunjuk2Spec);		
	}
}
