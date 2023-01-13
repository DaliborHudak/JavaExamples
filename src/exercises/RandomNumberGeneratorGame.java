package exercises;

import java.util.Scanner;
// Generátor náhodných čísel od 1 do 10.
// Užívateľ háda číslo, ktoré vymyslí počítač.
// Vytvorte program, kde Java vygeneruje náhodné číslo od 1 do 10.
// Používateľ musí uhádnuť číslo. Ak uhádne menšie, tak mu Java vypíše.
// Neuhádol si, moje číslo je menšie. Neuhádol si, moje číslo je väčšie
// a pri úspešnom pokuse BINGO! Uhádol si!
public class RandomNumberGeneratorGame {
    public static void main(String[] args) {

        // Start Generator náhodných čísel od min po max
        int min = 1;
        int max = 10;
        int range = (max - min) + 1;
        int randomValue = (int) (Math.random()*range+min);
        // END Generator náhodných čísel od min po max
        

        System.out.println("Ahoj, ja som umelá inteligencia, myslím si číslo od 1 do 10. Skús ho uhádnuť!");
        System.out.println("Zadaj číslo");
        Scanner objectScanner = new Scanner(System.in); // Trieda Scanner slúži na inicializáciu užívateľského vstupu, System.in priamo na vstup z konzoly (okna Run)
        int inputUserNumber = objectScanner.nextInt(); // Priamy užívateľský vstup, vypisuje celé číslo


    }
}
