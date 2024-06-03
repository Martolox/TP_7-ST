package org.unrn.ejercicio3;

public class TipoAlimento implements TipoProducto {
    double impuestos = 0.05;
    double descuentos = 0.15;

    @Override
    public double calcularPrecio(double precio) {
        if (precio > 100) descuentos = 0.15;
        double total = precio * (1 + impuestos) * (1 - descuentos);
        if (precio > 200) total -= 10;
        return total;
    }
}
