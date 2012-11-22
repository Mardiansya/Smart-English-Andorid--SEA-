package com.rpl;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher.ViewFactory;

public class Tab_ban_amaker extends Activity implements ViewFactory,
		OnItemClickListener {
	private ImageSwitcher is;
	Gallery gall;

	Integer[] pics = { R.drawable.mardi, R.drawable.chuzn, R.drawable.faris,
			R.drawable.eva, R.drawable.candra

	};
	ImageView imageView;
	TextView nama;
	TextView sebagai;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_ban_amaker);

		is = (ImageSwitcher) findViewById(R.id.imageSwitcher1);
		is.setFactory(this);
		is.setInAnimation(AnimationUtils.loadAnimation(this,
				android.R.anim.fade_in));
		is.setOutAnimation(AnimationUtils.loadAnimation(this,
				android.R.anim.fade_out));

		gall = (Gallery) findViewById(R.id.Gallery01);
		gall.setAdapter(new ImageAdapter(this));
		gall.setOnItemClickListener(this);
		
		nama = (TextView) findViewById(R.id.TextViewnama);
		sebagai = (TextView) findViewById(R.id.TextViewAs);
	}

	public class ImageAdapter extends BaseAdapter {

		private Context ctx;
		int imageBackground;

		public ImageAdapter(Context c) {
			ctx = c;
			TypedArray ta = obtainStyledAttributes(R.styleable.Gallery1);
			imageBackground = ta.getResourceId(
					R.styleable.Gallery1_android_galleryItemBackground, 1);
			ta.recycle();
		}

		public int getCount() {

			return pics.length;
		}

		public Object getItem(int arg0) {

			return arg0;
		}

		public long getItemId(int arg0) {

			return arg0;
		}

		public View getView(int arg0, View arg1, ViewGroup arg2) {
			ImageView iv = new ImageView(ctx);
			iv.setImageResource(pics[arg0]);
			iv.setScaleType(ImageView.ScaleType.FIT_XY);
			iv.setLayoutParams(new Gallery.LayoutParams(60, 80));
			iv.setBackgroundResource(imageBackground);
			return iv;
		}

	}

	public View makeView() {
		// TODO Auto-generated method stub
		ImageView iv = new ImageView(this);
		iv.setBackgroundColor(0xFF000000);
		iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
		iv.setLayoutParams(new ImageSwitcher.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT));
		return iv;
	}

	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		if(arg2+1 == 1){
			nama.setText("Mardi");
			sebagai.setText("The Leader");
		} else if(arg2+1 == 2){
			nama.setText("Khusnul");
			sebagai.setText("The Analyst");
		} else if(arg2+1 == 3){
			nama.setText("Faris");
			sebagai.setText("The Implements");
		} else if(arg2+1 == 4){
			nama.setText("Eva");
			sebagai.setText("Documenter");
		} else {
			nama.setText("Chandra");
			sebagai.setText("Designer");
		}
			
		is.setImageResource(pics[arg2]);
	
	}
}
