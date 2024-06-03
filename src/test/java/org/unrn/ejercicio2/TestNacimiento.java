package org.unrn.ejercicio2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestNacimiento {
    @Test
    public void seImprimeFechaCorta() {
        Persona p = new Persona(LocalDate.of(1986, 6, 3));
        assertEquals("3/6/86", p.fechaNacimiento("CORTO"));
    }

    @Test
    public void seImprimeFechaLarga() {
        Persona p = new Persona(LocalDate.of(1986, 6, 3));
        assertEquals("3 de junio de 1986", p.fechaNacimiento("LARGO"));
    }
}