package basicexamples.revision;

import basicexamples.revision.model.Kniha;
import basicexamples.revision.model.Knihy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
Vytvorte knižnicu (Library), kde bude môcť používateľ zadať knihy (nazov, autora, počet strán, rok vydania, cena) cez konzolu
kým nezadá slovo koniec. Opakovanie na ArrayList.

Aplikacia po spusteni zobrazi menu s možnosťami:
(1) Zadaj novú knihu *
(2) Zobraz všetky knihy *
(3) Zobraz konkrétnu knihu (podľa názvu knihy) *
(4) Zadaj index knihy, ktorú zobrazujeme
(5) Zobraz názov poslednej knihy
(6) Zobraz názov prvej knihy
(7) Zobraz počet všetkých kníh
(8) Vymaž konkrétnu knihu (podľa indexu)
(9) Zadaj index knihy, ktorú odstraňujeme
(10) Vymaž všetky knihy
Koniec = skončí zadávanie novej knihy

Aplikacia caka zadanie konkretnej moznosti a nasledne reaguje.

*/



public class Kniznica {

    // vytvorili sme metodu naplnTestovacimiUdajmi
    public static void naplnTestovacimiUdajmi() {
        Kniha kniha1 = new Kniha(); // vytvorenie prazdnej knihy, cize objektu = instancie
        kniha1.setNazov("Já, robot"); // naplnili sme knihu1 nazvom
        kniha1.setMenoAutora("Isaac Asimov"); // naplninili sme knihu1 autorom
        kniha1.setRokVydania(1965);

        Kniha kniha2 = new Kniha(); // vytvorenie prazdnej knihy, cize objektu = instancie
        kniha2.setNazov("Duna"); // naplnili sme knihu1 nazvom
        kniha2.setMenoAutora("Frank P. Herbert"); // naplninili sme knihu1 autorom
        kniha2.setRokVydania(1970);


        ArrayList<Kniha> kniznica = new ArrayList<Kniha>(); // vytvorili sme prazdne dynamicke pole = zoznam kniznice
        kniznica.add(kniha1);
        kniznica.add(kniha2);

        // pouzili sme for-each, aby sme ziskali kazdu knihu = polozkaKniznice z kniznice a vypisali jej obsah
        for(Kniha polozkaKniznice: kniznica) {
            System.out.println("Názov knihy: " + polozkaKniznice.getNazov());
            System.out.println("Autor knihy: " + polozkaKniznice.getMenoAutora());
            System.out.println("Rok vydania: " + polozkaKniznice.getRokVydania());
        }
    }

    public static void main(String[] args) {
        // naplnTestovacimiUdajmi(); // zavolame metodu naplnTestovacimiUdajmi, ktora naplni kniznicu testovacimi udajmi a vypise jej zoznam
        
        // Popis aplikácie z pohľadu používateľa
        // 1.krok: Zobraz menu s polozkou (1) Zadaj novú knihu (2) Zobraz všetky knihy (3) Zobraz konkrétnu knihu (podľa názvu knihy)
        // TODO: 2.krok: Ak sme zadali číslo (1) Zadaj novú knihu, tak požiadame užívateľa, aby zadal údaje a následne opäť zobrazíme menu s položkami

        Knihy testovacieKnihy = new Knihy();
        // my sme napĺnili ArrayList testovacími knihami cez metódu naplKniznicuKnihami z triedy Knihy
        ArrayList<Kniha>kniznica = testovacieKnihy.naplnKniznicuKnihami();

        // ArrayList<Kniha> kniznica = new ArrayList<Kniha>(); // tu vytvoríme kolekciu kníh, ktora je prazdna
        while (true) {
            System.out.println("Vyber si z menu");
            System.out.println("(1) Zadaj novú knihu");
            System.out.println("(2) Zobraz všetky knihy");
            System.out.println("(3) Zobraz konkrétnu knihu (podľa názvu)");
            System.out.println("(9) Koniec");

            Scanner scn = new Scanner(System.in); // inicializacia konzoly a vstupu (pisania)
            int cisloMenu = scn.nextInt(); // do premennej cisloMenu vlozime z konzoly cislo, ktore zadal pouzivatel

            if (cisloMenu == 1) {
                // ak je cisloMenu1 tak tu nieco urobime
                Scanner scn1 = new Scanner(System.in); // vytvarame pre istotu novy scanner, aby sme mohli ziskat udaje z "konzoly" = Run dialog

                System.out.println("Stlačil si číslo 1");
                // Aplikacia by mala vypisat, resp. sa opytat na zadanie: Zadaj nazov knihy, Zadaj nazov autora knihy a nasledne Zadaj rok vydania

                System.out.println("Zadaj názov knihy");
                String nazov = scn1.nextLine(); // nextLine je pre String, teda text

                System.out.println("Zadaj meno autora");
                String menoAutora = scn1.nextLine();

                System.out.println("Zadaj rok vydania");
                int rokVydania = scn1.nextInt();

                Kniha kniha = new Kniha(); // vytvorili sme prázdnu knihu, čiže objekt = inštanciu triedy kniha
                kniha.setNazov(nazov); // prázdnu knihu napĺňame názvom
                kniha.setMenoAutora(menoAutora); // a menom autora
                kniha.setRokVydania(rokVydania); // a rokom vydania

                kniznica.add(kniha); // a do kolekcie kníh vložíme naplnenú knihu

            } else if (cisloMenu == 2) {
                // ak je cisloMenu = 2 tak tiez tu nieco urobime
                System.out.println("Stlačil si číslo 2");
                for (Kniha vystup:kniznica) {
                    System.out.println("Názov knihy: " + vystup.getNazov());
                    System.out.println("Meno autora: " + vystup.getMenoAutora());
                    System.out.println("Rok vydania: " + vystup.getRokVydania());
                }


            } else if (cisloMenu == 3) {
                System.out.println("Stlačil si číslo 3");
                // ak je cisloMenu = 3 tak tiez tu nieco urobime
            } else if (cisloMenu == 9) {
                // ukončíme nekonečný cyklus while(true), ak používateľ zadá číslo 9
                break;
            }

        }


    }
}
