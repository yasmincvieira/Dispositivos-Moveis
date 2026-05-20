package com.example.meuapp;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        sqLiteDatabase = openOrCreateDatabase("notas", MODE_PRIVATE, null);

        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS notas (id INTEGER PRIMARY KEY AUTOINCREMENT, titulo TEXT, nota TEXT )");

        //*  nomeColuna, valor  *
        ContentValues contentValues = new ContentValues();
        contentValues.put("titulo", "João");
        contentValues.put("nota", "777777777");
        sqLiteDatabase.insert("notas", null, contentValues);

        //recuperar dados do sqlite
        Cursor c = sqLiteDatabase.rawQuery("SELECT id,id*10,titulo,nota FROM notas", null);
        c.moveToFirst(); //movimenta o ponteiro do cursor para o primeiro registro recuperado

        int id = c.getInt(c.getColumnIndex("id"));
        String titulo = c.getString(c.getColumnIndex("titulo"));
        String nota = c.getString(c.getColumnIndex("nota"));
        Log.d("SELECT", Integer.toString(id)+titulo+","+nota);

    }
}