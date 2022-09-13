package com.example.blazinwheels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.TYT);
        b2 = findViewById(R.id.NSN);
        b3 = findViewById(R.id.HND);
        b4 = findViewById(R.id.MCL);
        b1.setOnClickListener(view -> Toyota());
        b2.setOnClickListener(view -> Nissan());
        b3.setOnClickListener(view -> Honda());
        b4.setOnClickListener(view -> Mclaren());
    }

    public void Toyota()
    {
        Intent i1 = new Intent(this, Toyota.class);
        startActivity(i1);
    }
    public void Nissan()
    {
        Intent i1 = new Intent(this, Nissan.class);
        startActivity(i1);
    }
    public void Honda()
    {
        Intent i1 = new Intent(this, Honda.class);
        startActivity(i1);
    }
    public void Mclaren()
    {
        Intent i1 = new Intent(this, Mclaren.class);
        startActivity(i1);
    }

}