package org.example;

public class Presentador extends MutxaAwards implements AccionesAsistentes {

    private String nombre;

    public Presentador(int edicion, String nombre) {
        super(edicion);
        this.nombre = nombre;
    }


    public void presentar(){
        System.out.println(nombre + " presentando la gala...");
    }

    public void entregarPremio(Premio premio){
        System.out.println("El presentador " + nombre + " está entregando el premio " + premio.getCategoria() + " a " + premio.getGanadorNombre());
    }

    @Override
    public void aplaudir() {
        System.out.println("El presentador " + nombre + " aplaude (clap, clap, clap)...");
    }

    @Override
    public void alfombraRoja() {
        System.out.println("El presentador " + nombre + " acaba de pasar por la alfombra roja...");
    }

    @Override
    public void darDiscurso(String tematica) {
        System.out.println("El presentador " + nombre + " da un discurso para " + tematica);
    }

    @Override
    public void celebrarPremio(Premio premio) {
        System.out.println("El presentador " + nombre + " está celebrando el premio " + premio.getCategoria() + " otorgado a " + premio.getGanadorNombre());
    }

    @Override
    void obtenerDetalles() {
        System.out.println("El presentador para la edicion " + super.getEdicion() + " es " + nombre);
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
