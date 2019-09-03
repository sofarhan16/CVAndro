package com.example.cvandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ProgressBar;

public class Feature extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature);

        CardView crdcardview = findViewById(R.id.cv);
        crdcardview.setOnClickListener(this);

        CardView crdbutton = findViewById(R.id.btni);
        crdbutton.setOnClickListener(this);

        CardView crdimageview = findViewById(R.id.iv);
        crdimageview.setOnClickListener(this);

        CardView crdlinearlayout = findViewById(R.id.ll);
        crdlinearlayout.setOnClickListener(this);

        CardView crdrelativelayout = findViewById(R.id.rl);
        crdrelativelayout.setOnClickListener(this);

        CardView crdscrollview = findViewById(R.id.sv);
        crdscrollview.setOnClickListener(this);

        CardView crdtextview = findViewById(R.id.tv);
        crdtextview.setOnClickListener(this);

        CardView crdcircleimage = findViewById(R.id.civ);
        crdcircleimage.setOnClickListener(this);

        CardView crdview = findViewById(R.id.vw);
        crdview.setOnClickListener(this);

        CardView crdprogressbar = findViewById(R.id.pb);
        crdprogressbar.setOnClickListener(this);

        View backfeature = findViewById(R.id.btnbackfeature);
        backfeature.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cv:
                Intent movecardview = new Intent(Feature.this, CardViewActivity.class);
                startActivity(movecardview);
                break;
            case R.id.btni:
                Intent movebutton = new Intent(Feature.this, ButtonActivity.class);
                startActivity(movebutton);
                break;
            case R.id.iv:
                Intent moveimageview = new Intent(Feature.this, ImageViewActivity.class);
                startActivity(moveimageview);
                break;
            case R.id.ll:
                Intent movelinearlayout = new Intent(Feature.this, LinearLayoutActivity.class);
                startActivity(movelinearlayout);
                break;
            case R.id.rl:
                Intent moverelativelayout = new Intent(Feature.this, RelativeLayoutActivity.class);
                startActivity(moverelativelayout);
                break;
            case R.id.sv:
                Intent movescrollview = new Intent(Feature.this, ScrollViewActivity.class);
                startActivity(movescrollview);
                break;
            case R.id.tv:
                Intent movetextview = new Intent(Feature.this, TextViewActivity.class);
                startActivity(movetextview);
                break;
            case R.id.civ:
                Intent movecircleimage = new Intent(Feature.this, CircleImageViewActivity.class);
                startActivity(movecircleimage);
                break;
            case R.id.vw:
                Intent moveview = new Intent(Feature.this, ViewActivity.class);
                startActivity(moveview);
                break;
            case R.id.pb:
                Intent moveprogressbar = new Intent(Feature.this, ProgressBarActivity.class);
                startActivity(moveprogressbar);
                break;
            case R.id.btnbackfeature:
                finish();
                break;
        }
    }
}
