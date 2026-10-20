import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Nhap m: ");
        int m = scanner.nextInt();

        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }

        int[] result = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            // TODO: so sanh arr1[i] va arr2[j]
            if (arr1[i] < arr2[j])
            {
                result[k] = arr1[i];
                i++;
            }
            else
            {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        // TODO: them phan con lai cua arr1
        while(i < n)
        {
            result[k] = arr1[i];
            i++;
            k++;
        }

        // TODO: them phan con lai cua arr2
        while(j < m)
        {
            result[k] = arr2[j];
            j++;
            k++;
        }

        // TODO: in result
        for( int h = 0; h < result.length; h++)
        {
            System.out.print(result[h] + " ");
        }
        scanner.close();
    }
}