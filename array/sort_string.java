import java.util.Scanner;

public class sort_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[5];
        
        System.out.println("Enter 5 strings: ");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextLine();
        }

        for (int n = 0; n < 5; n++) {
            for (int m = 0; m < 4 - n; m++) {
                if (a[m].compareTo(a[m + 1]) > 0) {
                    String t = a[m];
                    a[m] = a[m + 1];
                    a[m + 1] = t;
                }
            }
        }

        System.out.println("Sorted strings:");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
