package com.example.digitalWatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {
    TextClock textClock, textampm, textdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        textClock = findViewById(R.id.textclockid);
        textampm = findViewById(R.id.textampmid);
        textdate = findViewById(R.id.textdateid);

        Typeface myfont = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/digital_font.ttf");

        textClock.setTypeface(myfont);
        textampm.setTypeface(myfont);
        textdate.setTypeface(myfont);

    }

    public void switchActivity(View view) {
        Intent intent = new Intent(this, secondActivity.class);
        startActivity(intent);
    }
}