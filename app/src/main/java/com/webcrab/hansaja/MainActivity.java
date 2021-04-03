package com.webcrab.hansaja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    TextView rs;
    EditText N1,N2;

    int num1,num2;
    float result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button1);
        b3=findViewById(R.id.button4);
        b4=findViewById(R.id.button3);

        rs=findViewById(R.id.result);

        N1=findViewById(R.id.editTextTextPersonName);
        N2=findViewById(R.id.editTextTextPersonName2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(N1.getText().toString());
                num2 = Integer.parseInt(N2.getText().toString());

                result = num1+num2;

                rs.setText(String.valueOf(result));


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(N1.getText().toString());
                num2 = Integer.parseInt(N2.getText().toString());

                result = num1-num2;

                rs.setText(String.valueOf(result));


            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(N1.getText().toString());
                num2 = Integer.parseInt(N2.getText().toString());

                result = num1*num2;

                rs.setText(String.valueOf(result));


            }
        });



        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(N1.getText().toString());
                num2 = Integer.parseInt(N2.getText().toString());

                result = num2/num1;

                rs.setText(String.valueOf(result));
//pupkapukpaaupka

            }
        });







    }
}