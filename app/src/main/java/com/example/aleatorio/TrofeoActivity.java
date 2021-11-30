package com.example.aleatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class TrofeoActivity extends AppCompatActivity {
    TextView ganador;
    EditText concursante;
    Button btnGenerar, btnAgregar;
    ArrayList<String> listaConcursante;
    int numeroAleatorio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trofeo);
        instancia();
        accion();
    }


    private void instancia() {
        ganador = findViewById(R.id.ganadorTxt);
        btnGenerar = findViewById(R.id.btnGenerarGanador);
        btnAgregar = findViewById(R.id.btnAgregarConcursante);
        concursante = findViewById(R.id.concursante);
        listaConcursante = new ArrayList<>();
    }

    private void accion() {

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listaConcursante.add(concursante.getText().toString());
                concursante.setText("");
            }
        });


        btnGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroAleatorio = (int) (Math.random() * listaConcursante.size());
                ganador.setText(listaConcursante.get(numeroAleatorio));

            }
        });


    }

}