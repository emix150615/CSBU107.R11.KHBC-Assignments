import java.util.Scanner;
public class Ex_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int n = scanner.nextInt();
        int temp = Math.abs(n);
        int tong = 0;
        while (temp > 0)
        {
            tong += temp % 10;
            temp = temp / 10;
        }
        System.out.println("Tong cac chu so: " + tong );
        scanner.close();
    }
}
