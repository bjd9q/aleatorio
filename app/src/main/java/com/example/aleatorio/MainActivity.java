package com.example.aleatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnImgTrofeo;
    ImageButton btnImgDices;
    ImageButton btnImgShuffle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        accion();
    }

    public void instancias(){
        btnImgTrofeo = findViewById(R.id.trofeoImgBtn);
        btnImgDices = findViewById(R.id.dicesImgBtn);
        btnImgShuffle = findViewById(R.id.shuffleImgBtn);
    }

    public void accion(){
        btnImgTrofeo.setOnClickListener(this);
        btnImgDices.setOnClickListener(this);
        btnImgShuffle.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.trofeoImgBtn:
               intent = new Intent(getApplicationContext(),TrofeoActivity.class);
                break;
            case R.id.dicesImgBtn:
                intent = new Intent(getApplicationContext(),DicesActivity.class);
                break;
            case R.id.shuffleImgBtn:
                intent = new Intent(getApplicationContext(),ShuffleActivity.class);
                break;
        }
        startActivity(intent);
    }
}