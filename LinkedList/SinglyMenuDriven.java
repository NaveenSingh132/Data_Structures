import java.util.Scanner;

public class SinglyMenuDriven {
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

    static void insertionAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    static void insertionAtbeg(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    static int size() {
        temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    static void insertionAtRandom(int idx, int val) {
        Node newNode = new Node(val);
        temp = head;
    
        if (idx <= 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
    
        for (int i = 1; i < idx && temp != null; i++) {
            temp = temp.next;
        }
    
        if (temp == null) {
            tail.next = newNode;
            tail = newNode;
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    static int getElement(int idx)
    {
        temp=head;
        for(int i=1;i<=idx;i++)
        {
            temp=temp.next;
        } return temp.data;
    }
    

    static void deleteAtRandom(int idx) {
        int listSize = size();
    
        if (idx == 0) {
            if (listSize == 1) {
                head = tail = null; 
            } else {
                head = head.next;
            }
            return;
        }
    
        if (idx < 0 || idx >= listSize) {
            System.out.println("Invalid index for deletion.");
            return;
        }
    
        temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
    
        temp.next = temp.next.next;
    
        if (idx == listSize - 1) {
            tail = temp;
        }
    }

    static void deleteAtBeg()
    {
        head = head.next; 
    }
    
    static void deleteAtEnd()
    {   
        temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
    
        temp.next = null;
        tail = temp;
    }

    static void createList(int no) {
        head = null;
        tail = null;
        for (int i = 0; i < no; i++) {
            System.out.println("Enter data for node " + (i + 1) + ": ");
            int val = sc.nextInt();
            insertionAtEnd(val);
        }
    }

    static void display()
    {
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void search(int val) {
        temp = head;
        int position = 0;
    
        while (temp != null) {
            if (val == temp.data) {
                System.out.println(val + " is found at position " + position);
            }
            temp = temp.next;
            position++;
        } 
    }
    

    static void max()
    { int m=0;
        temp=head;
        while(temp!=null)
        {
            if (temp.data >= m) {
                m = temp.data;
            }
            temp = temp.next;
        }
        System.out.println("maximum value in the list is :"+m);
    }

    static void sort() {
        if (head == null || head.next == null) {
            return;
        }
    
        Node current = head;
        while (current != null) {
            Node minNode = current;
            Node nextNode = current.next;
            while (nextNode != null) {
                if (nextNode.data < minNode.data) {
                    minNode = nextNode;
                }
                nextNode = nextNode.next;
            }
            int tempData = current.data;
            current.data = minNode.data;
            minNode.data = tempData;
    
            current = current.next;
        }
    }
    

    static void reverseLinkedList() {
        Node current = head;
        Node previous = null;
        Node nextNode = null;
    
        while (current != null) {
            nextNode = current.next;  
            current.next = previous; 
    
            previous = current;
            current = nextNode;
        }
    
        head = previous;  
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
        System.out.println(" 1.Create List \n 2.Insertion at beggining \n 3.Insertion at End \n 4.Insertion at Random \n 5.Deletion at beggining \n 6.Deletion at Random \n 7.Deletion at End \n 8.Size of LinkedList \n 9.Get Element \n 10. Display \n 11. Maximum Value \n 12. Sort \n 13. Reverse the list \n 14.Search an element");
        System.out.println("Choose the option from the given options :");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("how many node do you want to create: ");
            int n1=sc.nextInt();
            createList(n1);
            break;

            case 2:
            System.out.println("Enter the data to insert at the beggining: ");
            int n2=sc.nextInt();
            insertionAtbeg(n2);
            break;

            case 3:
            System.out.println("Enter the data to insert at the End: ");
            int n3=sc.nextInt();
            insertionAtEnd(n3);
            break;

            case 4:
            System.out.println("Enter the index and data respectively : ");
            int n4=sc.nextInt();
            int n5=sc.nextInt();
            insertionAtRandom(n4, n5);
            break;

            case 5:
            deleteAtBeg();
            break;

            case 6:
            System.out.println("Enter the index at which you want to delete: ");
            int n6=sc.nextInt();
            deleteAtRandom(n6);
            break;

            case 7:
            deleteAtEnd();
            break;

            case 8:
            System.out.println("size of linkedList is :"+size());
            break;

            case 9:
            System.out.println("Enter the index whose value you want to see: ");
            int n7=sc.nextInt();
            getElement(n7);

            case 10:
            display();
            break;

            case 11:
            max();
            break;

            case 12:
            sort();
            break;

            case 13:
            reverseLinkedList();
            break;

            case 14:
            System.out.println("Enter the value you want to search: ");
            int n8=sc.nextInt();
            search(n8);
            break;

            default:
            System.out.println("Choose an appropriate option ");
                
        }
    }
        

    }
}

