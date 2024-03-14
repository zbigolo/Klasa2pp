package Sample;

import java.util.Random;
import java.util.Scanner;

public class Zgadula {
    public static void main(String[] args) {

        Random gen = new Random();
        Scanner scanner = new Scanner(System.in);

        int losowanaLiczba = gen.nextInt(100 - 1  + 1) +1;

        int ileProb = 0;
        int cos =0;

        System.out.println("Podaj liczbę z przedziału <1,100>. 1 próba");
        int mojaLiczba = scanner.nextInt();
        ileProb++;

        while ((mojaLiczba != losowanaLiczba) && (ileProb < 6)){

            if (mojaLiczba > losowanaLiczba)
                System.out.println(ileProb + " Podaj mniejszą liczbę:");
            else
                System.out.println(ileProb + " Podaj większą liczbę:");

            mojaLiczba = scanner.nextInt();
            ileProb++;
        }

        if(mojaLiczba == losowanaLiczba)
            System.out.println("WYGRANA");
        else
            System.out.println("PRZEGRANA!! \n Wylosowano " + losowanaLiczba);
    }
}
