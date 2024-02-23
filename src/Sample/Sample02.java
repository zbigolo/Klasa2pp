package Sample;

import java.util.Scanner;

/*
    Dla podanej liczby całkowitej oblicz sumę cyfr
 */
public class Sample02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dowolna liczbe calkowita: ");
        int number = scanner.nextInt();

        int digit;
        int suma = 0;

        while(number > 0){

            digit = number % 10;
            suma += digit;
            number /= 10;
        }

        System.out.println("Suma cyfr wynosi "+suma);
    }
}
