package com.rpl;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;

public class Splash extends Activity {
	protected boolean _active = true;
	protected int _splashtime = 10000;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
       // MediaPlayer player = MediaPlayer.create(this, R.raw.start);
        //player.start();
        
        Thread splashTread = new Thread() {
        	public void run(){
        		try{
        			sleep(3000);
        		} catch (InterruptedException e){
        			e.printStackTrace();
        		} finally {
        			finish();
        			Intent i = new Intent (Splash.this,MainActivity.class);
        				startActivityForResult(i,0);
        		}
        	}
        };
        splashTread.start();
	}
}
