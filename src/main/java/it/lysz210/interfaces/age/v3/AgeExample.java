package it.lysz210.interfaces.age.v3;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.Period;

@Slf4j
class AgeExample {
    public static void main(String[] args) {
        AgeScanner scanner = new AgeScanner();
        Persona mario = new PersonaImpl(LocalDate.of(2000, 1,1));
        Persona antonio = new PersonaImpl(LocalDate.now().minusDays(45));
        Pianta a1 = new Albero(LocalDate.of(2021, 1, 12));
        log.info("Verifica eta' di Mario.");
        scanner.scan(mario);
        log.info("Verifica eta' Antonio figlio di Mario.");
        scanner.scan(antonio);
        log.info("Verifica eta' di questo albero.");
        scanner.scan(a1);
    }
}