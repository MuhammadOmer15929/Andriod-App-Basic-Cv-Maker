package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt2 = (TextView) findViewById(R.id.textView2);
        txt1=(TextView)findViewById(R.id.textView);
        txt3=(TextView)findViewById(R.id.textView3);
        txt4=(TextView)findViewById(R.id.textView5);
        txt5=(TextView)findViewById(R.id.textView4);
        Intent intent=getIntent();
        String Name=intent.getStringExtra("Name");
        String des=intent.getStringExtra("des");
        String deg=intent.getStringExtra("deg");
        String ski=intent.getStringExtra("ski");
        String exp=intent.getStringExtra("exp");
        txt2.setText(Name);
        txt1.setText(des);
        txt3.setText(deg);
        txt4.setText(ski);
        txt5.setText(exp);
        String phonenumber = null;
        Button btn3=(Button)findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phonenumber = getIntent().getStringExtra("phonenumber");

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+phonenumber));
                startActivity(intent);
            }

        });
        String email=null;
        Button btn1=(Button)findViewById((R.id.button));
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=getIntent().getStringExtra("email");
                Intent intent = new Intent (Intent.ACTION_VIEW);
                intent.setData(Uri.parse("mailto:"+email));
                startActivity(intent);

            }
        });

    }
}