package com.alura.screenmatch.main;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021, true, 180, null, "EEUU");
        miPelicula.evalua(5);
        Serie lost = new Serie("Lost", 2000, true, 6, true, 20, 50);
        lost.evalua(7);
        Pelicula otraPelicula = new Pelicula("Millennium", 2009, true, 145, "Niels Arden Oplev", "Suecia");
        otraPelicula.evalua(9);
        var nuevaPelicula = new Pelicula("El señor de los anillos", 2001, true, 178, "Peter Jackson", "EE.UU.");
        nuevaPelicula.evalua(3);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(nuevaPelicula);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(lost);

        for (Titulo item:lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2 ){
                System.out.println("Clasificación de la película: " + pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darín");
        System.out.println("Lista de artistas no ordenada: " + listaDeArtistas);
        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: " + lista);


    }
}