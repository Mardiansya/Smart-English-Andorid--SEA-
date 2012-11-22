package com.rpl;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Tab_ban_petunjuk extends TabActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_ban_petunjuk);

		TabHost tabHost = getTabHost();

		TabSpec petunjukSpec = tabHost.newTabSpec("Materi");
		petunjukSpec.setIndicator("Materi",
				getResources().getDrawable(R.drawable.book));
		Intent petunjukIntent = new Intent(this,Tab_ban_pemateri.class);
		petunjukSpec.setContent(petunjukIntent);

		TabSpec petunjuk2Spec = tabHost.newTabSpec("Latihan");
		petunjuk2Spec.setIndicator("Latihan",
				getResources().getDrawable(R.drawable.tulis));
		Intent petunjuk2Intent = new Intent(this, Tab_ban_pelatihan.class);
		petunjuk2Spec.setContent(petunjuk2Intent);
		
		TabSpec petunjuk3Spec = tabHost.newTabSpec("Menjawab Soal");
		petunjuk3Spec.setIndicator("Menjawab Soal",
				getResources().getDrawable(R.drawable.bahas));
		Intent petunjuk3Intent = new Intent(this, Tab_ban_penjawab.class);
		petunjuk3Spec.setContent(petunjuk3Intent);
		
		tabHost.addTab(petunjukSpec);
		tabHost.addTab(petunjuk2Spec);
		tabHost.addTab(petunjuk3Spec);
	}
}
