package it.lysz210.interfaces.age.v1;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.Period;

/**
 * in questo primo esempio
 * l'eta' viene calcolato da un metodo
 * che prende in input una Persona
 * e restituisce un Priod
 */
@Slf4j
class AgeExample {

    /**
     * calcola l'eta' della parsona rispetto ad ora
     * @param persona a cui calcolare l'eta'
     * @return l'eta' di persona
     */
    public static Period calcolaEta (Persona persona) {
        return Period.between(persona.getDataNascita(), LocalDate.now());
    }

    public static void main(String[] args) {
        Persona mario = new PersonaImpl(LocalDate.of(2000, 1,1));
        Period eta = calcolaEta(mario);
        log.info("Mario ha {} anni.", eta.getYears());
    }
}