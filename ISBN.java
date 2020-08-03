package ISC2013;

import java.io.*;

public class ISBN
{
    long n;long t;int k;long s=0;int con=0;String x="";int l;
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        do
        {   System.out.println("Enter a 10 digit ISBN number");
            x=in.readLine();
            l=x.length();
            char ch=x.charAt(l-1);
            if(ch=='X')
            {
                ch='0';
                x=x.substring(0,x.length()-2)+ch;
            }

            n=Long.parseLong(x);
            t=n;
            
            if(l==10)
            {
                sum();
            }
            else
            {
                System.out.println("INVALID INPUT");
            }
            System.out.println("Do you wish to continue?1=YES,0=NO");
            con=Integer.parseInt(in.readLine());
        }while(con==1);
    }

    void sum()
    {
        s=0;
        long u;int j=1;
        u=n;
        while(u!=0&&j<=10)
        {
            long a=u%10;
            s=s+(a*j);
            j++;
            u=u/10;
        }
        System.out.println("SUM="+s);
        if(s%11==0)
        {
            System.out.println("DOESNT LEAVES REMAINDER-VALID ISBN NUMBER");
        }
        else
        {
            System.out.println("LEAVES REMAINDER-INVALID ISBN NUMBER");
        }
    }
}
