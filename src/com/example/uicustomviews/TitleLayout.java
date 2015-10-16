package com.example.uicustomviews;

import android.app.Activity;
import com.example.uicustomviews.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class TitleLayout extends LinearLayout {
	public TitleLayout(Context context,AttributeSet attrs){
		super(context,attrs);
		LayoutInflater.from(context).inflate(R.layout.title,this);
		Button titleback = (Button) findViewById(R.id.title_back);
		Button titleedit = (Button) findViewById(R.id.title_edit);
		titleback.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				((Activity) getContext()).finish();
			}
		});
		titleedit.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Toast.makeText(getContext(), "Edit", Toast.LENGTH_SHORT).show();
			}
		});
	}

}
