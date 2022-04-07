package com.example.bootcamp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class FragmentForum extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

       View rootView = inflater.inflate(R.layout.fragment_forum, container, false);


       return rootView;
    }
}