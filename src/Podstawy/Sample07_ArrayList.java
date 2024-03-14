package Podstawy;

import java.util.ArrayList;

public class Sample07_ArrayList {

    public static void main(String[] args) {

        // 1. deklaracja

        ArrayList<Integer> tablica = new ArrayList<>();
        ArrayList<Character> tablica1 = new ArrayList<>();
        ArrayList<String> napis = new ArrayList<>();

        /// ArrayList<int> tab = new ArrayList<>(); - bład

        // 2. Działania

        // A. dodawanie elementów

        tablica.add(10);
        tablica.add(0,100);
        tablica.add(5);
        tablica.add(-1);
        tablica.add(-100);
        tablica.add(4,999);

        // B. Wypisywanie

        System.out.println(tablica);
/*
        for (int i = 0; i < tablica.size(); i++)
            System.out.println(tablica.get(i));
*/
        //C. Zmiana wartości elementu
            tablica.set(0, 7777);
            tablica.set(1, -9999);


        System.out.println("Po zmianach: \n" + tablica);

        // D. Usuwanie ementu
        tablica.removeFirst();
        tablica.remove(3);
        tablica.removeLast();

        System.out.println("Po zmianach 2: \n" + tablica);

        //E. kopiowanie tablic

        int[] tabA = {1,2,3,4,5,6,7,8,9};
        int[] tabB = new int[9];

        for (int i = 0; i < tabA.length; i++) {
            tabB[i] = tabA[i];
        }

        ArrayList<Integer> tab = new ArrayList<>();

        tab.addAll(tablica);

        System.out.println("Tablica tab: \n" + tab );

        //F. Szukanie elementu

        tab.add(4);
        tab.add(2, 4);
        System.out.println("Tablica tab: \n" + tab );

        if (tab.contains(4)) System.out.println("Tak");
         else System.out.println("NIE");


    }
}
