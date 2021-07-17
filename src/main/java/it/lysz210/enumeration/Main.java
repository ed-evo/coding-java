package it.lysz210.enumeration;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        State state = State.S0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner input = new Scanner(System.in);

        do {
            System.out.printf("Current state %s\n", state);
            System.out.print("Insert state change (yes, no, exit): ");
            String value = input.nextLine();
            Attribute change = Attribute.fromValue(value);
            if (change == Attribute.QUITE) {
                System.out.println("Quitting...");
                break;
            }
            if (Objects.isNull(change)) {
                System.out.printf("Invalid input: %s\n", value);
                continue;
            }
            state = state.next(change);
        } while (true);
    }
}
