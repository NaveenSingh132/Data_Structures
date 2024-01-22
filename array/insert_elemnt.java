import java.util.Scanner;

public class insert_elemnt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 5, 7, 9, 6, 3};
        int p = 3;
        int el = 99;

        // Create a new array with one extra element to accommodate the insertion
        int[] b = new int[a.length + 1];

        for (int i = 0; i < b.length; i++) {
            if (i < p) {
                b[i] = a[i];
            } else if (i == p) {
                b[i] = el;
            } else {
                b[i] = a[i - 1];
            }
        }

        System.out.println("Array after inserting " + el + " at position " + p + ":");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
