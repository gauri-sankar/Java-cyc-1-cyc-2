import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int a[]=new int[100];
        
        System.out.println("Enter the elements of the array:");
       int n=scn.nextInt();
        
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        a[i]=scn.nextInt();
        
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(a[j+1]>a[j])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        
        System.out.println("The sorted array is:");
        for(int i=0;i<n;i++)
        System.out.println("\n"+a[i]);
        
        System.out.println("The second largest element is:"+a[1]);
        
        
    }
}
