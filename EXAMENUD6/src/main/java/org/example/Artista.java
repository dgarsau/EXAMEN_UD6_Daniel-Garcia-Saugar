package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Artista extends MutxaAwards implements AccionesAsistentes{

    private String nombre;
    private ArrayList<Premio> listaPremios;
    private ArrayList<Categoria> categorias;

    public Artista(int edicion, String nombre) {
        super(edicion);
        this.nombre = nombre;
        listaPremios=new ArrayList<>();
        categorias=new ArrayList<>();
    }

    public void anyadirCategoria(Categoria categoria){
        categorias.add(categoria);
    }

    public void esNominado(Categoria categoria){
        System.out.println("El artista " + getNombre() + " es nominadado a " + categoria);
        categorias.add(categoria);
    }

    public void ganarPremio(Premio premio){
        System.out.println("El artista " + getNombre() + " ha ganado el premio a " + premio.getCategoria());
        listaPremios.add(premio);
        premio.setGanador(this);
    }

    public void recogerPremio(Premio premio){
        if (listaPremios.contains(premio)){
            System.out.println("El artista " + getNombre() + " sube a recoger el premio a " + premio.getCategoria());
        } else {
            throw new PerdedorException("El artista " + getNombre() + " puede recoger el premio porque no lo ha ganado");
        }
    }


    @Override
    public void aplaudir() {
        System.out.println("El artista " + nombre + " aplaude (clap, clap, clap)...");
    }

    @Override
    public void alfombraRoja() {
        System.out.println("El artista " + nombre + " acaba de pasar por la alfombra roja...");
    }

    @Override
    public void darDiscurso(String tematica) {
        System.out.println("El artista " + nombre + " da un discurso sobre " + tematica);
    }

    @Override
    public void celebrarPremio(Premio premio) {
        System.out.println("El artista " + nombre + " está celebrando el premio " + premio.getCategoria() + " otorgado a " + premio.getGanadorNombre());
    }

    @Override
    void obtenerDetalles() {
        String detalles = "Artista: " + nombre + ", con " + listaPremios.size() + " nominaciones a "+ categorias + " y " + listaPremios.size() + " premios ganados: " + listaPremios;
        System.out.println(detalles);
    }

    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Premio> getListaPremios() {
        return listaPremios;
    }

    public void setListaPremios(ArrayList<Premio> listaPremios) {
        this.listaPremios = listaPremios;
    }

}
