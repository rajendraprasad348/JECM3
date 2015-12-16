package com.jsp.weatherupdates;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView messagetextview;
	Button refreshbutton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		messagetextview = (TextView) findViewById(R.id.textView1);
		refreshbutton = (Button) findViewById(R.id.buttonrefresh);
		
		refreshbutton.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				Netwrok_Job obj = new Netwrok_Job();
				obj.execute();
				
			}
		});
		
		
	}


}
