package com.nabethse.bibliotecamedios.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BibliotecaDeMedios {
    private List<Libro> libros = new ArrayList<>();
    private List<Cancion> canciones = new ArrayList<>();
    private List<Pelicula> peliculas = new ArrayList<>();
    private List<Serie> series = new ArrayList<>();
    private List<String> favoritos = new ArrayList<>();
    private List<Medio> medios = new ArrayList<>();

    public boolean addLibro(Libro libro) {
        medios.add(libro);
        return libros.add(libro);
    }

    public boolean addCancion(Cancion cancion) {
        medios.add(cancion);
        return canciones.add(cancion);
    }

    public boolean addPelicula(Pelicula pelicula) {
        medios.add(pelicula);
        return peliculas.add(pelicula);
    }

    public boolean addSerie(Serie serie) {
        medios.add(serie);
        return series.add(serie);
    }

    public boolean addFavorito(String medio) {
        return favoritos.add(medio);
    }

    public boolean contieneLibro(String nombreMedio) {
        return libros.stream().anyMatch(libro -> libro.getTitulo().equalsIgnoreCase(nombreMedio));
    }

    public boolean contieneCancion(String nombreMedio) {
        return canciones.stream().anyMatch(cancion -> cancion.getTitulo().equalsIgnoreCase(nombreMedio));
    }

    public boolean contienePelicula(String nombreMedio) {
        return peliculas.stream().anyMatch(pelicula -> pelicula.getTitulo().equalsIgnoreCase(nombreMedio));
    }

    public boolean contieneSerie(String nombreMedio) {
        return series.stream().anyMatch(serie -> serie.getTitulo().equalsIgnoreCase(nombreMedio));
    }

    public boolean contieneMedio(String nombreMedio) {
        return contieneLibro(nombreMedio) || contieneCancion(nombreMedio) || contienePelicula(nombreMedio) || contieneSerie(nombreMedio);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public List<String> getFavoritos() {
        return favoritos;
    }

    public boolean esFavorito(String medio) {
        return favoritos.contains(medio);
    }

    public List<Medio> getMedios() {
        return medios;
    }

    public List<Medio> buscarMedioPorGenero(String genero) {
        return medios.stream()
                .filter(medio -> medio.getGenero().equalsIgnoreCase(genero))
                .collect(Collectors.toList());
    }
    public boolean agregarMedio(Medio medio) {
        medios.add(medio);
        return true;
    }
}
