package Dokumentowanie;

import java.io.IOException;

/**
 * Przykładowa klasa zawierająca funkcje pomocnicze
 *
 * @author Zbigniew Gołębiewski
 * @version 1.0
 * @since 10.06.2024
 */
public class Obliczenia {

    /**
     * number is the number door
     */
    private double number;

    /**
     * Jest to metoda sprawdzająca czy podana liczba rzeczywista jes całkowita
     *
     * @param number is the floating point number
     * @return true if the number is integer or false otherwise
     * @throws IOException On input error.
     * @see IOException
     */
    public boolean isIntNumber(float number) throws IOException {

        boolean tmp = false;

        if (Math.ceil(number) == Math.floor(number)) tmp = true;

        return tmp;
    }

    /**
     * Jest to metoda sprawdzająca czy podana liczba rzeczywista jes całkowita
     *
     * @param number is the floating point number
     * @return true if the number is integer or false otherwise
     * @throws IOException On input error.
     * @see IOException
     */
    private boolean isIntNumber(double number) throws IOException {

        boolean tmp = false;

        if (Math.ceil(number) == Math.floor(number)) tmp = true;

        return tmp;
    }

    /**
     * Jest to metoda wypisująca liczbę rzeczywistą na ekranie
     *
     * @param liczba is the floating point number
     *
     */
    void printNumber(double liczba) {

        System.out.println(liczba);
    }

    /**
     * Nic nie robi
     * @deprecated  java 23
     * @return  zwraca tekst "Nic nie robisz"
     */
    public String NicNieRobi(){
        return "Nic nie robisz";
    }

    /**
     * Constructor class Obliczenia
     *
     * @param myNumber is the floating point number
     */
    Obliczenia(double myNumber) {
        this.number = myNumber;
    }
}
