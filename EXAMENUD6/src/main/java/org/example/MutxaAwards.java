package org.example;

abstract class MutxaAwards {

    public MutxaAwards(int edicion) {
        this.edicion = edicion;
    }

    private int edicion;

    abstract void obtenerDetalles();

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

}
