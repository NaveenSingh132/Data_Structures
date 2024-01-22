import java.util.Scanner;
public class deleteNthNodeFromLast 
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

a.next=b;
b.next=c;
c.next=d;
d.next=e;
e.next=f;

head=a;
tail=f;

// deleting nth node from last , nth from last = size-n-1;

Node slow=head;
Node fast=head;
int n=3;

for(int i=0;i<=n;i++)
{
    fast=fast.next;
}

while(fast!=null)
{
    fast=fast.next;
    slow=slow.next;
}

slow.next=slow.next.next;

  display();

}
}
