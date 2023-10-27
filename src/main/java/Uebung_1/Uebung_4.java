package Uebung_1;

public class Uebung_4 {

    public static void main(String[] args) {
        int[] zahlen = new int[100];

        // Jeder Stelle ihren Indexwert zuweisen
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = i + 1;
        }

        // Jede Stelle von dem Array mit zwei multiplizieren
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] *= 2;
        }

        // Ausgabe des Arrays zur Überprüfung
        for (int zahl : zahlen) {
            System.out.println(zahl);
        }
    }
}
