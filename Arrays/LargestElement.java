import java.util.Scanner;

public class LargestElement {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number you want=");
        int n = sc.nextInt();
        int max = 0;
        int secondMax = 0;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] > max) {
                max = a[j];
            }
        }

        System.out.println("Array is");
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + ",");
        }
        System.out.println();

        System.out.println("Max Element is=" + max);
    }
}


