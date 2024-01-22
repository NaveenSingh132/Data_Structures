import java.util.Scanner;
public class detectCycle 
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
f.next=c;

head=a;
tail=f;

// finding out the node where cycle begains

Node slow=head;
Node fast=head;
Node temp=head;

while(fast!=null)
{
    slow=slow.next;
    fast=fast.next.next;
    if(slow==fast)
    break;
}


if (fast == null || fast.next == null) {
    System.out.println("No cycle detected.");
    return;
}

while(slow!=temp)
{
slow=slow.next;
temp=temp.next;
}

System.out.println(slow.data);

}
}