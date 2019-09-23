package com.cesarcanon.bestfriend;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.cesarcanon.bestfriend.fragments.BuscarFragment;
import com.cesarcanon.bestfriend.fragments.FavoritosFragment;
import com.cesarcanon.bestfriend.fragments.MascotaFragment;
import com.cesarcanon.bestfriend.fragments.PerfilFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class inicio_dm extends AppCompatActivity {

    BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_dm);
        showSelectedFragment(new BuscarFragment());
        bnv = (BottomNavigationView) findViewById(R.id.barranav);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if(menuItem.getItemId()==R.id.menu_buscar){
                    showSelectedFragment(new BuscarFragment());
                }else if(menuItem.getItemId()==R.id.menu_perfil){
                    showSelectedFragment(new PerfilFragment());
                }else if(menuItem.getItemId()==R.id.menu_mascota){
                    showSelectedFragment(new MascotaFragment());
                }else if(menuItem.getItemId()==R.id.menu_favoritos){
                    showSelectedFragment(new FavoritosFragment());
                }
                return true;
            }
        });
    }

    private void showSelectedFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();

    }




}
