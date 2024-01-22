import java.util.Scanner;
public class intersectionOfNode 
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

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

Node a=new Node(1);
Node b=new Node(2);
Node c=new Node(3);
Node d=new Node(4);
Node e=new Node(5);
Node f=new Node(6);
Node g=new Node(7);
Node h=new Node(8);
Node i=new Node(9);
Node j=new Node(10);

a.next=b;
b.next=c;
c.next=d;
f.next=e;
e.next=d;
d.next=g;
g.next=h;
h.next=i;
i.next=j;
j.next=null;


head=a;
Node head1=f;
tail=j;

// intersection of node

Node slow=head1;
Node fast=head;

fast=fast.next;


while(fast!=slow)
{
    fast=fast.next;
    slow=slow.next;
}

System.out.println(fast.data);

}
}