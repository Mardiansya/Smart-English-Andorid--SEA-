package com.rpl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class Tab_lat_tenses2_soal extends Activity implements
		OnCheckedChangeListener {

	TextView hasil, jawaban, jawaban2, jawaban3, jawaban4, jawaban5, jawaban6,
			jawaban7, jawaban8, jawaban9, jawaban10;
	RadioGroup pilihan, pilihan2, pilihan3, pilihan4, pilihan5, pilihan6,
			pilihan7, pilihan8, pilihan9, pilihan10;
	int nilai = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_lat_tenses2_soal);

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

		pilihan3 = (RadioGroup) findViewById(R.id.radioGroup3);
		pilihan3.setOnCheckedChangeListener(this);

		pilihan3 = (RadioGroup) findViewById(R.id.radioGroup3);
		pilihan3.setOnCheckedChangeListener(this);

		pilihan4 = (RadioGroup) findViewById(R.id.radioGroup4);
		pilihan4.setOnCheckedChangeListener(this);

		pilihan5 = (RadioGroup) findViewById(R.id.radioGroup5);
		pilihan5.setOnCheckedChangeListener(this);

		pilihan6 = (RadioGroup) findViewById(R.id.radioGroup6);
		pilihan6.setOnCheckedChangeListener(this);

		pilihan7 = (RadioGroup) findViewById(R.id.radioGroup7);
		pilihan7.setOnCheckedChangeListener(this);

		pilihan8 = (RadioGroup) findViewById(R.id.radioGroup8);
		pilihan8.setOnCheckedChangeListener(this);

		pilihan9 = (RadioGroup) findViewById(R.id.radioGroup9);
		pilihan9.setOnCheckedChangeListener(this);

		pilihan10 = (RadioGroup) findViewById(R.id.radioGroup10);
		pilihan10.setOnCheckedChangeListener(this);

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

	private void koreksi() {
		// TODO Auto-generated method stub
		if (pilihan.getCheckedRadioButtonId() == R.id.radio2) {
			jawaban.setText("Right");
			nilai += 10;
		} else {
			jawaban.setText("Wrong");
		}

		if (pilihan2.getCheckedRadioButtonId() == R.id.radio6) {
			jawaban2.setText("Right");
			nilai += 10;
		} else {
			jawaban2.setText("Wrong");
		}

		if (pilihan3.getCheckedRadioButtonId() == R.id.radio10) {
			jawaban3.setText("Right");
			nilai += 10;
		} else {
			jawaban3.setText("Wrong");
		}

		if (pilihan4.getCheckedRadioButtonId() == R.id.radio15) {
			jawaban4.setText("Right");
			nilai += 10;
		} else {
			jawaban4.setText("Wrong");
		}

		if (pilihan5.getCheckedRadioButtonId() == R.id.radio19) {
			jawaban5.setText("Right");
			nilai += 10;
		} else {
			jawaban5.setText("Wrong");
		}

		if (pilihan6.getCheckedRadioButtonId() == R.id.radio23) {
			jawaban6.setText("Right");
			nilai += 10;
		} else {
			jawaban6.setText("Wrong");
		}

		if (pilihan7.getCheckedRadioButtonId() == R.id.radio27) {
			jawaban7.setText("Right");
			nilai += 10;
		} else {
			jawaban7.setText("Wrong");
		}

		if (pilihan8.getCheckedRadioButtonId() == R.id.radio31) {
			jawaban8.setText("Right");
			nilai += 10;
		} else {
			jawaban8.setText("Wrong");
		}

		if (pilihan9.getCheckedRadioButtonId() == R.id.radio35) {
			jawaban9.setText("Right");
			nilai += 10;
		} else {
			jawaban9.setText("Wrong");
		}

		if (pilihan10.getCheckedRadioButtonId() == R.id.radio36) {
			jawaban10.setText("Right");
			nilai += 10;
		} else {
			jawaban10.setText("Wrong");
		}

	}

	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
	}

}
