package org.unrn.ejercicio1;

public class EstrategiaCorreoArgentino implements EstrategiaDeEnvio {
    ListaDistancias listaDistancias = new ListaDistancias();

    @Override
    public float calcularPrecio(String destino, float peso) {
        float precio;
        if (listaDistancias.getCategoria(destino).equals("CAPITAL")) precio = 500;
        else precio = 800f + 5f * listaDistancias.getDistancia(destino);

        return precio;
    }
}