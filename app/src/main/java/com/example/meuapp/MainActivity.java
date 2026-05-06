package com.example.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    String nomes[] = new String[]{"Daniel", "Sofia", "Prancha", "Davi", "Iran", "Fernando", "Borracha"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this, //Contexto
                android.R.layout.simple_list_item_1, //Recurso de Layout xml
                android.R.id.text1, //id do textView interno do layout
                nomes //array de String DataSource
        );

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            i.putExtra("nome", nomes[position]);//["nome", valor
            startActivity(i);
        });
    }
}