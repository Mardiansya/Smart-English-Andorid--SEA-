package com.rpl;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class Conversation_4 extends Activity implements OnCheckedChangeListener {
	
	TextView jawaban;
	TextView jawaban2;
	TextView jawaban3;
	RadioGroup pilihan;
	RadioGroup pilihan2;
	EditText inputjawab;
	String jawabanUser="can";
	String inputJawaban;
	private MediaPlayer player;
	private Button musikButton;
	private static final String isPlaying = "Media is Playing";
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.conversation_4);

		pilihan = (RadioGroup) findViewById(R.id.radioGroup1);
		pilihan.setOnCheckedChangeListener(this);
		
		pilihan2 = (RadioGroup) findViewById(R.id.radioGroup2);
		pilihan2.setOnCheckedChangeListener(this);
		
		jawaban = (TextView) findViewById (R.id.textViewAnswer);
		jawaban2 = (TextView) findViewById (R.id.textViewAnswer2);
		jawaban3 = (TextView) findViewById (R.id.textViewAnswer3);
		
		inputjawab = (EditText) findViewById (R.id.editTextJawab);
		
		Button jawab = (Button) findViewById(R.id.buttonSubmit);
		jawab.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				koreksi();
				
			}
		});
		
		Button jawab2 = (Button) findViewById(R.id.buttonSubmit2);
		jawab2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				koreksi2();
				
			}
		});
		
		Button jawab3 = (Button) findViewById(R.id.buttonSubmit3);
		jawab3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				koreksi3();
				
				
			}
		});
		
		musikButton = (Button) findViewById(R.id.button1);
		musikButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				playSound(1);
			}

		});

						
	}
	
	private void playSound(int arg) {
		if (arg == 1) {
			Toast.makeText(this, isPlaying + " Conversation", Toast.LENGTH_LONG).show();
			player = MediaPlayer.create(this, R.raw.c2);
		}
		player.setLooping(false); // Set looping
		player.start();
	}

	public void koreksi(){
		if(pilihan.getCheckedRadioButtonId() == R.id.radio1){
			Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
			jawaban.setText("The Answer: Watch the tv");
		} else {
			Toast.makeText(this, "Jawaban salah", Toast.LENGTH_SHORT).show();
			jawaban.setText("You can answer again!");
		}
		
	}
	
	public void koreksi2(){
		if(pilihan2.getCheckedRadioButtonId() == R.id.radio8){
			Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
			jawaban2.setText("The Answer: No, You can't");
		} else {
			Toast.makeText(this, "Jawaban salah", Toast.LENGTH_SHORT).show();
			jawaban2.setText("You can answer again!");
		}
		
	}
	
	public void koreksi3(){
		inputJawaban= inputjawab.getText().toString();
		if(inputJawaban.equals(jawabanUser)){
			Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
			jawaban3.setText("The Answer: can");			
		} else {
			Toast.makeText(this, "Jawaban salah", Toast.LENGTH_SHORT).show();
			jawaban3.setText("You can answer again!");
		}
	}

	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}
		

}
