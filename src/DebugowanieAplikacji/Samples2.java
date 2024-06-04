package DebugowanieAplikacji;

import java.util.Scanner;

public class Samples2 {
/*
    *******************************************************
    nazwa funkcji: CyfraJednosci
    parametry wejściowe: liczba - liczba dla której wyznaczam cyfrę jedności
    wartość zwracana:  cyfra jedności danej liczby
    informacje:
    autor:  PESEL
   *******************************************************

 */
    int CyfraJednosci(int liczba){

            int digit = liczba %10;

        return digit;
    }


    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Podaj dowolna liczbe calkowita: ");
        int liczba = scanner.nextInt();

        System.out.println("Wypisanie cyfr danej liczby:");
        while (liczba > 0){
            int digit = liczba % 10;

            if (digit % 2 == 1) System.out.println(digit);

            liczba /= 10;         //  liczba = liczba / 10;
        }
    }
}
