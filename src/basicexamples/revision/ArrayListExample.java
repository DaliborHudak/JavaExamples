package basicexamples.revision;

import java.sql.Array;
import java.util.ArrayList;

// ArrayListExample bude slúžiť na pridávanie ľubovoľného počtu kníh a ich výpis
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> poleKnih = new ArrayList<String>(); // vytvorili sme dynamické pole s názvom poleKnih

        String kniha1 = "Hobbit";
        String kniha2 = "Portrét Doriana Greya";
        String kniha3 = "Motýľ";
        String kniha4 = "Učebnica jazyka Java, Pavol Herout";

        poleKnih.add(kniha1);
        poleKnih.add(kniha2);
        poleKnih.add(kniha3);
        poleKnih.add(kniha4);
        poleKnih.add("Ja, robot. Isaac Asiimov");

        poleKnih.set(4, "Ja, človek. Dalibor Hudák"); // zmením 5-knihu (čiže index = 4) na inú

        poleKnih.remove(2); // odstránenie poleKnih s indexom 2
        poleKnih.remove(0); // odstránenie poleKnih s indexom 0

        // vypiseme prvu knihu v poradi, cize s indexom 0
        System.out.println("Prvá kniha v zozname");
        System.out.println(poleKnih.get(0));

        // vypiseme poslednu knihu v dynamickom poli
        System.out.println("Posledná kniha v zozname");
        System.out.println(poleKnih.get(poleKnih.size()-1));

        // alebo druhy sposob
        int indexPoslednejKnihy = poleKnih.size()-1;
        System.out.println(poleKnih.get(indexPoslednejKnihy));

        System.out.println("\nVšetky vypísané poleKnih");

        // prechádzame všetkými prvkami dynamického poľa poleKnih
        for (int i = 0; i < poleKnih.size(); i++) {
            System.out.println(poleKnih.get(i) + ".");
        }

        System.out.println("\nVšetky vypísané poleKnih, spôsob č.2");
        // prechádzame všetkými prvkami dynamického poľa poleKnih, spôsob č.2
        for(String vystup:poleKnih) {
            System.out.println(vystup);
        }

        ArrayList<Integer> poleCisielNoh = new ArrayList<Integer>();

        Integer cisloNohy1 = 40;
        Integer cisloNohy2 = 41;
        Integer cisloNohy3 = 42;

        poleCisielNoh.add(cisloNohy1);
        poleCisielNoh.add(cisloNohy2);
        poleCisielNoh.add(cisloNohy3);

        // vypíšeme všetky čísla nôh
        for (int i = 0; i < poleCisielNoh.size(); i++) {
            System.out.println("Zadané číslo nohy: " + poleCisielNoh.get(i));
        }

    }
}
