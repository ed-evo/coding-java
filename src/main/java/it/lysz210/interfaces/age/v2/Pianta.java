package it.lysz210.interfaces.age.v2;

import java.time.LocalDate;

/**
 * rappresentazione di una pianta.
 * E' sempre un essere vivente ma la datazione
 * generalmente non e' registrato in modo preciso come
 * una persona e si effettua una stima della sua germinazione
 * che rappresenta la data di nascita senza contare
 * gli stadi precedenti a partire dal fiore e poi frutto.
 */
interface Pianta extends EssereVivente {
    /**
     * data stimata della germinazione della pianta
     * @return data stimata della germinazione
     */
    LocalDate getDataStimataGerminazione();

    /**
     * Data di nascita della pianta che corrisponde
     * alla sua data di germinazione
     * @return data di nascita
     */
    default LocalDate getDataNascita() {
        return getDataStimataGerminazione();
    }
}
