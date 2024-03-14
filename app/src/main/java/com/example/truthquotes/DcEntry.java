package com.example.truthquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DcEntry extends AppCompatActivity {
Button superman,batman,wonderwoman,flash,aquaman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dc_entry);
        superman=findViewById(R.id.supermanBut);
        superman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DcEntry.this, SuperMan1.class));
            }
        });
        batman=findViewById(R.id.batmanBut);
        batman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DcEntry.this,BatManQuote1.class));
            }
        });
        wonderwoman=findViewById(R.id.wonderWomanBtn);
        wonderwoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DcEntry.this, WonderWoman1.class));
            }
        });
        flash=findViewById(R.id.flashBtn);
        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DcEntry.this,FlashQuote1.class));
            }
        });
        aquaman=findViewById(R.id.aquamanBtn);
        aquaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DcEntry.this,AquaManQuote1.class));
            }
        });
    }
}