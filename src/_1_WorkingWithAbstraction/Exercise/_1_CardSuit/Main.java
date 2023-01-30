package _1_WorkingWithAbstraction.Exercise._1_CardSuit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");
        Arrays.stream(CardSuits.values())
                .forEach(e-> System.out.println(String.format("Ordinal value: %d; Name value: %s",e.ordinal(), e.name())));
    }
}
