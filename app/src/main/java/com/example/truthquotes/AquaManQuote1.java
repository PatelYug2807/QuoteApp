package com.example.truthquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AquaManQuote1 extends AppCompatActivity {

    TextView quote,name;
    Button share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aquamam_quote1);
        share=findViewById(R.id.aquamanShare);
        quote=findViewById(R.id.aquamanShare1);
        name=findViewById(R.id.aquamanName);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent();
                String data=quote.getText().toString();
                String sup=name.getText().toString();
                sup.split(" ");
                i.setAction(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_TEXT,"Quote by "+sup+" is "+data);
                startActivity(i);
            }
        });
    }
}