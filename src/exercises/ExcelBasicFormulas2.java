package exercises;

/*
Vytvorte triedu s názvom ExcelBasicFormulas, v ktorej budú 2 základné funkcie SUM a AVERAGE, ktoré budú počítať súčet (getSum), resp. priemer hodnôt (getAverage).
        Vstup hodnôt bude cez premenné, napr. value1 a value2.
*/
public class ExcelBasicFormulas2 {
    public static void main(String[] args) {
        int[] values = {10, 20, 100};
        int sum = 0;

        System.out.println("Počet prvkov v poli values je: " + values.length);

        for (int i = 0; i < values.length; i++) { // cyklus s pevnym poctom opakovani, i nadobuda hodnoty od 0 do 3
            //System.out.println(values[i]);
            sum = sum + values[i]; // Java interpretuje tento riadok najprv tak, že zoberie alebo vypočíta to, čo je napravo od =

        }

        // V premennej sum dostanem posledný súčet, čiže 100
        System.out.println("SUM: " + sum);

        double average = sum / values.length;
        System.out.println("AVERAGE: " + average);

    }
}