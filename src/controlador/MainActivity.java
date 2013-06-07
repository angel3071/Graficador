package com.Graphsraphs;

import java.util.HashMap;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void barGraphHandler(View view){
    	
    }
    
    public void lineGraphHandler(View view){
    	
    	HashMap<String, String> map = new HashMap<String, String>();
    	map.put("CEBTIS2", "30");
    	map.put("CEBTIS3", "50");
    	map.put("CEBTIS4", "40");
    	map.put("CEBTIS5", "55");
    	map.put("CEBTIS6", "35");
    	map.put("CEBTIS7", "20");
    	map.put("CEBTIS8", "30");
    	map.put("CEBTIS9", "80");
    	map.put("CEBTIS10", "24");
    	map.put("CEBTIS0", "47");
    	
    	
    	LineGraph line = new LineGraph(map);
    	Intent intent = line.getIntent(this);
    	startActivity(intent);
    	
    }
}
