package exercises;

// Loop example
// vypíš číslo od 1 po 10 pomocou cyklu for
public class LoopExample {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {  // i = 1 preto lebo v programovani ma stale prve value hodnotu 0
            System.out.println(i);
        }

        System.out.println();

        for (int i = 1; i < 10; i +=2) {  // vypise len neparne cisla a zaroven i+=2 je to iste ako i=i+2
            System.out.println(i);
        }

        System.out.println();

        for (int i = 1; i < 10; i *=2) {  // vypise nasobky 2-och
            System.out.println(i);
        }
    }
}
