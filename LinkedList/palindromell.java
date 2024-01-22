import java.util.Scanner;
public class palindromell 
{
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Scanner sc=new Scanner(System.in);
    public static Node head;
    public static Node tail;
    public static Node temp;

    static void display()
    {
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node reverse(Node head)
    {
        if(head.next==null) return head;
        Node newNode=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

Node a=new Node(1);
Node b=new Node(2);
Node c=new Node(3);
Node d=new Node(4);
Node e=new Node(5);
Node f=new Node(6);
// Node g=new Node(4);
// Node h=new Node(4);
// Node i=new Node(5);
// Node j=new Node(1);
// Node k=new Node(1);


a.next=b;
b.next=c;
c.next=d;
d.next=e;
e.next=f;
f.next=null;
// g.next=h;
// h.next=i;
// i.next=j;
// j.next=k;
// k.next=null;

head=a;
tail=f;


// checking for palindrome

display();
Node reversedHead = reverse(head);
head = reversedHead; 
display();
}





}

