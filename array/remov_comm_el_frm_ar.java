import java.util.Scanner;
public class  remov_comm_el_frm_ar 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int a[]={8,5,6,7,4,2};
int b[]={6,4,8,25,41,1};
for(int i=0;i<a.length;i++){
    for(int j=0;j<b.length;j++){
        if(a[i]==b[j])
        {
            for(int k=i;k<a.length-1;k++){
                a[k]=a[k+1];
            }
            for(int l=0;l<b.length-1;l++){
                b[l]=b[l+1];                
            } 
        }
    }
}
System.out.println("first array is :");
for(int i=0;i<a.length;i++)
{
    System.out.println(a[i]);
}

System.out.println("second array is :");

for(int i=0;i<b.length;i++)
{
    System.out.println(b[i]);
}
}
}