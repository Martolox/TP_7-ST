package org.unrn.ejercicio1;

import java.util.List;

public class CarritoDeCompras {
    private final EstrategiaDeEnvio estrategia;
    private List<Producto> lista;
    private String destino;

    public CarritoDeCompras(EstrategiaDeEnvio estrategia, List<Producto> lista, String destino) {
        this.estrategia = estrategia;
        this.lista = lista;
        this.destino = destino;
    }

    public float calcularPrecio() {
        return precioProductos() + precioEnvio();
    }

    private float precioProductos() {
        float precio = 0;
        for (Producto p : lista) {
            precio += p.getPrecio();
        }
        return precio;
    }

    private float precioEnvio() {
        return estrategia.calcularPrecio(destino, pesoProductos());
    }

    private float pesoProductos() {
        float peso = 0;
        for (Producto p : lista) {
            peso += p.getPeso();
        }
        return peso;
    }
}
