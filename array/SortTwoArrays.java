import java.util.Scanner;

public class SortTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = { 1, 5, 6, 7, 8, 10 };
        int[] b = { 2, 4, 9 };
        int[] c = new int[9];
        int i;

        for (i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int j = 0; j < b.length; j++) {
            c[i] = b[j];
            i++;
        }

        // Bubble Sort (Ascending Order)
        for (int n = 0; n < c.length; n++) {
            for (int m = 0; m < c.length - 1 - n; m++) {
                if (c[m] > c[m + 1]) {
                    int t = c[m];
                    c[m] = c[m + 1];
                    c[m + 1] = t;
                }
            }
        }

        for (int h = 0; h < c.length; h++) {
            System.out.println(c[h]);
        }

        // Merge Arrays back
        for (i = 0; i < a.length; i++) {
            a[i] = c[i];
        }

        for (int j = 0, k = i; k < c.length; j++, k++) {
            b[j] = c[k];
        }

        System.out.println("First array is: ");
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Second array is: ");
        for (i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
