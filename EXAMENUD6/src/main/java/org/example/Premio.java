package org.example;

public class Premio extends MutxaAwards {

    private Categoria categoria;
    private Artista ganador;

    public Premio(int edicion, Categoria categoria) {
        super(edicion);
        this.categoria = categoria;
    }

    @Override
    void obtenerDetalles() {

    }

    //Creo este metodo para luego poder saber el nombre del ganador a través del premio.
    public String getGanadorNombre() {
        return ganador.getNombre();
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Artista getGanador() {
        return ganador;
    }

    public void setGanador(Artista ganador) {
        this.ganador = ganador;
    }

    @Override
    public String toString() {
        return categoria.toString();
    }

}
