package com.example.impapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edTxt =findViewById(R.id.edTxt);
    }

    public void sendHandler(View view) {
        String txt = edTxt.getText().toString();
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra("txt", txt);
        sendIntent.setType("text/plain");


        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(sendIntent);
        }

    }
}