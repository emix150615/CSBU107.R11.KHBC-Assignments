public class Ex1 {
    private double width;
    private double height;

    public Ex1() {
        this.height = 1.0;
        this.width = 1.0;
    }

    public Ex1(double w, double h) {
        this.width = (w > 0) ? w : 1;
        this.height = (h > 0) ? h : 1;
    }

    public double area() {
        return width * height;
    }
    public double perimeter() {
        return (width + height)*2;
    }
    public void displayinfo(int count) {
        System.out.println("Rec" + (count + 1));
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
    public static void main(String[] args)
    {
        Ex1 rec1 = new Ex1();
        Ex1 rec2 = new Ex1(2.0, 3.0);
        Ex1 rec3 = new Ex1(-5.0, -2.0);
            int count = 0;
            if (count == 0)
            {
                rec1.displayinfo(count);
                System.out.println("");
                count ++;
            }
            if (count == 1)
            {
                rec2.displayinfo(count);
                System.out.println("");
                count ++;
            }
            if (count == 2)
            {
                rec3.displayinfo(count);
                System.out.println("");
                count ++;
            }
    }
}
