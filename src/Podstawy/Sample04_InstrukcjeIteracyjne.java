package Podstawy;

public class Sample04_InstrukcjeIteracyjne {

    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String i : cars) {
            System.out.println(i);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(cars[i]);
        }


        int suma = 0;
        int ilosc = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
            suma = suma + i;

        }
    }
}
