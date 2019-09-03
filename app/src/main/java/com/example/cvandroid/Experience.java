package com.example.cvandroid;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Experience extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        final Button shphp = findViewById(R.id.btnshow3);
        shphp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (shphp.getText()=="SHOW"){
                    shphp.setText("HIDE");
                    ImageView img = findViewById(R.id.imgphp);
                    img.setVisibility(View.VISIBLE);
                }else{
                    shphp.setText("SHOW");
                    ImageView img = findViewById(R.id.imgphp);
                    img.setVisibility(View.GONE);
                }
            }
        });

        final Button shcss = findViewById(R.id.btnshow2);
        shcss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (shcss.getText()=="SHOW"){
                    shcss.setText("HIDE");
                    ImageView img = findViewById(R.id.imgcss);
                    img.setVisibility(View.VISIBLE);
                }else{
                    shcss.setText("SHOW");
                    ImageView img = findViewById(R.id.imgcss);
                    img.setVisibility(View.GONE);
                }
            }
        });

        final Button shhtml = findViewById(R.id.btnshow);
        shhtml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (shhtml.getText()=="SHOW"){
                    shhtml.setText("HIDE");
                    ImageView img = findViewById(R.id.imghtml);
                    img.setVisibility(View.VISIBLE);
                }else {
                    shhtml.setText("SHOW");
                    ImageView img = findViewById(R.id.imghtml);
                    img.setVisibility(View.GONE);
                }
            }
        });

        final Button shjs = findViewById(R.id.btnshow4);
        shjs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (shjs.getText()=="SHOW"){
                    shjs.setText("HIDE");
                    ImageView img = findViewById(R.id.imgjs);
                    img.setVisibility(View.VISIBLE);
                }else {
                    shjs.setText("SHOW");
                    ImageView img = findViewById(R.id.imgjs);
                    img.setVisibility(View.GONE);
                }
            }
        });

        View btnback = findViewById(R.id.btnbackexp);
        btnback.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnbackexp:
                Intent moveback = new Intent(Experience.this, MainActivity.class);
                finish();
                break;
        }
    }
}