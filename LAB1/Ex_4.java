import java.util.Scanner;
public class Ex_4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();
    
        String temp = "";
        for (int i = input.length() - 1; i >= 0; i--){
            temp = temp + input.charAt(i);
        }
        System.out.println("Chuoi dao nguoc " + temp);
        scanner.close();
    }
}
