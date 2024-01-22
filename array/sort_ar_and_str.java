import java.util.Scanner;
public class  sort_ar_and_str 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int []ar=new int [5];
int []a=new int [5];
System.out.println("enter the numbers: ");
for(int i=0;i<5;i++)
{
 a[i]=sc.nextInt();
}

for(int n=0;n<5;n++)
{
    for(int m=0;m<4;m++)
    {
        if(a[m]>a[m+1])
       { int t=a[m];
        a[m]=a[m+1];
        a[m+1]=t;}
    }
}
for(int i=0;i<5;i++)
{
System.out.println(a[i]);
}
}
}