package com.example.cvandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView crdabout = findViewById(R.id.about);
        crdabout.setOnClickListener(this);

        CardView crdskill = findViewById(R.id.skill);
        crdskill.setOnClickListener(this);

        CardView crdexp = findViewById(R.id.exp);
        crdexp.setOnClickListener(this);

        CardView crdinfo = findViewById(R.id.ninfo);
        crdinfo.setOnClickListener(this);

        CardView crdportfolio = findViewById(R.id.portfolio);
        crdportfolio.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.about:
                Intent moveabout = new Intent(MainActivity.this, About.class);
                startActivity(moveabout);
                break;

            case R.id.skill:
                Intent moveskill = new Intent(MainActivity.this, Skill.class);
                startActivity(moveskill);
                break;

            case R.id.exp:
                Intent moveexp = new Intent(MainActivity.this, Experience.class);
                startActivity(moveexp);
                break;

            case R.id.ninfo:
                Intent moveinfo = new Intent(MainActivity.this, Info.class);
                startActivity(moveinfo);
                break;

            case R.id.portfolio:
                Intent linkport = new Intent();
                linkport.setAction(Intent.ACTION_VIEW);
                linkport.addCategory(Intent.CATEGORY_BROWSABLE);
                linkport.setData(Uri.parse("http://portofolio.aansyah.space/"));
                startActivity(linkport);
                break;
        }
    }
}
