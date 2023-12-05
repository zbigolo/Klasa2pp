package Podstawy;

import java.util.Scanner;

public class Sample2_Wypisywanie_I_Wczytywanie {
    public static void main(String[] args) {
    /*
        System.out.println("Witam");
        int liczba = 10;
        System.out.println(liczba);

        System.out.println("Moja liczba "+liczba);

        System.out.print("BLA bla bla " + liczba + "to koniec ");
        System.out.print("\n Czy to nowa linia");
*/

        /*
                Wczytywanie
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj dowolną liczbe całkowitą:  ");
        //int liczba = scan.nextInt();

     //   System.out.println("Podano  " + liczba);

        System.out.print("Podaj wyraz: ");
        String napis1 = scan.nextLine();

        System.out.println("\n" + napis1);

    }
}
