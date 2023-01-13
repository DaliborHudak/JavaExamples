package exercises;

import java.util.Scanner;

/*
Vytvorte prostrednictvom vstupu z konzoly rozhodovací test, ktorý vypíše známku A, B alebo C podľa týchto kritérií:
    Ak je percento nad 90, tak vypíše známku A
    Ak je percento nad 75, tak vypíše známku B
    Ak je percento nad 65, tak vypíše známku C
    Použite metódu pre rozhodovanie.
*/

public class GradeTest {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj percento testu:");
        int grade = scn.nextInt(); // input value for grade is int

        if (grade > 90) {
            System.out.println("Dostal si známku A");
        } else if (grade > 75) {
            System.out.println("Dostal si známku B");
        } else if (grade > 65) {
            System.out.println("Dostal si známku C");
        } else {
            System.out.println("Dostal si známku F Nespravil si test.");
        }
    }
}
