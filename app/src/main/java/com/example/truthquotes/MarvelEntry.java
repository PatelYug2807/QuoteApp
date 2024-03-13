package com.example.truthquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MarvelEntry extends AppCompatActivity {
    Button ironman1,captian1,thor1,hulk1,namor1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marvel_entry);
        ironman1=findViewById(R.id.ironmanBut);
        ironman1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MarvelEntry.this, IronMan1.class);
                startActivity(i);
            }
        });
        captian1=findViewById(R.id.captianname);
        captian1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MarvelEntry.this, CaptianAmerica1.class);
                startActivity(i);
            }
        });
        thor1=findViewById(R.id.thorBtn);
        thor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MarvelEntry.this, Thor1.class);
                startActivity(i);
            }
        });
        hulk1=findViewById(R.id.hulkbtn);
        hulk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MarvelEntry.this, Hulk1.class);
                startActivity(i);
            }
        });
        namor1=findViewById(R.id.namorbtn);
        namor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MarvelEntry.this, NamorQuote1.class);
                startActivity(i);
            }
        });
    }
}