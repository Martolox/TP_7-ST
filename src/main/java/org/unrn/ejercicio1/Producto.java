package org.unrn.ejercicio1;

public class Producto {
    private float precio;
    private float peso;

    public Producto(float precio, float peso) {
        this.precio = precio;
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public float getPeso() {
        return peso;
    }
}
