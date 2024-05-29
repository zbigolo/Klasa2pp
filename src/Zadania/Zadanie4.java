package Zadania;
/*
Zadanie 4 (POTSAM - Samolot)
Bajtockie Linie Lotnicze wzbogaciły swoją flotę o nowy model samolotu. W samolocie tym jest n1 rzędów miejsc siedzących
w klasie biznesowej oraz n2 rzędów w klasie ekonomicznej. W klasie biznesowej każdy rząd ma k1 miejsc siedzących,
a w klasie ekonomicznej — k2 miejsc.

Wejście
W pierwszym i jedynym wierszu wejścia znajdują się cztery liczby naturalne n1, k1, n2, i k2 (1<=n1,k1,n2,k2<=1000),
pooddzielane pojedynczymi odstępami.

Wyjście
Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą - liczbę miejsc siedzących w analizowanym samolocie.
 */


import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n1 = scanner.nextInt(); // Number of rows in business class
        int k1 = scanner.nextInt(); // Number of seats in each row of business class
        int n2 = scanner.nextInt(); // Number of rows in economy class
        int k2 = scanner.nextInt(); // Number of seats in each row of economy class

        if (n1 >= 1 && n1 <= 1000)
            if (k1 >= 1 && k1 <= 1000)
                if (n2 >= 1 && n2 <= 1000)
                    if (k2 >= 1 && k2 <= 1000) {
                        int totalSeats = (n1 * k1) + (n2 * k2);
                        System.out.println(totalSeats);
                    }
                    else System.out.println("Error - Number of seats in each rows of economy class");
                else System.out.println("Error - Number of rows in economy class");
            else System.out.println("Error - Number of seats in each row of economy class");
        else System.out.println("Error - Number of rows in business class");
    }
}
