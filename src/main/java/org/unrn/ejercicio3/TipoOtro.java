package org.unrn.ejercicio3;

public class TipoOtro implements TipoProducto {
    double impuestos = 0.15;
    double descuentos = 0.05;

    @Override
    public double calcularPrecio(double precio) {
        if (precio > 50) descuentos = 0.05;
        double total = precio * (1 + impuestos) * (1 - descuentos);
        if (precio > 200) total -= 10;
        return total;
    }
}
