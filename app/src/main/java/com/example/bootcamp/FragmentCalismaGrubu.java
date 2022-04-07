package com.example.bootcamp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FragmentCalismaGrubu extends Fragment {

    private ListView listView;
    private ArrayList<String> dersler = new ArrayList<>();
    private ArrayAdapter<String> arrayAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_calisma_grubu, container, false);

        listView = root.findViewById(R.id.listview);
        dersler.add("");
        dersler.add("Numerical Methods");
        dersler.add("Physics - I");
        dersler.add("Physics - II");
        dersler.add("Material Science");
        dersler.add("Intermediate Programming");
        dersler.add("Data Structures");
        dersler.add("System Programming");
        dersler.add("Digital Design");
        dersler.add("Discrete Computational Structures");
        dersler.add("Calculus - I");
        dersler.add("Calculus - II");
        dersler.add("Linear Algebra");
        dersler.add("Introduction to Computer Engineering");
        dersler.add("Introdcution to Electric and Electrical Engineering");
        dersler.add("Introduction to Industrial Engineering");
        dersler.add("Chemistry for Engineers");
        dersler.add("Digital Logic Design");
        dersler.add("Planning and Control");
        dersler.add("Total Quaility Management");
        dersler.add("Business works for Engineers");
        dersler.add("Germany");
        dersler.add("Human Research Planning");
        dersler.add("Career Development");
        dersler.add("Organic Chemistry");
        dersler.add("Electric Circuits");
        dersler.add("ELectronics");

        /** Construct the adapter. */
        arrayAdapter = new ArrayAdapter<String>(getActivity().getApplicationContext() // Context
                 , android.R.layout.simple_list_item_1, // Default layout
                android.R.id.text1 // Default text
                , dersler); // Data set reference



        /** Put the adapter into the listView */
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(
                        getActivity().getApplicationContext()
                        ,   dersler.get(i) + " ile ilgili Whatsapp linki yönlendiriliyor."
                        , Toast.LENGTH_SHORT)
                        .show();

            }
        });

        /** alertDialog.setMessage("Bu sayfa sizi bir Whatsapp linkine gönderecektir.");
         alertDialog.setIcon(R.drawable.resim);
         alertDialog.setTitle("Uyarı !");

         alertDialog.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
        Toast.makeText(getActivity().getApplicationContext(), "Tamam", Toast.LENGTH_SHORT).show();
        }
        });

         alertDialog.setNegativeButton("İptal", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
        Toast.makeText(getActivity().getApplicationContext(), "İptal Edildi", Toast.LENGTH_SHORT).show();
        }
        });
         alertDialog.create().show();*/



        return root;
    }
}