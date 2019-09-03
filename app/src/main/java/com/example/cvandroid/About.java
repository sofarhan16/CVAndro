package com.example.cvandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class About extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView txtno = findViewById(R.id.no);
        txtno.setOnClickListener(this);

        View back = findViewById(R.id.btnbackabout);
        back.setOnClickListener(this);

        TextView txtig = findViewById(R.id.instagram);
        txtig.setOnClickListener(this);

        TextView txtwt = findViewById(R.id.twitter);
        txtwt.setOnClickListener(this);

        TextView txtliin = findViewById(R.id.linkedin);
        txtliin.setOnClickListener(this);

        TextView txtgit = findViewById(R.id.github);
        txtgit.setOnClickListener(this);

        TextView txtmaps = findViewById(R.id.alamat);
        txtmaps.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.no:
                Intent linkwa = new Intent();
                linkwa.setAction(Intent.ACTION_VIEW);
                linkwa.addCategory(Intent.CATEGORY_BROWSABLE);
                linkwa.setData(Uri.parse("https://api.whatsapp.com/send?phone=6281383647180"));
                startActivity(linkwa);
                break;
            case R.id.instagram:
                Intent linkig = new Intent();
                linkig.setAction(Intent.ACTION_VIEW);
                linkig.addCategory(Intent.CATEGORY_BROWSABLE);
                linkig.setData(Uri.parse("https://www.instagram.com/aan.syah_/"));
                startActivity(linkig);
                break;
            case R.id.twitter:
                Intent linktwt = new Intent();
                linktwt.setAction(Intent.ACTION_VIEW);
                linktwt.addCategory(Intent.CATEGORY_BROWSABLE);
                linktwt.setData(Uri.parse("https://twitter.com/Han_syah_"));
                startActivity(linktwt);
                break;
            case R.id.linkedin:
                Intent linkin = new Intent();
                linkin.setAction(Intent.ACTION_VIEW);
                linkin.addCategory(Intent.CATEGORY_BROWSABLE);
                linkin.setData(Uri.parse("https://www.linkedin.com/in/asmaul-sufarhansyah-a3a1b5191/"));
                startActivity(linkin);
                break;
            case R.id.github:
                Intent linkgit = new Intent();
                linkgit.setAction(Intent.ACTION_VIEW);
                linkgit.addCategory(Intent.CATEGORY_BROWSABLE);
                linkgit.setData(Uri.parse("https://github.com/sofarhan16"));
                startActivity(linkgit);
                break;
            case R.id.alamat:
                Intent linkmaps = new Intent();
                linkmaps.setAction(Intent.ACTION_VIEW);
                linkmaps.addCategory(Intent.CATEGORY_BROWSABLE);
                linkmaps.setData(Uri.parse("https://goo.gl/maps/JjmURCKYMS7SD93LA"));
                startActivity(linkmaps);
                break;
            case R.id.btnbackabout:
                Intent moveback = new Intent(About.this, MainActivity.class);
                finish();
                break;
        }
    }
}
