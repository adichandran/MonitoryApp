package com.adichandra.monitoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BiodataActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.adichandra.monitoryapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void btn_selanjutnya(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        EditText nama = findViewById(R.id.txt_nama);
        String message = nama.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}