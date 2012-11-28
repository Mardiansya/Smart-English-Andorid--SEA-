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
	RadioGroup pilihan, pilihan3, pilihan5, pilihan7, pilihan9;
	EditText pilihan2, pilihan4, pilihan6, pilihan8, pilihan10;
	int nilai = 0;
		
	String kunci_pilihan2="cat";
	String kunci_pilihan4="yes";
	String kunci_pilihan6="interest";
	String kunci_pilihan8="agree";
	String kunci_pilihan10="my sister";
	String Spilihan2, Spilihan4, Spilihan6, Spilihan8, Spilihan10;
	
	private MediaPlayer player;
	//private Button musikButton;
	private static final String isPlaying = "Media is Playing";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_lat_conver2);
		
		TextView soal1 = (TextView) findViewById(R.id.textViewSoal);
		String msg = "What does the second speaker say?";
		soal1.setText(msg);

		TextView soal2 = (TextView) findViewById(R.id.textViewSoal2);
		String msg2 = "What animal does  unlike by the first speaker?";
		soal2.setText(msg2);

		TextView soal3 = (TextView) findViewById(R.id.textViewSoal3);
		String msg3 = "What does the second speaker say?";
		soal3.setText(msg3);

		TextView soal4 = (TextView) findViewById(R.id.textViewSoal4);
		String msg4 = "Does the second speaker same with faris?(yes/no)";
		soal4.setText(msg4);

		TextView soal5 = (TextView) findViewById(R.id.textViewSoal5);
		String msg5 = "What does the second speaker say?";
		soal5.setText(msg5);

		TextView soal6 = (TextView) findViewById(R.id.textViewSoal6);
		String msg6 = "I am not (..6..) with the bag)";
		soal6.setText(msg6);

		TextView soal7 = (TextView) findViewById(R.id.textViewSoal7);
		String msg7 = "What does the first speaker love?";
		soal7.setText(msg7);

		TextView soal8 = (TextView) findViewById(R.id.textViewSoal8);
		String msg8 = "Does the second speaker agree with the first speaker? (agree/ disagree)";
		soal8.setText(msg8);

		TextView soal9 = (TextView) findViewById(R.id.textViewSoal9);
		String msg9 = "What does the second speaker say?";
		soal9.setText(msg9);

		TextView soal10 = (TextView) findViewById(R.id.textViewSoal10);
		String msg10 = "She is like (..10..)";
		soal10.setText(msg10);
		
		pilihan = (RadioGroup) findViewById(R.id.radioGroup1);
		pilihan.setOnCheckedChangeListener(this);

		pilihan3 = (RadioGroup) findViewById(R.id.radioGroup3);
		pilihan3.setOnCheckedChangeListener(this);

		pilihan5 = (RadioGroup) findViewById(R.id.radioGroup5);
		pilihan5.setOnCheckedChangeListener(this);

		pilihan7 = (RadioGroup) findViewById(R.id.radioGroup7);
		pilihan7.setOnCheckedChangeListener(this);		

		pilihan9 = (RadioGroup) findViewById(R.id.radioGroup9);
		pilihan9.setOnCheckedChangeListener(this);
		
		pilihan2 = (EditText) findViewById(R.id.editTextJawab2);
		pilihan4 = (EditText) findViewById(R.id.editTextJawab4);
		pilihan6 = (EditText) findViewById(R.id.editTextJawab6);
		pilihan8 = (EditText) findViewById(R.id.editTextJawab8);
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
		
		Button conver5 = (Button) findViewById(R.id.buttonConver5);
		conver5.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				playSound(5);
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
			player = MediaPlayer.create(this, R.raw.e4);
		} else if(arg == 2) {
			Toast.makeText(this, isPlaying + " Conversation 2", Toast.LENGTH_LONG).show();
			player = MediaPlayer.create(this, R.raw.e5);
		} else if(arg == 3) {
			Toast.makeText(this, isPlaying + " Conversation 3", Toast.LENGTH_LONG).show();
			player = MediaPlayer.create(this, R.raw.e6);
		} else if(arg == 4) {
			Toast.makeText(this, isPlaying + " Conversation 4", Toast.LENGTH_LONG).show();
			player = MediaPlayer.create(this, R.raw.e7);
		} else if(arg == 5) {
			Toast.makeText(this, isPlaying + " Conversation 5", Toast.LENGTH_LONG).show();
			player = MediaPlayer.create(this, R.raw.e8);
		}
		player.setLooping(false); // Set looping
		player.start();
	}
	
	private void koreksi() {
		// TODO Auto-generated method stub
		if (pilihan.getCheckedRadioButtonId() == R.id.radio2) {
			jawaban.setText("Right");
			nilai += 10;
		} else {
			jawaban.setText("Wrong");
		}

		if (pilihan.getCheckedRadioButtonId() == R.id.radio7) {
			jawaban3.setText("Right");
			nilai += 10;
		} else {
			jawaban3.setText("Wrong");
		}		

		if (pilihan5.getCheckedRadioButtonId() == R.id.radio9) {
			jawaban5.setText("Right");
			nilai += 10;
		} else {
			jawaban5.setText("Wrong");
		}		

		if (pilihan7.getCheckedRadioButtonId() == R.id.radio14) {
			jawaban7.setText("Right");
			nilai += 10;
		} else {
			jawaban6.setText("Wrong");
		}	

		if (pilihan9.getCheckedRadioButtonId() == R.id.radio16) {
			jawaban9.setText("Right");
			nilai += 10;
		} else {
			jawaban8.setText("Wrong");
		}
			
		
		Spilihan2 = pilihan2.getText().toString();
		if(Spilihan2.equals(kunci_pilihan2)){
			jawaban2.setText("Right");
			nilai += 10;
		} else {
			jawaban2.setText("Wrong");
		}
		
		Spilihan4 = pilihan4.getText().toString();
		if(Spilihan4.equals(kunci_pilihan4)){
			jawaban4.setText("Right");
			nilai += 10;
		} else {
			jawaban4.setText("Wrong");
		}
		
		Spilihan6 = pilihan6.getText().toString();
		if(Spilihan6.equals(kunci_pilihan6)){
			jawaban6.setText("Right");
			nilai += 10;
		} else {
			jawaban6.setText("Wrong");
		}
		
		Spilihan8 = pilihan8.getText().toString();
		if(Spilihan8.equals(kunci_pilihan8)){
			jawaban8.setText("Right");
			nilai += 10;
		} else {
			jawaban8.setText("Wrong");
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
