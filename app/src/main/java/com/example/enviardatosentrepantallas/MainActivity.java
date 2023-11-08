package com.example.enviardatosentrepantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText eTT1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eTT1=findViewById(R.id.eTT1);
    }

    public void presion(View view){
        Intent i= new Intent(this, Activity2.class);
        i.putExtra("hola", eTT1.getText().toString());
        startActivity(i);
    }
}