package com.nabethse.bibliotecamedios.models;

public class Cancion extends Medio {
    private String artista;
    private String duracionSegundos;

    public Cancion(String titulo, String genero, String artista, String duracionSegundos) {
        super(titulo, genero);
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(String duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Artista: " + artista);
        System.out.println("Duración: " + duracionSegundos + " segundos");
    }
    public String toString() {
        return "Nombre del caso: " + artista + ", Tipo de caso: " + duracionSegundos + ", Nombre del abogado: "+ getTitulo()+",genero:" + getGenero();
    }
}
