package com.example.bootcamp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class FragmentEgitim extends Fragment {

    private ToggleButton toggleButtonSertifika, toggleButtonYatılı, toggleButtonÜcret;
    private GridView gridView;
    private Button button;

    private ArrayList<String> şehirler = new ArrayList<>();
    private ArrayAdapter<String> arrayAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_egitim, container, false);

        toggleButtonSertifika = view.findViewById(R.id.toggleButtonSertifika);
        toggleButtonYatılı = view.findViewById(R.id.toggleButtonYatılı);
        toggleButtonÜcret = view.findViewById(R.id.toggleButtonÜcret);
        gridView = view.findViewById(R.id.gridview);
        button = view.findViewById(R.id.buttonListele);

        şehirler.add("İstanbul");
        şehirler.add("Ankara");
        şehirler.add("İzmir");
        şehirler.add("Adana");
        şehirler.add("Antalya");
        şehirler.add("Konya");
        şehirler.add("Mersin");
        şehirler.add("Edirne");

        arrayAdapter = new ArrayAdapter<>(getActivity().getApplicationContext(), android.R.layout.simple_list_item_1,
                android.R.id.text1, şehirler);
        gridView.setAdapter(arrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Sizin için eğitimler listeleniyor.", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}