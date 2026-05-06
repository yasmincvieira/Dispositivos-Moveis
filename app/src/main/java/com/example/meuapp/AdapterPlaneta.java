package com.example.meuapp;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class AdapterPlaneta extends ArrayAdapter<Planeta> {

    public AdapterPlaneta(@NonNull Context context, int resource, @NonNull Planeta[] objects) {
        super(context, resource, objects);
    }
}
