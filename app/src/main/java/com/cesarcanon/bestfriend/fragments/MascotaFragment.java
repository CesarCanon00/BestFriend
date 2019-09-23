package com.cesarcanon.bestfriend.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.cesarcanon.bestfriend.R;
import com.cesarcanon.bestfriend.busqueda;
import com.cesarcanon.bestfriend.registrarMascota;

/**
 * A simple {@link Fragment} subclass.
 */
public class MascotaFragment extends Fragment implements View.OnClickListener {


    public MascotaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mascota, container,false);

        ImageButton btnAgregar = (ImageButton)view.findViewById(R.id.btnAgregar);
        btnAgregar.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v){
        Intent i = new Intent(getActivity(),registrarMascota.class);
        getActivity().startActivity(i);
    }
}
