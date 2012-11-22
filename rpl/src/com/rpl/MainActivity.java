package com.rpl;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        final Button button1 = (Button) findViewById (R.id.button_materi);
        final Button button2 = (Button) findViewById (R.id.button_latihan);
        final Button button3 = (Button) findViewById (R.id.button_help);
        
        button1.setOnClickListener(new View.OnClickListener() {	
			public void onClick(View f) {
				// TODO Auto-generated method stub
				CallIntent(f);
				}
		});
        
        button2.setOnClickListener(new View.OnClickListener() {	
			public void onClick(View f) {
				// TODO Auto-generated method stub
				CallIntent(f);
				//Toast.makeText(MainActivity.this, "Anda Menekan Button 2", Toast.LENGTH_SHORT).show();
				}
		});
        
        button3.setOnClickListener(new View.OnClickListener() {	
        	public void onClick(View f) {
				// TODO Auto-generated method stub
				CallIntent(f);
				}
		});
    }
        
        public void CallIntent(View view) {
  	      Intent intent = null;
  	        switch (view.getId()) {
  	        case R.id.button_materi:
  	        	intent = new Intent(MainActivity.this, Materi.class);
  	        	startActivity(intent);
  	            break;
  	        case R.id.button_latihan:
  	        	intent = new Intent(MainActivity.this, Latihan.class);
  	        	startActivity(intent);
  	        	//Toast.makeText(this, "Button Latihan", Toast.LENGTH_SHORT).show();
  	            break;
  	      case R.id.button_help:
  	    	intent = new Intent(MainActivity.this, Help.class);
	        	startActivity(intent);
	            break;
  	        default:
  	            break;
  	    }
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
    	   intent2 = new Intent(MainActivity.this, Tab_ban_petunjuk.class);
       	startActivity(intent2);
            //Toast.makeText(MainActivity.this, "Petunjuk", Toast.LENGTH_SHORT).show();
            return true;
 
        case R.id.menu_about:
        	intent2 = new Intent(MainActivity.this, Tab_ban_about.class);
           	startActivity(intent2);
        	//Toast.makeText(MainActivity.this, "About", Toast.LENGTH_SHORT).show();
            return true;
            
        case R.id.menu_exit:
        	this.finish();
            return true;
 
        default:
            return super.onOptionsItemSelected(item);
        }
    }    
    
}
