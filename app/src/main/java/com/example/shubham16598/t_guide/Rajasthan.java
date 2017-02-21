package com.example.shubham16598.t_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Rajasthan extends AppCompatActivity {
   ImageButton i1;
    ImageButton i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajasthan);
        i1 = (ImageButton)findViewById(R.id.imageButton2);
        i2 = (ImageButton)findViewById(R.id.imageButton4) ;
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Rajasthan.this,Jaipur.class);
                startActivity(i);

            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new  Intent(Rajasthan.this,udaipur.class);
                startActivity(j);
            }
        });
    }
}
