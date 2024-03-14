package Podstawy;

public class Sample06_Array {

    public static void main(String[] args) {

        // 1. Deklaracja tablic

        int[] losoweliczby;
        losoweliczby = new int[100];

        int genericnumber[];
        genericnumber = new int[100];

        String[] cards = new String[4];

        String[] koloryKart = {"kier", "karo", "pik", "trefl"};


        // 2. Działania

        // Wypisywanie
       // A.
        for (int i = 0; i < koloryKart.length; i++) {
            System.out.println( koloryKart[i]);
        }

        //B.
        for (String kolory: koloryKart)
            System.out.println(kolory);

        //C.
        for (int i = koloryKart.length -1; i >= 0  ; i--) {
            System.out.println( koloryKart[i]);
        }

        // Dodawanie elementów do tablicy
        losoweliczby[0] = 1;
        losoweliczby[1] = 2;
        losoweliczby[10] = 100;

        System.out.println();

        for (int i = 0; i < 11 ; i++) {
            System.out.print( losoweliczby[i]+ "   ");
        }
        System.out.println();
        for (String kolory: cards) System.out.print(kolory + "-");
    }
}
