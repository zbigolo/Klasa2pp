package Podstawy;


import java.util.Scanner;

public class Sample2_Wypisywanie_I_Wczytywanie {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
/*
        System.out.print("Podaj liczbe calkowita: ");
        int liiczba = skaner.nextInt();

        System.out.println("Podaj liczbe rzeczywista");
        double rzeczywista = skaner.nextDouble();

        System.out.println("Podana liczba całkowita to: " + liiczba);


        System.out.println("Podaj wyraz: ");
        String wyraz = skaner.next();

        System.out.println("Twoj wyraz to: " + wyraz);
*/

        System.out.println("Podaj zdanie ");
        String zdanie = skaner.nextLine();
        System.out.println("Twoj wyraz to: " + zdanie);
    }


}
