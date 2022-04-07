package com.example.bootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogInScreen extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextTextPassword;
    private Button buttonSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_screen);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        buttonSignIn = findViewById(R.id.buttonSignIn);

        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editTextEmail.getText().toString().matches("")) {
                    Toast.makeText(LogInScreen.this, "Empties are not allowed !", Toast.LENGTH_SHORT).show();
                }

                if(editTextTextPassword.getText().toString().matches("")){
                    Toast.makeText(LogInScreen.this, "Empties are not allowed !", Toast.LENGTH_SHORT).show();
                }

                if((!editTextTextPassword.getText().toString().matches("") && (!editTextEmail.getText().toString().matches("")))) {
                    Intent newIntent = new Intent(LogInScreen.this, MainExecution.class);
                    startActivity(newIntent);
                    finish();
                }
            }
        });




    }
}