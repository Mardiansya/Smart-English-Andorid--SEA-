package com.rpl;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.Toast;
import android.widget.TabHost.TabSpec;

public class Materi extends TabActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_materi);

		TabHost tabHost = getTabHost();

		TabSpec tensesSpec = tabHost.newTabSpec("TENSES");
		tensesSpec.setIndicator("TENSES",
				getResources().getDrawable(R.drawable.tenses));
		Intent tensesIntent = new Intent(this,Tab_tenses.class);
		tensesSpec.setContent(tensesIntent);

		TabSpec readingSpec = tabHost.newTabSpec("Reading");
		readingSpec.setIndicator("Reading",
				getResources().getDrawable(R.drawable.reading));
		Intent readingIntent = new Intent(this, Tab_reading.class);
		readingSpec.setContent(readingIntent);

		TabSpec converSpec = tabHost.newTabSpec("Conversation");
		converSpec.setIndicator("Conversation",
				getResources().getDrawable(R.drawable.conver1));
		Intent converIntent = new Intent(this, Tab_conver.class);
		converSpec.setContent(converIntent);
		
		tabHost.addTab(tensesSpec);
		tabHost.addTab(readingSpec);
		tabHost.addTab(converSpec);		
	}
	
	 @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	    	 MenuInflater menuInflater = getMenuInflater();
	         menuInflater.inflate(R.menu.menu, menu);
	         return true;
	    }
	    /**
	     * Event Handling for Individual menu item selected
	     * Identify single menu item by it's id
	     * */
	    @Override
	    public boolean onOptionsItemSelected(MenuItem item)
	    {
	    	 Intent intent2 = null;
	        switch (item.getItemId())
	        {
	       case R.id.menu_petunjuk:
	    	   intent2 = new Intent(this, Tab_ban_petunjuk.class);
	       	startActivity(intent2);
	            //Toast.makeText(MainActivity.this, "Petunjuk", Toast.LENGTH_SHORT).show();
	            return true;
	 
	        case R.id.menu_about:
	        	Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
	            return true;
	            
	        case R.id.menu_exit:
	        	this.onStop();
	            return true;
	 
	        default:
	            return super.onOptionsItemSelected(item);
	        }
	    }    
}
