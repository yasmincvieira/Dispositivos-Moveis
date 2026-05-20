package com.example.meuapp;

import java.util.ArrayList;

public class PlanetaDAO {
    ArrayList<Planeta> listaPlanetas;

    public PlanetaDAO() {
        listaPlanetas.add(new Planeta("Mercurio", R.drawable.mercury,"3,285 x 10^23kg"));
        listaPlanetas.add(new Planeta("Venus",R.drawable.venus,"4,867 x 10^24kg"));
        listaPlanetas.add(new Planeta("Terra",R.drawable.earth,"5,972 x 10^24kg"));
        listaPlanetas.add(new Planeta("Marte",R.drawable.mars,"6,39 x 10^23kg"));
        listaPlanetas.add(new Planeta("Jupiter",R.drawable.jupter,"1,898 x 10^27kg"));
        listaPlanetas.add(new Planeta("Saturno",R.drawable.saturn,"5,683 x 10^26kg"));
        listaPlanetas.add(new Planeta("Urano",R.drawable.uranus,"8,681 x 10^25kg"));
        listaPlanetas.add(new Planeta("Netuno",R.drawable.neptune,"1,024 x 10^26kg"));
    }

    public ArrayList<Planeta> listaPlanetas(){
        return listaPlanetas;
    }

}
