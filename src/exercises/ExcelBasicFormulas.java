package exercises;

/*
 * Vytvorte triedu s názvom ExcelBasicFormulas, v ktorej budú 2 základné funkcie SUM a AVERAGE, ktoré budú počítať súčet (getSum), resp. priemer hodnôt
 * Vstup hodnôt bude cez premenné, napr. value1 a value2.
 * */

public class ExcelBasicFormulas {
    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40};
        //System.out.println(values[0]); // prvá hodnota v poli (array)

        // i++ je identické ako i=i+1

        int sum = 0;
        for (int i = 0; i < 4; i++) { // cyklus s pevným počtom opakovaní, i nadobúda hodnoty od 0 do 4
            sum = sum + values[i];
            System.out.println(values[i]);
        }
        System.out.println("Výsledok sčítania všetkých hodnôt je: " + sum);

    }
}
