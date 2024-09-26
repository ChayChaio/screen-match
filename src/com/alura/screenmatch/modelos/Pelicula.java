package com.alura.screenmatch.modelos;

import com.alura.screenmatch.calculos.Clasificable;
import com.google.gson.annotations.SerializedName;

public class Pelicula extends Titulo implements Clasificable {
    private String director;
    private String paisDeOrigen;

    public Pelicula() {
    }

    public Pelicula(String nombre, int fechaDeLanzamiento, boolean incluidoEnElPlan, int duracionEnMinutos, String director, String paisDeOrigen) {
        super(nombre, fechaDeLanzamiento, incluidoEnElPlan, duracionEnMinutos);
        this.director = director;
        this.paisDeOrigen = paisDeOrigen;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    @Override
    public int getClasificacion() {
        return (int) calculaMediaEvaluaciones() / 2;
    }

    @Override
    public String toString() {
        return "Título película= '" + this.getNombre() + "' (" + this.getFechaDeLanzamiento() + ")";
    }
}
