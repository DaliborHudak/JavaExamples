package exercises;
/*
* Vytvorte dynamicke pole (prostredníctvom ArrayList), ktorý od používateľa bude žiadať zadanie číselných hodnôt, ktoré budeme do dynamického poľa pridávať. Tento vstup bude “nekonečný”, kým nezadáme záporné číslo.
  Výstupom bude výpis všetkých čísel, ktoré sme v konzole (ArrayListe) zadali.
  Dodatočná úloha: Sčítanie všetkých hodnôt, ktoré používateľ v konzole zadal.
* */

import java.util.ArrayList;
import java.util.Scanner;

public class InputValuesIntoDynamicArray {
    public static void main(String[] args) {
        int hodnota = 0;

        ArrayList zadaneHodnoty = new ArrayList(); // vytváram dynamické pole, ktoré je na začiatku prázdne

        Scanner scn = new Scanner(System.in);

        System.out.println("Zadaj akékoľvek číslo. Pri zadaní záporného ( napr. -1 ) aplikácia skončí.");

        // Chceme, aby aplikácia od používateľa žiadala zadávanie "nekonečného" množstva hodnôt, kým nezadá záporné číslo
        while (hodnota >= 0) {
            hodnota = scn.nextInt(); // jedna hodnota zadaná používateľom
            zadaneHodnoty.add(hodnota); // a tú hodnotu vložíme do dynamického poľa
        }


        // Uloha c.1: V tomto mieste chceme vypisat vsetky zadane kladne cisla
        for (int i = 0; i < zadaneHodnoty.size()-1; i++) {
            System.out.println(zadaneHodnoty.get(i));
        }


        // Uloha c.2: Chceme scitat vsetky kladne cisla a vypisat vysledok
        int sum = 0;
        for (int i = 0; i < zadaneHodnoty.size()-1; i++) {
            sum = sum + (int)zadaneHodnoty.get(i);
        }
        System.out.println("Výsledok všetkých hodnôt je: " +sum);

    }
}
