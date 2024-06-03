package org.unrn.ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class ListaDistancias {

    // Crear mapas
    private Map<String, Float> distancia = new HashMap<>();
    private Map<String, String> categoria = new HashMap<>();

    public ListaDistancias() {
        poblarMapas();
    }

    private void poblarMapas() {
        distancia.put("CAPITAL", 0.0f);
        categoria.put("CAPITAL", "CAPITAL");
        distancia.put("AZUL", 64.5f);
        categoria.put("AZUL", "INTERIOR");
        distancia.put("VIEDMA", 797.11f);
        categoria.put("VIEDMA", "OTRO");
//        distancia.put("BARILOCHE", 1578.3f);
//        categoria.put("BARILOCHE", "OTRO");
    }

    public float getDistancia(String destino) {
        return distancia.get(destino);
    }

    public String getCategoria(String destino) {
        return categoria.get(destino);
    }
}
