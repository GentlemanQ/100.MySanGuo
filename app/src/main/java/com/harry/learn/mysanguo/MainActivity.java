package com.harry.learn.mysanguo;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLoadGame, btnnewGame, btnTeaching, btnSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadGame = findViewById(R.id.btn_load_game);
        btnnewGame = findViewById(R.id.btn_new_game);
        btnTeaching = findViewById(R.id.btn_teaching);
        btnSetting = findViewById(R.id.btn_setting);

        btnLoadGame.setOnClickListener(this);
        btnnewGame.setOnClickListener(this);
        btnTeaching.setOnClickListener(this);
        btnSetting.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_load_game:
                Intent i = new Intent(this, loadGameListActivity.class);
                startActivity(i);
                break;
            case R.id.btn_new_game:
                break;
            case R.id.btn_teaching:
                break;
            case R.id.btn_setting:
                break;
        }
    }
}
