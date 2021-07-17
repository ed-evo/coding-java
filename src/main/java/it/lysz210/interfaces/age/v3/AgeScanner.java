package it.lysz210.interfaces.age.v3;

import lombok.extern.slf4j.Slf4j;

import java.time.Period;

/**
 * Verifica l'eta' di un essere vivente
 * comunicando il valore piu' significativo.
 */
@Slf4j
public class AgeScanner {
    /**
     * Recupera l'eta di un essere vivente
     * e ne comunica il valore piu' significativo.
     * Se ha 2 anni o piu' vengono stampati gli anni
     * Se ha 3 mesi o piu' vengono stampati i mesi
     * Altrimenti vengono stampati i giorni.
     * @param essereVivente su cui verificare l'eta'
     */
    public void scan (EssereVivente essereVivente) {
        Period age = essereVivente.calcolaEta();
        int value = age.getYears();
        String tipo = "anni";
        if (value < 2) {
            value = age.getMonths();
            tipo = "mesi";
            if (value < 3) {
                value = age.getDays();
                tipo = value < 2 ? "giorno" : "giorni";
            }
        }
        log.info("Eta': {} {}", value, tipo);
    }
}
