package ISC2016;

import java.io.*;
public class Circular_no
{
    static int n,c=0;
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a number");
        n=Integer.parseInt(in.readLine());
        int t;int k=0;int r,r1;
        t=n; int flag=0;
        System.out.println(n);
        while(t!=0)
        {
            k++;
            t=t/10;
        }
        for(int i=1;i<=k-1;i++)
        {

            r1=n%(10^k);
            r=(n-(10^k))+r1;
            System.out.println(r);
            if(c==0)
            {
                System.out.println("IT IS CIRCULAR PRIME");
            }
        }
    }

    static void prime(int x)
    {
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                c++;
				
            }
        }
    }
}
