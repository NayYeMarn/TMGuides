package com.tm.guide;

import android.*;
import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.net.*;

public class MainActivity extends Activity 
{
	
	Button b1;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		b1=(Button)findViewById(R.id.b1);

		b1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent i=new Intent(getApplicationContext(),Command.class);
					startActivity(i);
				}});
				
	}

	public void myFacebook (View myView) {

		String myFacebookId = "100011670754214"; 
		startActivity(Facebook(this,"fb://profile/" + myFacebookId, "https://mobile.facebook.com/profile.php?id=" + myFacebookId));
		this.startActivity(this.Facebook(this, "fb://profile/" + myFacebookId, "https://mobile.facebook.com/profile.php?id=" + myFacebookId));
	}
	public static Intent Facebook (Context context, String wordsID, String wordID) {
        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            Intent goF = new Intent("android.intent.action.VIEW", Uri.parse(wordsID));
            return goF;
        } catch (Exception e) {
            Intent goF = new Intent("android.intent.action.VIEW", Uri.parse(wordID));
            return goF;
        } 
	
    }}
