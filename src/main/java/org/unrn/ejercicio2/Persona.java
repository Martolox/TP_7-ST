package org.unrn.ejercicio2;

import java.time.LocalDate;
import java.util.HashMap;

public class Persona {
    private final LocalDate fechaNac;
    private HashMap<String, Formato> mapEstrategia = new HashMap<String, Formato>();

    public Persona(LocalDate fechaNac) {
        mapEstrategia.put("CORTO", new FormatoCorto());
        mapEstrategia.put("LARGO", new FormatoLargo());
        this.fechaNac = fechaNac;
    }

    public String fechaNacimiento(String formato) {
        return mapEstrategia.get(formato).getFechaFormateada(fechaNac);
    }
}