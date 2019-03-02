package com.uche.nairacurrencyconversionapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Dollar extends Activity {

    private EditText dolledit;
    private Button nairabuttd;
    private Button dollbutton;
    private int amount;
    private TextView resultText;
    private Bundle extra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dollar);

        dolledit = findViewById(R.id.dolledit);
        nairabuttd = findViewById(R.id.nairabutton);
        dollbutton = findViewById(R.id.dollarbutton);
        resultText = findViewById(R.id.dollRes);
        extra = getIntent().getExtras();
        String currency = extra.getString("currency");

        dollbutton.setText("");


        if (currency.equals("Dollars")){

            dollbutton.setText("Dollar");

            nairabuttd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String Editval = dolledit.getText().toString();

                    if (Editval.isEmpty()){
                        Toast.makeText(getApplicationContext(),"Type a number!!", Toast.LENGTH_LONG).show();
                    }else{
                        amount = Integer.parseInt(dolledit.getText().toString());
                        String data = convertNaira2D(amount);
                        String dis = "The converted amount at \n One Naira to 360Dollars is \n\t ";
                        String curr = "Naira";
                        String display = dis + data+" "+curr;
                        resultText.setText(display);
                        dolledit.setText("");
                    }

                }
            });

            dollbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String Editval = dolledit.getText().toString();

                    if (Editval.isEmpty()){
                        Toast.makeText(getApplicationContext(),"Type a number!!", Toast.LENGTH_LONG).show();
                    }else{
                        amount = Integer.parseInt(dolledit.getText().toString());
                        String data = convertDollar(amount);
                        String dis = "The converted amount at \n One Naira to 360Dollars is \n\t ";
                        String curr = "Dollars";
                        String display = dis + data+" "+curr;
                        resultText.setText(display);
                        dolledit.setText("");
                    }

                }
            });

        }else if (currency.equals("Pounds")){

            dollbutton.setText("Pounds");

            nairabuttd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String Editval = dolledit.getText().toString();

                    if (Editval.isEmpty()){
                        Toast.makeText(getApplicationContext(),"Type a number!!", Toast.LENGTH_LONG).show();
                    }else{
                        amount = Integer.parseInt(dolledit.getText().toString());
                        String data = convertNaira2P(amount);
                        String dis = "The converted amount at \n One Naira to 460Pounds is \n\t ";
                        String curr = "Naira";
                        String display = dis + data+" "+curr;
                        resultText.setText(display);
                        dolledit.setText("");
                    }

                }
            });

            dollbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String Editval = dolledit.getText().toString();

                    if (Editval.isEmpty()){
                        Toast.makeText(getApplicationContext(),"Type a number!!", Toast.LENGTH_LONG).show();
                    }else{
                        amount = Integer.parseInt(dolledit.getText().toString());
                        String data = convertPounds(amount);
                        String dis = "The converted amount at \n One Naira to 460 Pounds is \n\t ";
                        String curr = "Pounds";
                        String display = dis + data+" "+curr;
                        resultText.setText(display);
                        dolledit.setText("");
                    }

                }
            });

        }else if (currency.equals("Euros")){
            dollbutton.setText("Euros");
            nairabuttd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String Editval = dolledit.getText().toString();

                    if (Editval.isEmpty()){
                        Toast.makeText(getApplicationContext(),"Type a number!!", Toast.LENGTH_LONG).show();
                    }else{
                        amount = Integer.parseInt(dolledit.getText().toString());
                        String data = convertNaira2E(amount);
                        String dis = "The converted amount at \n One Naira to 412 Euros is \n\t ";
                        String curr = "Naira";
                        String display = dis + data+" "+curr;
                        resultText.setText(display);
                        dolledit.setText("");
                    }

                }
            });

            dollbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String Editval = dolledit.getText().toString();

                    if (Editval.isEmpty()){
                        Toast.makeText(getApplicationContext(),"Type a number!!", Toast.LENGTH_LONG).show();
                    }else{
                        amount = Integer.parseInt(dolledit.getText().toString());
                        String data = convertEuros(amount);
                        String dis = "The converted amount at \n One Naira to 412 Euros is \n\t ";
                        String curr = "Euros";
                        String display = dis + data+" "+curr;
                        resultText.setText(display);
                        dolledit.setText("");
                    }

                }
            });
        }else if (currency.equals("Cad")){
            dollbutton.setText("Cad");

            nairabuttd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String Editval = dolledit.getText().toString();

                    if (Editval.isEmpty()){
                        Toast.makeText(getApplicationContext(),"Type a number!!", Toast.LENGTH_LONG).show();
                    }else{
                        amount = Integer.parseInt(dolledit.getText().toString());
                        String data = convertNaira2C(amount);
                        String dis = "The converted amount at \n One Naira to 274 Canadian Dollars is \n\t ";
                        String curr = "Naira";
                        String display = dis + data+" "+curr;
                        resultText.setText(display);
                        dolledit.setText("");
                    }

                }
            });

            dollbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String Editval = dolledit.getText().toString();

                    if (Editval.isEmpty()){
                        Toast.makeText(getApplicationContext(),"Type a number!!", Toast.LENGTH_LONG).show();
                    }else{
                        amount = Integer.parseInt(dolledit.getText().toString());
                        String data = convertCad(amount);
                        String dis = "The converted amount at \n One Naira to 274 Canadian Dollars is \n\t ";
                        String curr = "Canadian Dollars";
                        String display = dis + data+" "+curr;
                        resultText.setText(display);
                        dolledit.setText("");
                    }

                }
            });
        }







    }

    public String convertNaira2D(int amount){
         int res = amount * 360;
         String result = Integer.toString(res);

         return result;
    }

    public String convertDollar(int amount){
        int res = amount / 360;
        String result = Integer.toString(res);

        return result;
    }

    public String convertNaira2P(int amount){
        int res = amount * 460;
        String result = Integer.toString(res);

        return result;
    }

    public String convertPounds(int amount){
        int res = amount / 460;
        String result = Integer.toString(res);

        return result;
    }

    public String convertNaira2E(int amount){
        int res = amount * 412;
        String result = Integer.toString(res);

        return result;
    }

    public String convertEuros(int amount){
        int res = amount / 412;
        String result = Integer.toString(res);

        return result;
    }

    public String convertNaira2C(int amount){
        int res = amount * 274;
        String result = Integer.toString(res);

        return result;
    }

    public String convertCad(int amount){
        int res = amount / 274;
        String result = Integer.toString(res);

        return result;
    }
}
