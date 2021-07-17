package it.lysz210.interfaces.age.v2;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.Period;

/**
 * in questo secondo esempio e' stato aumentato la generalizzazione
 * del metodo calcolaEta che ora prende in input un qualsiasi essere vivente.
 * L'elaborazione e' rimasto invariato.
 */
@Slf4j
class AgeExample {

    /**
     * Esegue il calcolo dell'eta' di una essereVivente rispetto ad oggi
     * @param essereVivente a cui calcolare l'eta'
     * @return l'eta' dell'essere vivente.
     */
    public static Period calcolaEta (EssereVivente essereVivente) {
        return Period.between(essereVivente.getDataNascita(), LocalDate.now());
    }
    public static void main(String[] args) {
        Persona mario = new PersonaImpl(LocalDate.of(2000, 1,1));
        Pianta a1 = new Albero(LocalDate.of(2021, 1, 12));
        Period eta = calcolaEta(mario);
        log.info("Mario ha {} anni.", eta.getYears());
        eta = calcolaEta(a1);
        log.info("Quell'albero ha {} mesi.", eta.getMonths());
    }
}