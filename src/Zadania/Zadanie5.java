package Zadania;

import java.util.Scanner;

/*
    Napisz program, która jako argument przyjmie trzy liczby całkowite. Progam powinien wypisać tylko słowo true
     jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny lub false w przeciwnym
     wypadku.
 */
public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj trzy liczby całkowite: ");

        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        if (side1 > 0 && side2 > 0 && side3 > 0){
            if((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1)){
                if (((side1*side1 + side2*side2) == (side3*side3) || ((side1*side1 + side3* side3 ) == (side2*side2)) || ((side3*side3 + side2*side2 ) == (side1*side1))))
                    System.out.println("True");
                else System.out.println("False");
            }
            else System.out.println("False");
        }
        else System.out.println("False");
    }
}
