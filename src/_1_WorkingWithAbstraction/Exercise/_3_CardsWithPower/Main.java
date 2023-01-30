package _1_WorkingWithAbstraction.Exercise._3_CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardRanks cardRanks = CardRanks.valueOf(scanner.nextLine());
        CardSuits cardSuits = CardSuits.valueOf(scanner.nextLine());
        Card card = new Card(cardRanks, cardSuits);

        System.out.println(String.format("Card name: %s of %s; Card power: %d", card.getCardRanks(), card.getCardSuits(), card.getPower()));
    }
}
