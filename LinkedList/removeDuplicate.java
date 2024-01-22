import java.util.Scanner;
public class removeDuplicate 
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
Node b=new Node(1);
Node c=new Node(2);
Node d=new Node(3);
Node e=new Node(3);
Node f=new Node(3);
Node g=new Node(4);
Node h=new Node(4);
Node i=new Node(5);
Node j=new Node(1);
Node k=new Node(1);


a.next=b;
b.next=c;
c.next=d;
d.next=e;
e.next=f;
f.next=g;
g.next=h;
h.next=i;
i.next=j;
j.next=k;
k.next=null;

head=a;
tail=j;

// removing duplicate form ll
temp=head;

while(temp.next!=null)
{
if(temp.next.data==temp.data)
{
    temp.next=temp.next.next;
}
else{
    temp=temp.next;
}
}



display();

}
}
