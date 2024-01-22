import java.util.Scanner;
public class EverySecEle 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int []a={1,2,4,9,5,3,8,7,10,12,14};
for(int i=0;i<a.length;i+=4)
{
    int t=a[i];
    a[i]=a[i+1];
    a[i+1]=t;
}
for(int j=0;j<a.length;j++)
{
    System.out.print( " "+a[j]);
}
}
}