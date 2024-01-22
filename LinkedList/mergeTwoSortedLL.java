import java.util.Scanner;

public class mergeTwoSortedLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Scanner sc = new Scanner(System.in);
    public static Node head;
    public static Node tail;
    public static Node temp;

    static void display() {
        Node t = temp;
        while (t != null) {
            System.out.print(t.next.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(8);
        Node e = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        // second node
        Node f = new Node(2);
        Node g = new Node(4);
        Node h = new Node(6);
        Node i = new Node(7);

        f.next = g;
        g.next = h;
        h.next = i;
        i.next = null;

        Node h1 = a;
        Node h2 = f;
        Node t1 = h1;
        Node t2 = h2;
        Node t = new Node(100);

        // merging two sorted linked list
        temp = t;
        while (t1 != null && t2 != null) {
            if (t1.data < t2.data) {
                t.next = t1;
                t = t1;
                t1 = t1.next;
            } else {
                t.next = t2;
                t = t2;
                t2 = t2.next;
            }
        }

        if (t1 == null) {
            t.next = t2;
        } else {
            t.next = t1;
        }

        display();
    }
}
