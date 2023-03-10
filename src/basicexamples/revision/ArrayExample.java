package basicexamples.revision;


import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int [] values = {8, 7, 3, 999};

        // odkazujeme sa na poziciu (index) pola, zapisujeme nazovPola[index], pricom index zacina vzdy 0 a konci poctom prvkov - 1
        // System.out.println(values[3]);

        // chceme vypisat vsetky hodnoty pola values EFEKTIVNE!!!
        // System.out.println(values);

        for (int i = 0; i <= 3; i++) {
            System.out.println(values[i]); // vypiseme obsah pola prostrednictvom kombinacie nazovPola[i]
        }

        System.out.println("-----------------------------------");

        int[] array = new int[10]; // vytvorime prazdne pole, ktore bude obsahovat 10 prvkov

        // naplnime kazdy prvok pola nahodnou hodnotou od 1 do 100
        array[0] = ((int) (Math.random() * 100 + 1));
        array[1] = ((int) (Math.random() * 100 + 1));
        array[2] = ((int) (Math.random() * 100 + 1));
        array[3] = ((int) (Math.random() * 100 + 1));
        array[4] = ((int) (Math.random() * 100 + 1));
        array[5] = ((int) (Math.random() * 100 + 1));
        array[6] = ((int) (Math.random() * 100 + 1));
        array[7] = ((int) (Math.random() * 100 + 1));
        array[8] = ((int) (Math.random() * 100 + 1));
        array[9] = ((int) (Math.random() * 100 + 1));

        // tu vypiseme kazdy prvok pola
        System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3]
                + " " + array[4] + " " + array[5] + " " + array[6] + " " + array[7] + " "
                + array[8] + " " + array[9]);


        Arrays.sort(array); // zoradi pole od najmensieho po najvacsie

        // System.out.println(array); // zobrazit takymto sposobom nepojde

        System.out.println("Zoradené údaje (od najmenšieho po najväčšie)");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nNajväčšie číslo je: " + array[array.length-1]);
        System.out.println("Najmenšie číslo je: " + array[0]);

        System.out.println();


        String cars[] = {"Honda", "Audi", "Škoda", "Sannyong", "Nissan", "Mazda", "Tesla"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }


        System.out.println();


        System.out.println("Ďalší spôsob vypisovania hodnôt z poľa:");
        // na vypisovanie prvkov z poľa sa využíva spôsob tzv. foreach
        for (String car:cars) { // čiže napĺňame premennú car každým prvkom poľa v tomto cykle
            System.out.println(car);
        }






        int value2[] = {1, 2, 3};
        // value2.add(4); // toto nepôjde

        // Dynamické pole ArrayList, resp. List

    }
}
