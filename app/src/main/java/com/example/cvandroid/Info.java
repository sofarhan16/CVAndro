package com.example.cvandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Info extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        View back = findViewById(R.id.btnbackinfo);
        back.setOnClickListener(this);

        CardView crdfeature = findViewById(R.id.feature);
        crdfeature.setOnClickListener(this);

        CardView crdgallery = findViewById(R.id.gallery);
        crdgallery.setOnClickListener(this);

        CardView crdschool = findViewById(R.id.scholl);
        crdschool.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnbackinfo:
                Intent moveback = new Intent(Info.this, MainActivity.class);
                finish();
                break;
            case R.id.feature:
                Intent movefeature = new Intent(Info.this,Feature.class);
                startActivity(movefeature);
                break;
            case R.id.gallery:
                Intent movegallery = new Intent(Info.this,Gallery.class);
                startActivity(movegallery);
                break;
            case R.id.scholl:
                Intent moveschool = new Intent(Info.this,School.class);
                startActivity(moveschool);
                break;
        }
    }
}
