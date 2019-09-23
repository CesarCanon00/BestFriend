package com.cesarcanon.bestfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class foto_registrar_mascota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_registrar_mascota);

        ImageButton btnRegresar = (ImageButton) findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });

        Button btnOmitir = (Button) findViewById(R.id.btnOmitir);
        btnOmitir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                omitir(view);
            }
        });
    }

    public void omitir(View view){
        Intent i = new Intent(this, registrar_mascota_final.class);
        startActivity(i);
    }
}
