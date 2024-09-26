package com.alura.screenmatch.main;

import com.alura.screenmatch.exception.ErrorNumerosNoDetectadosException;
import com.alura.screenmatch.modelos.Titulo;
import com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);

        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true) {
            System.out.println("Escriba la pelicula: ");
            var pelicula = teclado.next();


            if (pelicula.equalsIgnoreCase("salir")) {
                break;
            }

            String direccion = "http://www.omdbapi.com/?t=" + pelicula + "&apikey=2d094555";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion.replace(" ", "+")))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                System.out.println(response.body());


                TituloOmdb pruebaTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(pruebaTituloOmdb);

                Titulo pruebaTitulo = new Titulo(pruebaTituloOmdb);
                System.out.println("Título ya convertido: " + pruebaTitulo);


                titulos.add(pruebaTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Ocurrió un error: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error en la URI. Revise la dirección.");
            } catch (ErrorNumerosNoDetectadosException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);
        FileWriter escritura = new FileWriter("titulos.json");
        escritura.write(gson.toJson(titulos));
        escritura.close();
        System.out.println("Finalizó la ejecución del programa");

    }
}
