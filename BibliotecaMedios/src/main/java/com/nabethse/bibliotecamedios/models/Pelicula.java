package com.nabethse.bibliotecamedios.models;

public class Pelicula extends Medio {
    private int duracionMinutos;
    private String director;

    public Pelicula(String titulo, String genero, int duracionMinutos, String director) {
        super(titulo, genero);
        this.duracionMinutos = duracionMinutos;
        this.director = director;
    }


    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Duración: " + duracionMinutos + " minutos");
        System.out.println("Director: " + director);
    }
}
