import java.util.Scanner;
public class Ex_1 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Nhap n: ");
      int n = scanner.nextInt();

      for(int i = 1; i <= n; ++i) {
         if (i % 2 == 0) {
            System.out.println(i + "- chẵn");
         } else {
            System.out.println(i + "- lẻ");
         }
      }

      scanner.close();
   }
}
