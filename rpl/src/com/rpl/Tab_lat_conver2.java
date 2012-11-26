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

public class Tab_lat_conver2 extends Activity implements
OnCheckedChangeListener {
	
	TextView hasil, jawaban, jawaban2, jawaban3, jawaban4, jawaban5, jawaban6,
		jawaban7, jawaban8, jawaban9, jawaban10;	
	RadioGroup pilihan, pilihan2, pilihan4, pilihan6, pilihan8, pilihan9;
	EditText pilihan3, pilihan5, pilihan7, pilihan10;
	int nilai = 0;
		
	String kunci_pilihan3="like";
	String kunci_pilihan5="like";
	String kunci_pilihan7="like";
	String kunci_pilihan10="like";
	String Spilihan3, Spilihan5, Spilihan7, Spilihan10;
	
	private MediaPlayer player;
	//private Button musikButton;
	private static final String isPlaying = "Media is Playing";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_lat_conver1);
		
		TextView soal1 = (TextView) findViewById(R.id.textViewSoal);
		String msg = "(..1..)";
		soal1.setText(msg);

		TextView soal2 = (TextView) findViewById(R.id.textViewSoal2);
		String msg2 = "(..2..)";
		soal2.setText(msg2);

		TextView soal3 = (TextView) findViewById(R.id.textViewSoal3);
		String msg3 = "(..3..)";
		soal3.setText(msg3);

		TextView soal4 = (TextView) findViewById(R.id.textViewSoal4);
		String msg4 = "(..3..)";
		soal4.setText(msg4);

		TextView soal5 = (TextView) findViewById(R.id.textViewSoal5);
		String msg5 = "(..3..)";
		soal5.setText(msg5);

		TextView soal6 = (TextView) findViewById(R.id.textViewSoal6);
		String msg6 = "(..3..)";
		soal6.setText(msg6);

		TextView soal7 = (TextView) findViewById(R.id.textViewSoal7);
		String msg7 = "(..3..)";
		soal7.setText(msg7);

		TextView soal8 = (TextView) findViewById(R.id.textViewSoal8);
		String msg8 = "(..3..)";
		soal8.setText(msg8);

		TextView soal9 = (TextView) findViewById(R.id.textViewSoal9);
		String msg9 = "Complete the sentence! (..9..)";
		soal9.setText(msg9);

		TextView soal10 = (TextView) findViewById(R.id.textViewSoal10);
		String msg10 = "Complete the sentence! (..10..)";
		soal10.setText(msg10);
		
		pilihan = (RadioGroup) findViewById(R.id.radioGroup1);
		pilihan.setOnCheckedChangeListener(this);

		pilihan2 = (RadioGroup) findViewById(R.id.radioGroup2);
		pilihan2.setOnCheckedChangeListener(this);

		pilihan4 = (RadioGroup) findViewById(R.id.radioGroup4);
		pilihan4.setOnCheckedChangeListener(this);

		pilihan6 = (RadioGroup) findViewById(R.id.radioGroup6);
		pilihan6.setOnCheckedChangeListener(this);

		pilihan8 = (RadioGroup) findViewById(R.id.radioGroup8);
		pilihan8.setOnCheckedChangeListener(this);

		pilihan9 = (RadioGroup) findViewById(R.id.radioGroup9);
		pilihan9.setOnCheckedChangeListener(this);
		
		pilihan3 = (EditText) findViewById(R.id.editTextJawab3);
		pilihan5 = (EditText) findViewById(R.id.editTextJawab5);
		pilihan7 = (EditText) findViewById(R.id.editTextJawab7);
		pilihan10 = (EditText) findViewById(R.id.editTextJawab10);

		Button conver1 = (Button) findViewById(R.id.buttonConver1);
		conver1.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				playSound(1);
			}

		});
		
		Button conver2 = (Button) findViewById(R.id.buttonConver2);
		conver2.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				playSound(2);
			}

		});
		
		Button conver3 = (Button) findViewById(R.id.buttonConver3);
		conver3.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				playSound(3);
			}

		});
		
		Button conver4 = (Button) findViewById(R.id.buttonConver4);
		conver4.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				playSound(4);
			}

		});
		
		hasil = (TextView) findViewById(R.id.textViewHasil);
		jawaban = (TextView) findViewById(R.id.textViewAnswer);
		jawaban2 = (TextView) findViewById(R.id.textViewAnswer2);
		jawaban3 = (TextView) findViewById(R.id.textViewAnswer3);
		jawaban4 = (TextView) findViewById(R.id.textViewAnswer4);
		jawaban5 = (TextView) findViewById(R.id.textViewAnswer5);
		jawaban6 = (TextView) findViewById(R.id.textViewAnswer6);
		jawaban7 = (TextView) findViewById(R.id.textViewAnswer7);
		jawaban8 = (TextView) findViewById(R.id.textViewAnswer8);
		jawaban9 = (TextView) findViewById(R.id.textViewAnswer9);
		jawaban10 = (TextView) findViewById(R.id.textViewAnswer10);

		Button jawab = (Button) findViewById(R.id.buttonSubmit);
		jawab.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				koreksi();
				hasil.setText("Your Score: " + nilai);
			}

		});

	}
	
	private void playSound(int arg) {
		if (arg == 1) {
			Toast.makeText(this, isPlaying + " Conversation 1", Toast.LENGTH_LONG).show();
			player = MediaPlayer.create(this, R.raw.c3);
		} else if(arg == 2) {
			Toast.makeText(this, isPlaying + " Conversation 2", Toast.LENGTH_LONG).show();
			player = MediaPlayer.create(this, R.raw.c4);
		} else if(arg == 3) {
			Toast.makeText(this, isPlaying + " Conversation 3", Toast.LENGTH_LONG).show();
			player = MediaPlayer.create(this, R.raw.c5);
		} else if(arg == 4) {
			Toast.makeText(this, isPlaying + " Conversation 4", Toast.LENGTH_LONG).show();
			player = MediaPlayer.create(this, R.raw.c6);
		}
		player.setLooping(false); // Set looping
		player.start();
	}
	
	private void koreksi() {
		// TODO Auto-generated method stub
		if (pilihan.getCheckedRadioButtonId() == R.id.radio0) {
			jawaban.setText("Right");
			nilai += 10;
		} else {
			jawaban.setText("Wrong");
		}

		if (pilihan2.getCheckedRadioButtonId() == R.id.radio4) {
			jawaban2.setText("Right");
			nilai += 10;
		} else {
			jawaban2.setText("Wrong");
		}		

		if (pilihan4.getCheckedRadioButtonId() == R.id.radio8) {
			jawaban4.setText("Right");
			nilai += 10;
		} else {
			jawaban4.setText("Wrong");
		}		

		if (pilihan6.getCheckedRadioButtonId() == R.id.radio12) {
			jawaban6.setText("Right");
			nilai += 10;
		} else {
			jawaban6.setText("Wrong");
		}	

		if (pilihan8.getCheckedRadioButtonId() == R.id.radio16) {
			jawaban8.setText("Right");
			nilai += 10;
		} else {
			jawaban8.setText("Wrong");
		}

		if (pilihan9.getCheckedRadioButtonId() == R.id.radio20) {
			jawaban9.setText("Right");
			nilai += 10;
		} else {
			jawaban9.setText("Wrong");
		}	
		
		Spilihan3 = pilihan3.getText().toString();
		if(Spilihan3.equals(kunci_pilihan3)){
			jawaban3.setText("Right");
			nilai += 10;
		} else {
			jawaban3.setText("Wrong");
		}
		
		Spilihan5 = pilihan5.getText().toString();
		if(Spilihan5.equals(kunci_pilihan5)){
			jawaban5.setText("Right");
			nilai += 10;
		} else {
			jawaban5.setText("Wrong");
		}
		
		Spilihan7 = pilihan7.getText().toString();
		if(Spilihan7.equals(kunci_pilihan7)){
			jawaban7.setText("Right");
			nilai += 10;
		} else {
			jawaban7.setText("Wrong");
		}
		
		Spilihan10 = pilihan10.getText().toString();
		if(Spilihan10.equals(kunci_pilihan10)){
			jawaban10.setText("Right");
			nilai += 10;
		} else {
			jawaban10.setText("Wrong");
		}
	}

	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}


}
