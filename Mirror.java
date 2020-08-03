package ISC2013;
import java.io.*;
public class Mirror
{
    int n;int a[][];
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        do
        { System.out.println("Enter the size of dda");
          n=Integer.parseInt(in.readLine());
        }while(n<0||n>10);
        a=new int[n][n];
        System.out.println("Enter the "+n*n+" elements in the array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=Integer.parseInt(in.readLine());
            }
        }
        System.out.println("THE ORIGINAL IS-");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("THE MIRROR IMAGE IS-");
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
