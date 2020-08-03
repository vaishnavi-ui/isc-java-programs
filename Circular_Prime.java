package ISC2016;

import java.io.*;
public class Circular_Prime
{
    String x;int k=0;
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a number");
        String x=in.readLine();
        change(x);
        check(k);
    }
    void change(String x)
    {
        int l=x.length();
        String y=x;
        for(int i=0;i<l-1;i++)
        {
            y=y.substring(1,l)+y.charAt(0);
            System.out.println(y);
            prime(y);
        }
    }
    void prime(String a)
    {
        int p=Integer.parseInt(a);
        for(int i=2;i<p;i++)
        {
            if(p%i==0)
            {
                k++;
            }
        }
    }
    void check(int k)
    {
        if(k==0)
        
            System.out.println("IT IS A CIRCULAR PRIME NO");
        
        else
         System.out.println("IT IS NOT A CIRCULAR PRIME NO");
    }
}
