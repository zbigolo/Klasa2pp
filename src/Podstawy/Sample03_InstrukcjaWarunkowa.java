package Podstawy;

public class Sample03_InstrukcjaWarunkowa {

    public static void main(String[] args) {
        int liczba = 101;

        if ((liczba % 2) == 0) {
            System.out.println("Liczba parzysta");
        } else {
            System.out.println("Liczba nieparzysta");
        }

        String imie1 = "Ala";
        String imie2 = "Bala";

        if (imie1.equals(imie2)) {
            System.out.println("Równe imiona");
        } else {
            System.out.println("Rozne imona");
        }

        boolean wart = false;

        if (wart)
            System.out.println("PRAWDA");
        else
            System.out.println("FAŁSZ");

        switch (liczba) {
            case 0: {
                System.out.println("TAK");
                break;
            }
            case 1: {
                System.out.println("NIE");
                break;
            }
        }

        switch (liczba) {
            case 0 -> System.out.println("TAK");
            case 1 -> {
                System.out.println("NIE");
            }
            default -> System.out.println("BRAK");
        }
    }
}
