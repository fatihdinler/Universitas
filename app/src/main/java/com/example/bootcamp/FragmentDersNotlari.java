package com.example.bootcamp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;


public class FragmentDersNotlari extends Fragment {

        private ImageButton calculus, thermo, ec, material, os, probability, software, statistics;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_ders_notlari, container, false);

        calculus = rootView.findViewById(R.id.afis1);
        thermo = rootView.findViewById(R.id.afis2);
        ec = rootView.findViewById(R.id.afis3);
        material = rootView.findViewById(R.id.afis4);
        os = rootView.findViewById(R.id.afis5);
        probability = rootView.findViewById(R.id.afis6);
        software = rootView.findViewById(R.id.afis7);
        statistics = rootView.findViewById(R.id.afis8);

        calculus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Calculus Notları İndiriliyor.", Toast.LENGTH_SHORT).show();
            }
        });
        thermo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Thermodynamic Notları İndiriliyor.", Toast.LENGTH_SHORT).show();
            }
        });
        ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Electric Circuit Notları İndiriliyor.", Toast.LENGTH_SHORT).show();
            }
        });
        material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Material Science Notları İndiriliyor.", Toast.LENGTH_SHORT).show();
            }
        }); os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Operation Research Notları İndiriliyor.", Toast.LENGTH_SHORT).show();
            }
        }); probability.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Probability Notları İndiriliyor.", Toast.LENGTH_SHORT).show();
            }
        }); software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Software Engineering Notları İndiriliyor.", Toast.LENGTH_SHORT).show();
            }
        });
        statistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Statistics Notları İndiriliyor.", Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}