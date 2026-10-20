public class Ex4 {

    private double CenterX;
    private double CenterY;
    private double radius;
    private static final double PI = 3.14159;
    
    public Ex4 ()
    {
        CenterX = 0;
        CenterY = 0;
        radius = 1;
    }

    public Ex4 (double x, double y, double r)
    {
        this.CenterX = x;
        this.CenterY = y;
        this.radius = r;
    }
    public double area()
    {
        return PI*radius*radius;
    }
    public double perimeter()
    {
        return (radius*2*PI);
    }
    public boolean contains(double x, double y)
    {
        boolean contain = false;
        double Distance = (x - CenterX) * (x - CenterX) + (y - CenterY) * (y - CenterY);
        if(Distance <= radius*radius)
        {
            contain = true;
        }
        return contain;
    }
    public void display ()
    {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
    public static void main(String[] args)
    {
        Ex4 c1 = new Ex4(2, 5, 9);

        c1.display();
        System.out.println("Contains: " + c1.contains(2, 5));

        Ex4 c2 = new Ex4(1, 6, 8);

        c2.display();
        System.out.println("Contains: " + c2.contains(1, 6));
    }
}
