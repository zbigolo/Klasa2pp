package Podstawy;

import java.util.ArrayList;

public class Sample04_InstrukcjeIteracyjne {

    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String i : cars) {
            System.out.println(i);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(cars[i]);
        }

        ArrayList<Integer> tab = new ArrayList<>();
        tab.add(2);
        tab.add(0);
        tab.add(2);
        tab.add(4);

        for(int liczba: tab){
            System.out.print(liczba+ " ");
        }

    
    //    for (;;) System.out.println("1");



        int suma = 0;
        int ilosc = 0;
        for (int i = 100; i > 0; i--) {
            suma += i;
            ilosc = ilosc + i;

        }



    }
}
