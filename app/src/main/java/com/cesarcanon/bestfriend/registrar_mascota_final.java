package com.cesarcanon.bestfriend;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cesarcanon.bestfriend.fragments.BuscarFragment;
import com.cesarcanon.bestfriend.fragments.MascotaFragment;

public class registrar_mascota_final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_mascota_final);

        Button btnContinuar = (Button) findViewById(R.id.btnContinuar);
        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Fragment fragmento = new MascotaFragment();
                //FragmentTransaction tr = getSupportFragmentManager().beginTransaction();
                //tr.replace((R.id.container), fragmento);
                //tr.commit();
            }
        });
    }
}
