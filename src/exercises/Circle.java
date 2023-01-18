package exercises;

// Vytvorte program na výpočet obvodu a obsahu kruhu.
// Ako vypočítať obsah (nazvite premennú pre obsah nasledovne: areaOfCircle)
// a obvod kruhu (nazvite circumferenceOfCircle) nájdete na
// https://www.calculat.org/sk/obsah-obvod/kruh.html

// Pomôcka
// Math.PI v triede java.lang.Math je statická konštanta reprezentujúce Ludolfovo číslo, hovorovo {π} (pí), v praxi
// môžeme použiť Math.PI pri násobení, napr takto:
// twoTimesPI = Math.PI * 2;
// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html#PI

// Math.pow je metóda na výpočet mocniny.
// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html#pow(double,double)

// Popis programu
// Program Circle bude od používateľa vyžadovať vstupnú hodnotu a to polomer kruhu, ktorý bude v centimetroch.
// Výsledkom bude obsah a obvod kruhu, ktorý vypíše používateľovi do “konzoly”. Program pôjde dovtedy, kým nezadáme číslicu: -1.

// Hint:
// Vzorec na výpočet obsahu kruhu je nasledujúci:
// S = π.r²
// Vzorec na výpočet obvodu kruhu je:
// o = 2.π.r

// Bonusová úloha: vytvorte metódy z daných vzorcoch.

import java.util.Scanner;

public class Circle {

    public static double getAreaOfCircle(double r) {
        double areaOfCircle = Math.PI * Math.pow(r, 2);
        return areaOfCircle;
    }

    public static double getCircumferenceOfCircle(double r) {
        double circumferenceOfCircle = 2 * Math.PI * r;
        return circumferenceOfCircle;
    }

    public static void printText(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        double r, circumferenceOfCircle, areaOfCircle; // polomer, obvod, obsah

        Scanner scn = new Scanner(System.in); // inicializacia skeneru, potrebneho pre vstup
        // START, repeat this
        while (true) {
            System.out.println("Zadaj polomer (r)");
            r = scn.nextDouble();
            if (r <= 0) { // Pri zadaní 0 alebo záporného čísla, sa program ukončí. Podmienky pri IF môžu vyzerať pri číslach následovne ==    !=    >      <     >=      <=
                printText("Koniec");
                break; // ak polomer bude -1 tak ukončí cyklus s podmienkou, čiže už sa program nebude opakovať
            }

            areaOfCircle = getAreaOfCircle(r); // výpočet obsahu kruhu
            circumferenceOfCircle = getCircumferenceOfCircle(r); // výpočet obvodu kruhu

            printText("Zadaný polomer: " + r);
            printText("Obsah kruhu je: " + areaOfCircle);
            printText("Obvod kruhu: " + circumferenceOfCircle);
        }
        // END, stop repeating

    }
}
