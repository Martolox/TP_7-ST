package org.unrn.ejercicio3;

public class TipoMedicina implements TipoProducto {
    double impuestos = 0;
    double descuentos = 0;

    @Override
    public double calcularPrecio(double precio) {
        if (precio > 50) descuentos = 0.1;
        double total = precio * (1 + impuestos) * (1 - descuentos);
        if (precio > 100) total -= 10;
        return total;
    }
}
