package Uebung_1;

public class Uebung_2 {
    public static void main(String[] args) {
        int[] zahlen1 = {20, 30, 40, 50};
        int[] zahlen2 = {2, 3, 4, 5, 6};
        System.out.println(durchschnitt(zahlen1)); // Ausgabe: 35.0
        System.out.println(durchschnitt(zahlen2)); // Ausgabe: 4.0
    }

    public static double durchschnitt(int[] zahlen) {
        int summe = 0;
        for (int zahl : zahlen) {
            summe += zahl;
        }
        return (double) summe / zahlen.length;
    }
}