package Sample;

import java.util.Scanner;

/**
        @author Zbigniew Gołębiewski
        @deprecated  opis

        @exeption  nazwa wyjątku i opis


        @return opis wartości zwracanej
        @since data wprowadzenia i numer werssji

        @version numer wersji
 */



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
