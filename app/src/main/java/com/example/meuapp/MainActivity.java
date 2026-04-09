package com.example.meuapp;

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
        tvResultado=findViewById(R.id.tvResultado);
        tvClass=findViewById(R.id.tvClass);


        btCaucular.setOnClickListener(v -> {
            String strPeso = etPeso.getText().toString();
            String strAltura = etAltura.getText().toString();

            Double peso = Double.parseDouble(strPeso);
            Double altura = Double.parseDouble(strAltura);

            Double imc = peso/(altura*altura);
            DecimalFormat dc = new DecimalFormat("##.##");

            tvResultado.setText(dc.format(imc));




        });



    }
}