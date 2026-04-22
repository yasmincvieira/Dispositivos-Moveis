package com.example.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btCaucular;
    ImageView imageView;
    EditText etPeso, etAltura;
    TextView tvResultado, tvClass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageView);
        btCaucular=findViewById(R.id.btCalcular);
        etPeso=findViewById(R.id.etPeso);
        etAltura=findViewById(R.id.etAltura);




        btCaucular.setOnClickListener(v -> {
            String strPeso = etPeso.getText().toString();
            String strAltura = etAltura.getText().toString();

            Double peso = Double.parseDouble(strPeso);
            Double altura = Double.parseDouble(strAltura);

            Double imc = peso/(altura*altura);
            DecimalFormat dc = new DecimalFormat("##.##");


            tvResultado.setText(dc.format(imc));


            if (imc < 18.5){
                tvClass.setText("Abaixo do peso");
                imageView.setImageResource(R.drawable.abaixopeso);
            }else if (imc >= 18.5 && imc <= 24.99){
                tvClass.setText("Peso normal");
                imageView.setImageResource(R.drawable.normal);
            }else if (imc >= 25 && imc <= 29.99) {
                tvClass.setText("Sobrepeso");
                imageView.setImageResource(R.drawable.sobrepeso);
            }else if (imc >= 30 && imc <= 34.99) {
                tvClass.setText("Obesidade grau 1");
                imageView.setImageResource(R.drawable.obesidade1);
            }else if (imc >= 35 && imc <= 39.99) {
                tvClass.setText("Obesidade grau 2");
                imageView.setImageResource(R.drawable.obesidade2);
            }else {
                tvClass.setText("Obesidade grau 3");
                imageView.setImageResource(R.drawable.obesidade3);
            }


        });



    }
}