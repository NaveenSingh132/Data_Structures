import java.util.Scanner;
public class remov_elemntfromar 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int[]a={20,15,34,54,12};
int del=34;
for(int i=0;i<4;i++)
{
    if(del==a[i])
    {
        for(int j=i;j<4;j++)
        {
            a[j]=a[j+1];
        }
        break;
    }
}
for(int i=0;i<4;i++)
{
    System.out.println(a[i]);
}
}
}