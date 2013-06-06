package com.example.graficador;

import org.json.JSONObject;

import controlador.*;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
//        EditText usuario = (EditText) findViewById(R.id.usuario);
//        usuario.clearFocus();
        
        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin
        .requestFocus();
        JSONObject jb = JSONManager.getJSONfromURL("http://200.23.107.50:8083/siiecon.asmx/lstSistemasPlantel");
        
        
        
        btnLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), Principal.class);
				startActivity(i);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }
    
}
