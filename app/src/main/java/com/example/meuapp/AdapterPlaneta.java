package com.example.meuapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdapterPlaneta extends ArrayAdapter<Planeta> {
    Context lcontext;

    public AdapterPlaneta(@NonNull Context context, int resource, @NonNull List<Planeta> objects) {
        super(context, resource, objects);
        lcontext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Inflar layout
        LayoutInflater layoutInflater = LayoutInflater.from(lcontext);
        View view = layoutInflater.inflate(R.layout.item,parent, false);

        //Preencher o item da listagem na variavel view
        TextView tvNome = view.findViewById(R.id.textView);
        ImageView imageView = view.findViewById(R.id.imageView);
        Planeta p = getItem(position);
        tvNome.setText(p.nome);
        imageView.setImageResource(p.foto);


        return view;
    }
}
