public class Ex2 {
    private int numerator;
    private int denominator;

    public Ex2() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Ex2(int n, int d) {
        if (d == 0) {
            d = 1;
        }

        if (d < 0) {
            n = -n;
            d = -d;
        }

        this.numerator = n;
        this.denominator = d;

        simplify();
    }

    public Ex2(Ex2 other) {
        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }

    public void simplify() {
        int a = Math.abs(numerator);
        int b = Math.abs(denominator);

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        if (a != 0) {
            numerator = numerator / a;
            denominator = denominator / a;
        }
    }

    public Ex2 add(Ex2 other) {
        int n = this.numerator * other.denominator
              + other.numerator * this.denominator;

        int d = this.denominator * other.denominator;

        return new Ex2(n, d);
    }

    public Ex2 subtract(Ex2 other) {
        int n = this.numerator * other.denominator
              - other.numerator * this.denominator;

        int d = this.denominator * other.denominator;

        return new Ex2(n, d);
    }

    // Multiplication
    public Ex2 multiply(Ex2 other) {
        int n = this.numerator * other.numerator;
        int d = this.denominator * other.denominator;

        return new Ex2(n, d);
    }

    // Division
    public Ex2 divide(Ex2 other) {
        int n = this.numerator * other.denominator;
        int d = this.denominator * other.numerator;

        return new Ex2(n, d);
    }

    // Display
    public void display() {
        System.out.println(numerator + "/" + denominator);
    }

    public static void main(String[] args) {
        Ex2 f1 = new Ex2(1, 2);
        Ex2 f2 = new Ex2(1, 3);

        System.out.print("Fraction 1: ");
        f1.display();

        System.out.print("Fraction 2: ");
        f2.display();

        Ex2 sum = f1.add(f2);
        System.out.print("Add: ");
        sum.display();

        Ex2 difference = f1.subtract(f2);
        System.out.print("Subtract: ");
        difference.display();

        Ex2 product = f1.multiply(f2);
        System.out.print("Multiply: ");
        product.display();

        Ex2 quotient = f1.divide(f2);
        System.out.print("Divide: ");
        quotient.display();

        Ex2 copy = new Ex2(f1);

        System.out.print("Copy: ");
        copy.display();

        System.out.println("f1 == copy: " + (f1 == copy));
    }
}