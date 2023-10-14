import java.util.Scanner;

public class Uebung_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int x = scanner.nextInt();
        switch (Integer.compare(x, 5)) {
            case -1:
                System.out.println(x + " ist kleiner als 5");
                break;
            case 0:
                System.out.println("5 ist gleich 5");
                break;
            case 1:
                System.out.println(x + " ist größer 5");
                break;
        }

    }
}


