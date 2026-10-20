import java.util.Scanner;
public class Ex_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Nhap 3 so: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = a;
        
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("So lon nhat la: " + max);
        scanner.close();
    }
}
