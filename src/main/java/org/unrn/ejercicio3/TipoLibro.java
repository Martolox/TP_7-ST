package org.unrn.ejercicio3;

public class TipoLibro implements TipoProducto {
    double impuestos = 0.1;
    double descuentos = 0.1;

    @Override
    public double calcularPrecio(double precio) {
        double total = precio * (1 + impuestos) * (1 - descuentos);
        if (precio > 100) total -= 10;
        return total;
    }
}
