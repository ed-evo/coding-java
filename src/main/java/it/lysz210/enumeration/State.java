package it.lysz210.enumeration;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

import static it.lysz210.enumeration.Attribute.OFF;
import static it.lysz210.enumeration.Attribute.ON;

public enum State {
    S0, S1, S2;

    private final Map<Attribute, State> transitions = new HashMap<>();

    public State next (Attribute input) {
        Objects.requireNonNull(input);
        return transitions.get(input);
    }

    public enum Transition {
        S0_S1(S0, S1, ON), S0_S2(S0, S2, OFF),
        S1_S1(S1, S1, ON), S1_S2(S1, S2, OFF),
        S2_S1(S2, S1, ON), S2_S2(S2, S2, OFF);

        final State current;
        final State next;
        final Attribute input;

        Transition (State current, State next, Attribute attr) {
            this.current = current;
            this.next = next;
            this.input = attr;
        }

        void addToState () {
            this.current.transitions.put(this.input, this.next);
        }
    }

    static {
        Stream.of(Transition.values())
            .forEach(Transition::addToState);
    }
}
