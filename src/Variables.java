public class Variables {
    public static void main(String[] args) {
        // Definovanie premennych robime na zaciatku!
        float myFloatNum = 5.99f;
        char myLetter = '0';
        boolean myBool = true;
        final double conversionRate = 30.126; // konstanty definujeme klucovym slovom final a je nemenna
        // conversionRate = 20.526; // tato cast skonci s chybou! kedze sa jedna o konstantu (final)
        int myNum;
        myNum = 15;
        String name = "John";

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName; // spoji obsah 2 premennych a to firstName a lastName a vysledok vrati do premennej fullName


        System.out.println("Konverzný kurz Eur/Sk je " + conversionRate + " ku dňu 21.12.2022.");
        System.out.println("Moje meno je " + name);
        System.out.println("Vypisujem celé číslo " + myNum);
        System.out.println("Vypisujem desatinné číslo " + myFloatNum);
        System.out.println("Vypisujem písmeno, ktoré je toto: " + myLetter);
        System.out.println("A toto je hodnota typu boolean premennej myBool " + myBool);
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        int result = x + y;
        System.out.println("Výsledok súčtu je: " + result); // scita hodnoty premennych x a y, cize vysledok bude 11

        int a = 5, b = 6, c = 50;
        System.out.println("Výsledok sčítania 3 premenných " + "(a=" + a + " " + "b=" + b + " " + "c=" + c + ") " + "je " + (a + b + c));

        String meno = "Dalibor";
        String priezvisko = "Hudák";
        System.out.println("Meno zamestnanca je: " + meno + " " + priezvisko);

    }
}
