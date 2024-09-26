package com.alura.screenmatch.main;

import com.alura.screenmatch.calculos.CalculadoraDeTiempo;
import com.alura.screenmatch.calculos.FiltroRecomendacion;
import com.alura.screenmatch.modelos.Episodio;
import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021, true, 180, null, "EEUU");
        System.out.println("Duración de la película: " + miPelicula.getDuracionEnMinutos());

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8);
        miPelicula.evalua(5);
        miPelicula.evalua(10);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMediaEvaluaciones());


        Serie lost = new Serie("Lost", 2000, true, 6, true, 20, 50);
        System.out.println("Duración de la serie: " + lost.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Millennium", 2009, true, 145, "Niels Arden Oplev", "Suecia");


        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluido(miPelicula);
        calculadora.incluido(otraPelicula);
        calculadora.incluido(lost);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtro = new FiltroRecomendacion();
        filtro.filtra(miPelicula);

        Episodio episodio = new Episodio(01, 1, "Piloto", lost);


        var nuevaPelicula = new Pelicula("El señor de los anillos", 2001, true, 178, "Peter Jackson", "EE.UU.");


        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(nuevaPelicula);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());

        System.out.println("La primera película es: " + listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas.get(0).toString());

        System.out.println(listaDePeliculas);


    }
}