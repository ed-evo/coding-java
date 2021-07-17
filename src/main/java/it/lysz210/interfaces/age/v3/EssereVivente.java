package it.lysz210.interfaces.age.v3;

import java.time.LocalDate;
import java.time.Period;

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

    default Period calcolaEta () {
        return Period.between(this.getDataNascita(), LocalDate.now());
    }
}
