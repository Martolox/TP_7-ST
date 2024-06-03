package org.unrn.ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatoLargo implements Formato {
    @Override
    public String getFechaFormateada(LocalDate fechaNac) {
        return fechaNac.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }
}
