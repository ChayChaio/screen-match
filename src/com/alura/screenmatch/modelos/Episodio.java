package com.alura.screenmatch.modelos;

import com.alura.screenmatch.calculos.Clasificable;

public class Episodio implements Clasificable {
    private int numero;
    private int temporada;
    private String nombre;
    private Serie serie;
    private int totalVisualizaciones;

    public Episodio() {
    }

    public Episodio(int numero, int temporada, String nombre, Serie serie) {
        this.numero = numero;
        this.temporada = temporada;
        this.nombre = nombre;
        this.serie = serie;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion() {
        if (totalVisualizaciones > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
