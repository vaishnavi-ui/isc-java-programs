package ISC2015;

import java.io.*;
public class Number
{
    int n,m;int c=0;int s=0;int u=0;int k=0;int t,a;
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        do
        {   System.out.println("Enter a no from 100 to 10,000");
            m=Integer.parseInt(in.readLine());
            System.out.println("Enter a no less than 100");
            n=Integer.parseInt(in.readLine());
            if(n<=100&&m>=100&&m<=10000)
            {
                find();
                
            }
            else
            {
                System.out.println("Invalid input");
            }
            System.out.println("Do you wish to continue? 1=YES,0=NO");
            c=Integer.parseInt(in.readLine());
        }while(c==1);
    }

    void find()
    {
        for(int i=m;i<=10000;i++)
        {
            t=i;
            while(t!=0)
            {
                a=t%10;
                k++;
                s=s+a;
                t=t/10;
            }
            if(s==n)
            {
                u=i;
                break;
            }
            else
            {
                a=0;
                k=0;
                s=0;
            }
        }
        display(u,k);
    }
    void display(int u,int k)
    {
        System.out.println("The nearest no is:"+u);
        System.out.println("The total no of digits is:"+k);
    }
}