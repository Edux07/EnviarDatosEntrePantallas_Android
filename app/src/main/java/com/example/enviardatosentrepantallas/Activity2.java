package com.example.enviardatosentrepantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        String nueva= getIntent().getStringExtra("hola");
        Toast.makeText(this, "Hola soy "+nueva, Toast.LENGTH_LONG).show();
    }
        public void presion(View view){
            Intent i= new Intent(this, MainActivity.class);
        }


}