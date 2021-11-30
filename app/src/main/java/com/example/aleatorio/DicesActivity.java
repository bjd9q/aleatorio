package com.example.aleatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DicesActivity extends AppCompatActivity {
    Button btn;
    ImageView dado;
    int numeroAleatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dices);
        instancia();
        accion();
    }

    private void instancia() {
        btn = findViewById(R.id.btnLanzar);
        dado = findViewById(R.id.imgDado);
    }

    private void accion() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroAleatorio = (int) (Math.random() * 6);
                if (numeroAleatorio == 0) {
                    dado.setImageResource(R.drawable.dado_uno);
                }else if (numeroAleatorio==1){
                    dado.setImageResource(R.drawable.dado_dos);
                }else if (numeroAleatorio==2){
                    dado.setImageResource(R.drawable.dado_tres);
                }else if (numeroAleatorio==3){
                    dado.setImageResource(R.drawable.dado_cuatro);
                }else if (numeroAleatorio==4){
                    dado.setImageResource(R.drawable.dado_cinco);
                }else if (numeroAleatorio==5){
                    dado.setImageResource(R.drawable.dado_seis);
                }
            }
        });
    }
}