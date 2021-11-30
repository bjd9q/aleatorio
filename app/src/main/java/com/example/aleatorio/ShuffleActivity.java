package com.example.aleatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class ShuffleActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton especifico,noEspecifico;
    EditText minimo,maximo,txtDecimal,txtNumeroEntero;
    CheckBox checkBoxDecimal;
    ToggleButton toggleBtnRepetir;
    ImageButton imgBtnCoete;
    TextView numeroFinal;
    ArrayList<Integer> arrayInt;
    ArrayList<String> arrayString;
    int numero = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shuffle);
        instancia();
        accion();
    }


    private void instancia() {
        especifico = findViewById(R.id.radioBtnEspecifico);
        noEspecifico = findViewById(R.id.radioBtnNoEspecifico);
        minimo = findViewById(R.id.minimo);
        maximo = findViewById(R.id.maximo);
        txtDecimal = findViewById(R.id.txtDecimal);
        txtNumeroEntero = findViewById(R.id.txtNumeroEntero);
        checkBoxDecimal = findViewById(R.id.checkboxDecimal);
        toggleBtnRepetir = findViewById(R.id.toggleBtnRepetir);
        imgBtnCoete = findViewById(R.id.imgBtnCoete);
        numeroFinal = findViewById(R.id.resultadoAleatorio);
        arrayInt = new ArrayList<>();
        arrayString = new ArrayList<>();

        minimo.setEnabled(false);
        maximo.setEnabled(false);
        txtDecimal.setEnabled(false);

        especifico.setChecked(false);
    }

    private void accion() {
      especifico.setOnClickListener(this);
      noEspecifico.setOnClickListener(this);
      imgBtnCoete.setOnClickListener(this);


      checkBoxDecimal.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                txtDecimal.setEnabled(b);

            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.radioBtnEspecifico:
                minimo.setEnabled(true);
                maximo.setEnabled(true);
                break;
            case R.id.radioBtnNoEspecifico:
                minimo.setEnabled(false);
                maximo.setEnabled(false);
                break;
            case R.id.imgBtnCoete:


              if (especifico.isChecked()){
                  try {
                      System.out.println("checkSi");
                      Integer nRandom = null;
                      Integer aux = 0;
                      List<Integer> numeros = new ArrayList<Integer>();

                      while (aux < Integer.parseInt(txtNumeroEntero.getText().toString())) {
                          nRandom = (int) (Math.random() * Integer.parseInt(maximo.getText().toString()) + Integer.parseInt(minimo.getText().toString()));
                              numeros.add(nRandom);
                              aux++;

                      }
                      numeroFinal.setText(String.valueOf(numeros));

                  }catch (NullPointerException e){
                      e.getMessage();
                  }
              }else {

                  try {
                      Integer nRandom = null;
                      Integer aux = 0;
                      List<Integer> numeros = new ArrayList<Integer>();

                      while (aux < Integer.parseInt(txtNumeroEntero.getText().toString())) {
                          nRandom = (int) (Math.random() * 29 + 1);
                              numeros.add(nRandom);
                              aux++;

                      }
                      numeroFinal.setText(String.valueOf(numeros));

                  }catch (NullPointerException e){
                      e.getMessage();
                  }
              }

                break;
        }
    }
}