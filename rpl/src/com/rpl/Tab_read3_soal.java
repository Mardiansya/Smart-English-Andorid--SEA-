package com.rpl;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class Tab_read3_soal extends Activity implements OnCheckedChangeListener{
	
	TextView jawaban;
	TextView jawaban2;
	TextView jawaban3;
	RadioGroup pilihan;
	RadioGroup pilihan2;
	RadioGroup pilihan3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_read3_soal);

		TextView soal1 = (TextView) findViewById(R.id.textViewSoal);
		String msg = "When did the scout begin their fun camping programs?";
		soal1.setText(msg);
		
		TextView soal2 = (TextView) findViewById(R.id.textViewSoal2);
		String msg2 = "The scout set the tense up ....";
		soal2.setText(msg2);
		
		TextView soal3 = (TextView) findViewById(R.id.textViewSoal3);
		String msg3 = "“… and Some other cooked the lunch” (Paragraph 3 line 5)\n"+
				"What does the underline refer to?";
		soal3.setText(msg3);
		
		pilihan = (RadioGroup) findViewById(R.id.radioGroup1);
		pilihan.setOnCheckedChangeListener(this);
		
		pilihan2 = (RadioGroup) findViewById(R.id.radioGroup2);
		pilihan2.setOnCheckedChangeListener(this);
		
		pilihan3 = (RadioGroup) findViewById(R.id.radioGroup3);
		pilihan3.setOnCheckedChangeListener(this);
		
		jawaban = (TextView) findViewById (R.id.textViewAnswer);
		jawaban2 = (TextView) findViewById (R.id.textViewAnswer2);
		jawaban3 = (TextView) findViewById (R.id.textViewAnswer3);
		
		
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
	}
	
	private void koreksi() {
		// TODO Auto-generated method stub
		if(pilihan.getCheckedRadioButtonId() == R.id.radio3){
			Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
			jawaban.setText("The Answer: In the afternoon");
		} else {
			Toast.makeText(this, "Jawaban salah", Toast.LENGTH_SHORT).show();
			jawaban.setText("You can answer again!");
		}
		
	}
	
	private void koreksi2() {
		// TODO Auto-generated method stub
		if(pilihan2.getCheckedRadioButtonId() == R.id.radio6){
			Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
			jawaban2.setText("The Answer: At the garden");
		} else {
			Toast.makeText(this, "Jawaban salah", Toast.LENGTH_SHORT).show();
			jawaban2.setText("You can answer again!");
		}
	}
	
	private void koreksi3() {
		// TODO Auto-generated method stub
		if(pilihan3.getCheckedRadioButtonId() == R.id.radio9){
			Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
			jawaban3.setText("The Answer: The girls scouts");			
		} else {
			Toast.makeText(this, "Jawaban salah", Toast.LENGTH_SHORT).show();
			jawaban3.setText("You can answer again!");
		}
	}
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		
	}


}
