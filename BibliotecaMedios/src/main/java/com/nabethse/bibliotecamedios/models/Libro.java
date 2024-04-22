package com.nabethse.bibliotecamedios.models;

public class Libro extends Medio {
    private String autor;
    private int numPaginas;

    public Libro(String titulo, String genero, String autor, int numPaginas) {
        super(titulo, genero);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
    }
}
