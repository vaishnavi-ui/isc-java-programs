package ISC2016;

import java.io.*;
public class DDA
{
    int n;int a[][];
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        do
        { System.out.println("Enter the size of the array(n*n)");
            n=Integer.parseInt(in.readLine());
        }while(n<4||n>10);
        a=new int[n][n];
        System.out.println("Enter the "+n*n+" elements of array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=Integer.parseInt(in.readLine());
            }
        }
    }

    void original()
    {
        System.out.println("The original array is-");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    void sort()
    {
        for(int i=1;i<n-1;i++)
        {
            for(int j=1;j<n-1;j++)
            {
                
            }
        }
    }
}
