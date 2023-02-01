package exercises;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Vytvorte triedu s názvom ExcelBasicFormulas, v ktorej budú 2 základné funkcie SUM a AVERAGE, ktoré budú počítať súčet (getSum), resp. priemer hodnôt (getAverage).
        Vstup hodnôt bude cez premenné, napr. value1 a value2.
*/
public class ExcelBasicFormulas2 {

    public static double getSum(double []values) {
        // tu musi byt logika vypoctu
        double sum = 0;
        for (int i = 0; i < values.length; i++) { // cyklus s pevnym poctom opakovani, i nadobuda hodnoty od 0 do 3
            sum = sum + values[i]; // Java interpretuje tento riadok najprv tak, ze zoberie alebo vypocita to, co je napravo od =
        }
        return sum;
    }

    public static double getAverage(double sum, double count) {
        double average = sum / count;
        return average;
    }

    public static void main(String[] args) {
        double[] values = {1000, 20, 100, 999}; // naplname pole s nazvom values hodnotami

        // Chceme vypisat vysledky nasledujucich Excel funkcii v poradi: SUM, AVERAGE, COUNT, MAX, MIN
        double sum = getSum(values); // volame metodu getSum, ktora vracia sucet hodnot pola values

        int count = values.length;
        double average = getAverage(sum, count);


        // V premennej sum zostanem posledny sucet
        System.out.println("SUM " + sum);
        System.out.println("AVERAGE " + average);
        System.out.println("COUNT " + count);

        // Ako vypocitat MAX
        Arrays.sort(values); // pole values je zoradene

        System.out.println("MAX " + values[values.length-1]);
        System.out.println("MIN " + values[0]);

    }

    @Test
    public void testGetSum() {
        double[] values = {1, 2, 3}; // naplname pole s nazvom values hodnotami
        assertEquals(6, getSum(values));

        double[] values2 = {3, 8, 10, 100};
        assertEquals(121, getSum(values2));
    }
}
