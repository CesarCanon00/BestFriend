package com.cesarcanon.bestfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ingresar (View view){
        Toast.makeText(this,"Ingresando",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, inicio_dm.class);
        startActivity(i);
    }
}
