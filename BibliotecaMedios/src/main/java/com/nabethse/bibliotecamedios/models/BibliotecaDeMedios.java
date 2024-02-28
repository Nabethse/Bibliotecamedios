package com.nabethse.bibliotecamedios.models;
import java.util.ArrayList;
public class BibliotecaDeMedios {
    private ArrayList<Medio> medios;
    private ArrayList<String> favoritos;
    public BibliotecaDeMedios(){
        this.medios = new ArrayList<>();
    }
    public boolean agregarMedio(Medio medio){
        return medios.add(medio);
    }
    public void mostrarDetalles(String titulo){
        for (int i=0; i<medios.size();i++){
            Medio medio = medios.get(i);
            if (medio.getTitulo().equals(titulo)){
                medio.mostrarDetalles();
                return;
            }
        }
        System.out.println(titulo);
    }

    public void buscarPorGenero(String genero){
        System.out.println("Resultado para el genero"+ genero+":");
        for (int i=0; i<medios.size();i++){
            Medio medio = medios.get(i);
            if (medio.getGenero().equals(genero)){
                System.out.println(medio.getTitulo());
            }
        }
    }
    public void marcarComoFavorito(String titulo){
        for (int i=0; i<medios.size();i++){
            Medio medio =medios.get(i);
            if (medio.getTitulo().equals(titulo)){
                medio.marcarComoFavorito();
                System.out.println(titulo+"marcado como favorito");
            }
        }
        System.out.println("No se encuentra"+titulo+"en la biblioteca");
    }
}
