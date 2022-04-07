package com.example.bootcamp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

public class FragmentEtkinlikHabercisi extends Fragment {

    private ImageButton afis1, afis2, afis3, afis4, afis5, afis6 ,afis7, afis8;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_etkinlik_habercisi, container, false);

        afis1 = rootView.findViewById(R.id.afis1);
        afis2 = rootView.findViewById(R.id.afis2);
        afis3 = rootView.findViewById(R.id.afis3);
        afis4 = rootView.findViewById(R.id.afis4);
        afis5 = rootView.findViewById(R.id.afis5);
        afis6 = rootView.findViewById(R.id.afis6);
        afis7 = rootView.findViewById(R.id.afis7);
        afis8 = rootView.findViewById(R.id.afis8);

        afis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Etkinliğe Yönlendiriliyor.", Toast.LENGTH_SHORT).show();
            }
        });

        afis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Etkinliğe Yönlendiriliyor.", Toast.LENGTH_SHORT).show();
            }
        });

        afis3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Etkinliğe Yönlendiriliyor.", Toast.LENGTH_SHORT).show();
            }
        });

        afis4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Etkinliğe Yönlendiriliyor.", Toast.LENGTH_SHORT).show();
            }
        });

        afis5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Etkinliğe Yönlendiriliyor.", Toast.LENGTH_SHORT).show();
            }
        });

        afis6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Etkinliğe Yönlendiriliyor.", Toast.LENGTH_SHORT).show();
            }
        });

        afis7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Etkinliğe Yönlendiriliyor.", Toast.LENGTH_SHORT).show();
            }
        });

        afis8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Etkinliğe Yönlendiriliyor.", Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}