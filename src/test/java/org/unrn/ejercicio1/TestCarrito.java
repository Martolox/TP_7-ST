package org.unrn.ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCarrito {
    List<Producto> lista;

    @BeforeEach
    public void setup() {
        lista = new ArrayList<>();
        lista.add(new Producto(1000, 1f));
        lista.add(new Producto(2000, 1.5f));
        lista.add(new Producto(3000, 2f));
    }

    @Test
    public void seCalculaConColectivoACapital() {
        EstrategiaDeEnvio estrategia = new EstrategiaColectivosSur();
        CarritoDeCompras carrito = new CarritoDeCompras(estrategia, lista, "CAPITAL");
        assertEquals(7000, carrito.calcularPrecio());
        lista.add(new Producto(0, 1f));
        assertEquals(7500, carrito.calcularPrecio());
        lista.add(new Producto(0, 25f));
        assertEquals(9000, carrito.calcularPrecio());
    }

    @Test
    public void seCalculaConColectivoAInterior() {
        EstrategiaDeEnvio estrategia = new EstrategiaColectivosSur();
        CarritoDeCompras carrito = new CarritoDeCompras(estrategia, lista, "AZUL");
        assertEquals(7500, carrito.calcularPrecio());
        lista.add(new Producto(0, 1f));
        assertEquals(8000, carrito.calcularPrecio());
        lista.add(new Producto(0, 25f));
        assertEquals(9500, carrito.calcularPrecio());
    }

    @Test
    public void seCalculaConColectivoAOtro() {
        EstrategiaDeEnvio estrategia = new EstrategiaColectivosSur();
        CarritoDeCompras carrito = new CarritoDeCompras(estrategia, lista, "VIEDMA");
        assertEquals(9000, carrito.calcularPrecio());
        lista.add(new Producto(0, 1f));
        assertEquals(9500, carrito.calcularPrecio());
        lista.add(new Producto(0, 25f));
        assertEquals(11000, carrito.calcularPrecio());
    }

    @Test
    public void seCalculaConCorreoACapital() {
        EstrategiaDeEnvio estrategia = new EstrategiaCorreoArgentino();
        CarritoDeCompras carrito = new CarritoDeCompras(estrategia, lista, "CAPITAL");
        assertEquals(6500, carrito.calcularPrecio());
    }

    @Test
    public void seCalculaConCorreoAInterior() {
        EstrategiaDeEnvio estrategia = new EstrategiaCorreoArgentino();
        CarritoDeCompras carrito = new CarritoDeCompras(estrategia, lista, "AZUL");
        assertEquals(7122.5, carrito.calcularPrecio(), 0.2f);
    }

    @Test
    public void seCalculaConCorreoAOtro() {
        EstrategiaDeEnvio estrategia = new EstrategiaCorreoArgentino();
        CarritoDeCompras carrito = new CarritoDeCompras(estrategia, lista, "VIEDMA");
        assertEquals(10785.55, carrito.calcularPrecio(), 0.2f);
        lista.add(new Producto(0, 1f));
    }
}
