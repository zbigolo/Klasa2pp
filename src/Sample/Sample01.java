package Sample;

import java.util.Scanner;

/*
        Wypisz w kolumnie wszystkie cyfry podanej z klawiatury liczby całkowitej
 */


@SuppressWarnings("CheckStyle")
public class Sample01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dowolna liczbe calkowita: ");
        int number = scanner.nextInt();
        int digit;

        while (number > 0) {
            digit = number % 10;
            number /= 10;

            System.out.println(digit);
        }
    }
}
