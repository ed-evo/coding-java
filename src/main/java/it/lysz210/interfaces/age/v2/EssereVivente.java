package it.lysz210.interfaces.age.v2;

import java.time.LocalDate;

/**
 * interfaccia base per rappresentare
 * un essere vivente
 * che ha una data di nascita.
 */
interface EssereVivente {
    /**
     * data di nascita
     * @return data di nascita
     */
    LocalDate getDataNascita();
}
