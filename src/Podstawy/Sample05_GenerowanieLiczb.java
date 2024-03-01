package Podstawy;

import java.util.Random;

public class Sample05_GenerowanieLiczb {

    public static void main(String[] args) {

        Random generator = new Random();

        int granicadolna = 33;
        int granicagorna = 126;
        for (int i = 1; i < 20; i++) {
            int liczba = generator.nextInt(granicagorna - granicadolna + 1) + granicadolna;
            int liczba2 = generator.nextInt(granicagorna - granicadolna + 1) + granicadolna;

            System.out.println((char)liczba + "  " + (char)liczba2 );
        }



        for (int i = 0; i < 20; i++) {
            int bok1 = generator.nextInt(1000);
            int bok2 = generator.nextInt(1000);
            int bok3 = generator.nextInt(1000);

            System.out.println(bok1 + "  " + bok2 + "  " + bok3);
        }
    }
}
