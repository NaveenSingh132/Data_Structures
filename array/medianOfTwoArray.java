import java.util.Scanner;
public class medianOfTwoArray 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int []a={1,2};
int []b={3,4,5,6};
int a1=a.length;
int b1=b.length;
int c1=a1+b1;
int []c=new int [c1];
int i;
for(i=0;i<a1;i++)
{
    c[i]=a[i];
}
for(int j=0;j<b1;j++)
{
    c[i]=b[j];
    i++;
}
for(int k=0;k<c.length;k++)
{
    System.out.println(c[k]);
}

if((c.length%2)==0)
{
  float m=(c[(c.length/2)]+c[(c.length/2)-1])/2;
  float r=m+0.5f;
  System.out.println("median is "+r);
}

else
{
    float n=c[c.length/2];
    System.out.println("median is "+n);
}
}
}