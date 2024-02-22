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

        int tmp = number;

        int digit;
        int suma = 0;

        while(tmp > 0){

            digit = tmp % 10;
            suma += digit;
            tmp /= 10;
        }

        System.out.println("Suma cyfr wynosi "+suma);
    }
}
