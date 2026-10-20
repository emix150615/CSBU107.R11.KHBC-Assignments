import java.util.Scanner;

public class QUILL_SPRAY {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n(hits): ");
        int n = scanner.nextInt();
        System.out.println("Nhap t(timestamps): ");
        double [] timestamps = new double[n];
        for (int i = 0; i < n; i++)
        {
             timestamps[i] = scanner.nextDouble();
        }
        System.out.print("Nhap x(BaseDmg): ");
        int x = scanner.nextInt();
        System.out.print("Nhap y(FollowDmg): ");
        int y = scanner.nextInt();
        System.out.print("Nhap z(duration): ");
        double z = scanner.nextDouble();

        double d = 0;

        for(int i = 0; i < n; i++)
        {
            int counts = 0;
            for(int j = 0; j < i; j++)
            {
                if (timestamps[i] - timestamps[j] <= z)
                {
                    counts++;
                }
            }
            d += x + counts*y;
        }
        scanner.close();
        System.out.println((int)d);
    }
}
