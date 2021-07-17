package it.lysz210.interfaces.age.v3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

/**
 * Rappresentazione di un'albero
 * implementazione di una pianta.
 * La data stimata di germinaizone
 * non e' final perche' potrebbe cambiare
 * con eventuale riesame
 */
@Data
@AllArgsConstructor
class Albero implements Pianta {
    /**
     * Data stimata di germinazione
     */
    LocalDate dataStimataGerminazione;
}
