public class JavaTypeCasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        // String str = myInt; // Is not possible
        // System.out.println(str);

        double myDouble2 = 9.48d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9

        double x  = 5;
        double x2 = 5;

        System.out.println(x);
        System.out.println(x2);
    }
}
