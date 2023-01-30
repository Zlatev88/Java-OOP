package _1_WorkingWithAbstraction.Exercise._2_CardRank;



import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        Arrays.stream(CardRanks.values()).
                forEach(e-> System.out.println(String.format("Ordinal value: %d; Name value: %s", e.ordinal(), e.name())));
    }
}
