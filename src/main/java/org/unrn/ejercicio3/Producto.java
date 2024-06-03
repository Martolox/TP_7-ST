package org.unrn.ejercicio3;

public class Producto {
    public TipoProducto tipo;
    public double precio;

    public Producto(TipoProducto tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public double precioFinal() {
        return tipo.calcularPrecio(precio);
    }
}
