package it.lysz210.interfaces.age.v2;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

/**
 * Implementazione base di una persona.
 * La data di nascita e' un dato immutabile
 */
@Data
@RequiredArgsConstructor
class PersonaImpl implements Persona {
    /**
     * data di nascita della persona
     */
    final LocalDate dataNascita;
}
