package com.tm.guide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.Adapter;
import android.view.View;
import android.content.Intent;
import android.widget.*;
import com.bumptech.glide.*;

import android.*;


public class Command extends Activity implements OnItemClickListener
{
	

	String[] strs = {"About Command","A-Rat=Remote Access Tool","Autopixie","BlackEye","Breacher","Brutal","Brutespray","Check-URL","Commix","Crips IP Tools","Cyber Scan","Download any files","Download facebook Video","Evilurl Homograph","G Zip file creator","Globin word Generator","Hakku-Framework","Harvester-Email Info","Hulk-DOS Tools","I Termux Arc Linux","Infoga-Collect-Email-Info","Ipgeolocation","Knock Mail","Knockspy","Lazyfiglet","Lazymux Tools","Matrix Effect","Metaspliot Framework","Nikto Web server scanner","Password Generator","Red Hawk","Router Spliot Framework","Santet Online","SMS+Call Bomber","Sqliscan","Striker","Sublist3r","Sudo Superuser","Termux Call","Termux Laszy Script","Termux send SMS","Thech Choice","TM-Scanner","TM-Venom","Visql Scan","Wbseku Tool","Webshell","Word Press Scanner","XERXES","Zarp Local Network","Thank"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		getActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.command);
		

		ImageView img=(ImageView)findViewById(R.id.img);
		Glide.with(this).load(R.drawable.g_g).asGif().into(img);	
		ListView lv = (ListView)findViewById(R.id.listView);
		lv.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,strs));
		lv.setOnItemClickListener(this);

    }
	
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// TODO: Implement this method
		startActivity(new Intent(getApplicationContext(),SecondActivity.class)
					  .putExtra("userClicked",position)
					  );}}
		
