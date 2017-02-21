package com.example.shubham16598.t_guide;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class OutsideRajasthan extends AppCompatActivity {
    ImageButton i1;
    ImageButton i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outside_rajasthan);
        i1 = (ImageButton)findViewById(R.id.imageButton5);
        i2 = (ImageButton)findViewById(R.id.imageButton6);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(OutsideRajasthan.this,Delhi.class);
                startActivity(i);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(OutsideRajasthan.this,agra.class);
                startActivity(j);
            }
        });
    }
}
