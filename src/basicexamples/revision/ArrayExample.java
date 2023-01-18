package basicexamples.revision;

public class ArrayExample {
    public static void main(String[] args) {
        System.out.println(); // empty line
        int[] values = {8, 7, 3, 999};

        // odkazujeme sa na pozíciu (index) pola zapisuje nazovPola[index], pricom index začína vždy 0 a končí počtom prvkov -1
        System.out.println(values[3]);
        System.out.println();

        // chceme vypísať všetky hodnoty poľa values EFEKTÍVNE!
        for (int i = 0; i < 4; i++) {
            System.out.println(values[i]); // vypíšeme obsah poľa prostredníctvom kombinácie nazovPola[i]
        }


    }
}
