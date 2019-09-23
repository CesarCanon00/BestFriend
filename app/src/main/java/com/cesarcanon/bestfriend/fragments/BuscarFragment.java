package com.cesarcanon.bestfriend.fragments;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.cesarcanon.bestfriend.MainActivity;
import com.cesarcanon.bestfriend.R;
import com.cesarcanon.bestfriend.busqueda;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * A simple {@link Fragment} subclass.
 */
public class BuscarFragment extends Fragment implements View.OnClickListener {

    public BuscarFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_buscar, container,false);

        ImageButton btnBuscar = (ImageButton)view.findViewById(R.id.btnBuscar);
        btnBuscar.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v){
        Intent i = new Intent(getActivity(),busqueda.class);
        getActivity().startActivity(i);
    }

}
