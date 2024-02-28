package com.nabethse.bibliotecamedios.models;

public class Serie extends Medio{
    private int numTemporadas;
    private String creador;

    public Serie(String titulo, String genero, int numTemporadas, String creador) {
        super(titulo, genero);
        this.numTemporadas = numTemporadas;
        this.creador = creador;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de temporadas: " + numTemporadas);
        System.out.println("Creador: " + creador);
    }
}
