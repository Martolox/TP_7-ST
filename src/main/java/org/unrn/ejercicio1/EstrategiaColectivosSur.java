package org.unrn.ejercicio1;

public class EstrategiaColectivosSur implements EstrategiaDeEnvio {
    ListaDistancias wd = new ListaDistancias();

    @Override
    public float calcularPrecio(String destino, float peso) {
        float precio;
        if (wd.getCategoria(destino).equals("CAPITAL")) precio = 1000f;
        else if (wd.getCategoria(destino).equals("INTERIOR")) precio = 1500f;
        else precio = 3000f;

        if (peso > 30f) precio += 2000f;
        else if (peso > 5f) precio += 500f;

        return precio;
    }
}
