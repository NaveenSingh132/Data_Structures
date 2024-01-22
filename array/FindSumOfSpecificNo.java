import java.util.Scanner;
public class FindSumOfSpecificNo 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int []a={1,2,3,4,5,6,7,8,9};
int n=14;
for(int j=0;j<a.length;j++)
{
    for(int i=0;i<a.length;i++)
    {
        if(n==a[j]+a[i])
        {
            System.out.println(a[i]+"+"+a[j]+"="+n);
        }
    }
}
}
}