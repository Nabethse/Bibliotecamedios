package com.nabethse.bibliotecamedios.models;

public class Cancion extends Medio{
    private String artista;
    private int duracionSegundos;

    public Cancion(String titulo, String genero, String artista, int duracionSegundos) {
        super(titulo, genero);
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Artista: " + artista);
        System.out.println("Duración: " + duracionSegundos + " segundos");
    }
}
