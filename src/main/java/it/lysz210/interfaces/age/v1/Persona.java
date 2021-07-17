package it.lysz210.interfaces.age.v1;

import java.time.LocalDate;

/**
 * interfaccia per rappresentare
 * una persona
 * con una data di nascita
 */
interface Persona {
    /**
     * data di nascita
     * @return data di nascita
     */
    LocalDate getDataNascita();
}
