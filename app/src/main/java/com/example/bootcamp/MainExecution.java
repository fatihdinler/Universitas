package com.example.bootcamp;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class MainExecution extends AppCompatActivity {

    private NavigationView navigationView;
    private DrawerLayout drawer;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_execution);

        navigationView = findViewById(R.id.navigationView);
        drawer = findViewById(R.id.drawer);
        toolbar = findViewById(R.id.toolbar);

        NavHostFragment navHostFragment =
                (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.navHostFragment);

        NavigationUI.setupWithNavController(navigationView, navHostFragment.getNavController());

        ActionBarDrawerToggle actionBarDrawerToggle =
                new ActionBarDrawerToggle(MainExecution.this, drawer, toolbar,0,0);

        drawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        View header = navigationView.inflateHeaderView(R.layout.navigation_baslik);
        TextView textViewBaslik = header.findViewById(R.id.textViewBaslik);
        textViewBaslik.setText("Merhaba !");


    }
}