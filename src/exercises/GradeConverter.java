package exercises;
/*
Vytvorte program, ktorý na základe textového zadania známky, napr. výborný, chválitebný, dobrý, dostatočný, nedostatočný vypíše zodpovedajúcu známku.
        Hint: Porovnanie textov sa cez IF robí ináč ako porovnanie s číslom. Nemôžeme použiť.equals(
        Hint č. 2: Namiesto IF môžeme použiť SWITCH, CASE.
        Bonusová úloha: Program pôjde do “nekonečna”, kým nezadáme príkaz: koniec
        Bonusová úloha č. 2: Skúsme “ošetriť” používateľský vstup tak, aby reagoval na vstup text bez ohľadu na diakritiku.

Popis programu.
Ako bude program fungovať z pohľadu používateľa: Program ho vyzve otázkou: “Zadaj známku slovne (výborný, chválitebný, dobrý, dostatočný, nedostatočný). Program bude od používateľa čakať textovú odpoveď v “konzole”. Odpoveď bude alikvótna číselná známka, ktorú program vypíše.
Program bude ďalej pokračovať vypísaním otázky na zadanie slovnej známky, kým používateľ nepreruší program zadaním slova: koniec
Program po zadaní koniec ukončí svoju činnosť a nevypíše nič.


*/

import java.util.Scanner;
import java.text.Normalizer;

public class GradeConverter {

    public static String stripAccents(String s)
    {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }

    public static void main(String[] args) {

        String gradeAsText = "";
        Scanner scn = new Scanner(System.in); // initialization of console, inicializacia konzoly
        // Štart cyklu
        while (true) { // while(true) reprezentuje nekonecny cyklus, kym niekde nenapiseme prikaz break
            System.out.println("\nZadaj známku slovne, máš na výber: výborný, chválitebný, dobrý, dostatočný, nedostatočný");
            System.out.println("Ukončenie programu, zadaj slovo: koniec");

            gradeAsText = scn.nextLine(); // od pouzivatela program caka napisat text (textovu znamku) a tu ulozime do gradeAsText
            System.out.println("Vstupný text známky od používateľa bol následujúci: " + gradeAsText); // gradeAsText obsahuje pôvodný text bez zmien

            // my sa musime nejakym sposobom zbavit diakritiky v premennej gradeAsText
            // to znamena, ze premenna gradeAsText nebude obsahovat dlzne ani makcene a preto mozem zmenit IF na nieco taketo
            gradeAsText = stripAccents(gradeAsText); // tu uz skutocne zmenime obsah premennej gradeAsText tak, ze bude bez diakritiky
            gradeAsText = gradeAsText.toLowerCase(); // tu zmenime text na male pismena
            gradeAsText = gradeAsText.trim(); // Odstránime medzery na začiatku a na konci textu v premennej gradeAsText a vrátime späť do premennej gradeAsText
            System.out.println("Napísaný text bez diakritiky je: " + gradeAsText);

            // Vypíšeme číslo známky ak nie je zadaný text koniec
            if (!gradeAsText.equals("koniec")) System.out.println("Výsledná známka po konverzii z textového zadania je: ");

            if (gradeAsText.equals("vyborny"))
                System.out.println("1");
            else if (gradeAsText.equals("chvalitebny"))
                System.out.println("2");
            else if (gradeAsText.equals("dobry"))
                System.out.println("3");
            else if (gradeAsText.equals("dostatocny"))
                System.out.println("4");
            else if (gradeAsText.equals("nedostatocny"))
                System.out.println("5");
            else if (gradeAsText.equals("koniec"))
                break; // prerusenie cyklu
            else
                System.out.println("Nezadal si slovnú známku správne!");
        }
        // Koniec cyklu

    }
}
