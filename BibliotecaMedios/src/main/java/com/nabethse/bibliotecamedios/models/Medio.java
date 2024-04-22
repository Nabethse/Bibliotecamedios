package com.nabethse.bibliotecamedios.models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Medio)) return false;
        Medio medio = (Medio) o;
        return Objects.equals(getTitulo(), medio.getTitulo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo());
    }
}

