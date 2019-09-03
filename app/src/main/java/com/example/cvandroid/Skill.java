package com.example.cvandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Skill extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);

        View back = findViewById(R.id.btnback);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent moveback = new Intent(Skill.this,MainActivity.class);
        finish();
    }
}
