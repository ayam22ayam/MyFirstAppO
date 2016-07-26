package com.example.android.Sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button b=(Button)findViewById(R.id.button);
        final EditText e1=(EditText)findViewById(R.id.editText);
        final EditText e2=(EditText)findViewById(R.id.editText2);
        final EditText e3=(EditText)findViewById(R.id.editText3);
        final TextView tv =(TextView)findViewById(R.id.TxtV);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float v1=Float.parseFloat(e1.getText().toString());
                float v2=Float.parseFloat(e2.getText().toString());
                float v3=Float.parseFloat(e3.getText().toString());
                float V=v1*v2*v3 ;
                float Q=v1*v2*v3*7 ;
                Toast.makeText(MainActivity.this,"Volume beton is = "+V+"M3" +" "+"Qontity Sec = "+Q,Toast.LENGTH_LONG).show();
                tv.setText("Volume beton is = "+V +" M3                  "+"Qontity Sec = "+Q);

            }
        });
    }
}
