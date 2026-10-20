public class Ex6 {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    public double max(double a, double b) {
        return (a >= b) ? a : b;
    }

    public static void main(String[] args) {
        Ex6 calc = new Ex6();

        System.out.println("=== METHOD OVERLOADING DEMONSTRATION ===\n");

        int res1 = calc.add(10, 20);
        System.out.println("Call 1: calc.add(10, 20) = " + res1);
        System.out.println("  Method selected: add(int a, int b)");
        System.out.println("  Explanation: The compiler matches two integer argument literals (10, 20) directly to the int parameters.\n");

        double res2 = calc.add(10.5, 20.25);
        System.out.println("Call 2: calc.add(10.5, 20.25) = " + res2);
        System.out.println("  Method selected: add(double a, double b)");
        System.out.println("  Explanation: Floating-point literals default to double in Java, matching the two-parameter double signature.\n");

        int res3 = calc.add(10, 20, 30);
        System.out.println("Call 3: calc.add(10, 20, 30) = " + res3);
        System.out.println("  Method selected: add(int a, int b, int c)");
        System.out.println("  Explanation: Three integer arguments match the signature accepting three integer parameters.\n");

        int res4 = calc.max(45, 82);
        System.out.println("Call 4: calc.max(45, 82) = " + res4);
        System.out.println("  Method selected: max(int a, int b)");
        System.out.println("  Explanation: Integer argument types trigger exact match resolution with int parameters.\n");

        double res5 = calc.max(14.8, 9.3);
        System.out.println("Call 5: calc.max(14.8, 9.3) = " + res5);
        System.out.println("  Method selected: max(double a, double b)");
        System.out.println("  Explanation: Double argument types resolve to the overloaded max version taking double parameters.\n");
    }
}
