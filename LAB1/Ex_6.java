import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong pt: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Target: ");
        int x = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Target's index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Target's index: -1");
        }

        scanner.close();
    }
}