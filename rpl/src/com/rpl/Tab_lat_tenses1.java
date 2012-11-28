package com.rpl;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TabHost.TabSpec;

public class Tab_lat_tenses1 extends TabActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_lat_tenses1);

		TabHost tabHost = getTabHost();

		TabSpec petunjukSpec = tabHost.newTabSpec("Soal");
		petunjukSpec.setIndicator("Soal",
				getResources().getDrawable(R.drawable.pilgan));
		Intent petunjukIntent = new Intent(this,Tab_lat_tenses1_soal.class);
		petunjukSpec.setContent(petunjukIntent);

		TabSpec petunjuk2Spec = tabHost.newTabSpec("Text");
		petunjuk2Spec.setIndicator("Text",
				getResources().getDrawable(R.drawable.reading));
		Intent petunjuk2Intent = new Intent(this, Tab_lat_tenses1_text.class);
		petunjuk2Spec.setContent(petunjuk2Intent);
		
		tabHost.addTab(petunjukSpec);
		tabHost.addTab(petunjuk2Spec);		
	}
}
