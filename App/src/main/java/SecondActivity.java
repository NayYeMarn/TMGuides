package com.tm.guide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.io.InputStream;
import android.content.res.AssetManager;
import java.io.IOException;
import java.util.ArrayList;
import android.app.*;
import android.widget.*;
import com.bumptech.glide.*;

public class SecondActivity extends Activity {

	private TextView txtContent;
	private String[] txtFiles = {"About Command","A-Rat=Remote Access Tool","Autopixie-WPS","BlackEye","Breacher","Brutal","Brutespray","Check-URL","Commix","Crips IP Tools","Cyber Scan","Download any files","Download facebook Video","Evilurl Homograph","G Zip file creator","Globin word Generator","Hakku-Framework","Harvester-Email Info","Hulk-DOS Tools","I Termux Arc Linux","Infoga-Collect-Email-Info","Ipgeolocation","Knock Mail","Knockspy","Lazyfiglet","Lazymux Tools","Matrix Effect","Metaspliot Framework","Nikto Web server scanner","Password Generator","Red Hawk","Router Spliot Framework","Santet Online","SMS+Call Bomber","Sqliscan","Striker","Sublist3r","Sudo Superuser","Termux Call","Termux Laszy Script","Termux send SMS","Thech Choice","TM-Scanner","TM-Venom","Visql Scan","Wbseku Tool","Webshell","Word Press Scanner","XERXES","Zarp Local Network","Thank"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		ImageView img=(ImageView)findViewById(R.id.img);
		Glide.with(this).load(R.drawable.c_c).asGif().into(img);	
		getActionBar().hide();
		int userClickedPosition = getIntent().getExtras().get("userClicked");
		txtContent = (TextView)findViewById(R.id.activitysecondTextView);
		AssetManager assetManager = getAssets();
		// To load text file
		InputStream input;
		String s = txtFiles[userClickedPosition];
		try {
			input = assetManager.open(s+".txt");

			int size = input.available();
			byte[] buffer = new byte[size];
			input.read(buffer);
			input.close();

			
			String text = new String(buffer);

			txtContent.setText(text);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
