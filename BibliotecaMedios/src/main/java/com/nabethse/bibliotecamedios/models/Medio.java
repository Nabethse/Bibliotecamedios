package com.nabethse.bibliotecamedios.models;

public class Medio {
    private String titulo;
    private String genero;

    public Medio(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void mostrarDetalles() {
        System.out.println("Detalles de " + titulo + ":");
        System.out.println("Género: " + genero);
    }

    public void marcarComoFavorito() {
        System.out.println(titulo + " marcado como favorito.");
    }
}


