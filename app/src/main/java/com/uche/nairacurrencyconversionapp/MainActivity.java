package com.uche.nairacurrencyconversionapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button dollars;
    private Button pounds;
    private Button euros;
    private Button cad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dollars = findViewById(R.id.dollar);
        pounds = findViewById(R.id.pounds);
        euros = findViewById(R.id.euros);
        cad = findViewById(R.id.cad);

        dollars.setOnClickListener(this);
        pounds.setOnClickListener(this);
        euros.setOnClickListener(this);
        cad.setOnClickListener(this);


    }

    @Override
    public void onClick(View v){


        switch (v.getId()){

            case R.id.dollar:
                Intent intent = new Intent(MainActivity.this, Dollar.class);
                intent.putExtra("currency","Dollars");
                startActivity(intent);
                break;

            case R.id.pounds:
                Intent intent2 = new Intent(MainActivity.this, Dollar.class);
                intent2.putExtra("currency","Pounds");
                startActivity(intent2);
                break;
            case R.id.euros:
                Intent intent3 = new Intent(MainActivity.this, Dollar.class);
                intent3.putExtra("currency","Euros");
                startActivity(intent3);
                break;

            case R.id.cad:
                Intent intent4 = new Intent(MainActivity.this, Dollar.class);
                intent4.putExtra("currency","Cad");
                startActivity(intent4);
                break;

        }

    }
}
