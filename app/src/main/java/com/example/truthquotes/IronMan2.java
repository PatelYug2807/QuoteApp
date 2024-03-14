package com.example.truthquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class IronMan2 extends AppCompatActivity {
    TextView quote;

    Button share,next,previous;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iron_man2);
        share=findViewById(R.id.ironmanshare2);
        quote=findViewById(R.id.ironmanshare3);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent();
                String data=quote.getText().toString();
                i.setAction(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_TEXT,data);
                startActivity(i);
            }
        });
        next=findViewById(R.id.nextIm2);
        previous=findViewById(R.id.previosIm2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Nothing To Show",Toast.LENGTH_LONG).show();
            }

        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                startActivity(new Intent(IronMan2.this,IronMan1.class));
            }
        });
    }
    }