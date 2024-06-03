package org.unrn.ejercicio3;

public class Main {
    public static void main(String[] args) {
        var p1 = new Producto(new TipoLibro(), 30);
        var p2 = new Producto(new TipoMedicina(), 330);
        var p3 = new Producto(new TipoAlimento(), 130);
        var p4 = new Producto(new TipoOtro(), 130);
        System.out.println(p1.precioFinal());
        System.out.println(p2.precioFinal());
        System.out.println(p3.precioFinal());
        System.out.println(p4.precioFinal());
    }
}