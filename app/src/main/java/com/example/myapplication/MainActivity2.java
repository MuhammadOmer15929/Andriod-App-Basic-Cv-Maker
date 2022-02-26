package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity2 extends AppCompatActivity {

    TextView txt1;
     EditText edx1;
     EditText edx2;
     EditText edx3;
     EditText edx4;
     EditText edx5;
     EditText edx6;
     EditText edx7;

     Button btn1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt1 = (TextView) findViewById(R.id.textView6);
        edx1 = (EditText) findViewById(R.id.editTextTextPersonName);
        edx2 = (EditText) findViewById(R.id.editTextTextEmailAddress);
        edx3 = (EditText) findViewById(R.id.editTextNumber);
        edx4 = (EditText) findViewById(R.id.editTextTextPersonName2);
        edx5 = (EditText) findViewById(R.id.editTextTextPersonName4);
        edx6 = (EditText) findViewById(R.id.editTextTextPersonName5);
        edx7 = (EditText) findViewById(R.id.editTextTextPersonName6);
        btn1=(Button)this.findViewById(R.id.button2);
        txt1.getText();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name=edx1.getText().toString();
                String email=edx2.getText().toString();
                String phonenumber=edx3.getText().toString();
                String des=edx4.getText().toString();
                String deg=edx5.getText().toString();
                String ski=edx6.getText().toString();
                String exp=edx7.getText().toString();

                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("Name",Name);
                intent.putExtra("email",email);
                intent.putExtra("phonenumber",phonenumber);
                intent.putExtra("des",des);
                intent.putExtra("deg",deg);
                intent.putExtra("ski",ski);
                intent.putExtra("exp",exp);
               startActivity(intent);









            }
        });
    }



        }

