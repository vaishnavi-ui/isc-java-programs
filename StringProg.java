package ISC2010;

import java.io.*;
import java.util.*;
public class StringProg
{
    String s="";int sent;String a[];int f[];
    int k=0;String y="";int c=0;
    StringTokenizer st;
    int m=0;
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the sentences(1-4)");
        s=in.readLine();
        s=s.toUpperCase();
        st=new StringTokenizer(s,".?");
        sent=st.countTokens();

        if(sent>=1&&sent<4)
        {
            count();
            extract();
            display();
        }
        else
        {
            System.out.println("INVALID INPUT");
        }

    }

    void count()
    {
        while(st.hasMoreTokens())
        {
            y=st.nextToken();
            StringTokenizer ob=new StringTokenizer(y);
            c=ob.countTokens();
            k=k+c;
        }
        a=new String[k];
        f=new int[k];
        for(int i=0;i<k;i++)
        {
            a[i]="";
            f[i]=0;
        }
    }

    void extract()
    {
        int i=0;
        while(st.hasMoreTokens())
        {
            int freq=0;
            y=st.nextToken();
            StringTokenizer ob=new StringTokenizer(y);
            while(ob.hasMoreTokens())
            {
                System.out.println(ob.nextToken());
                for(int j=0;j<k;j++)
                {
                    if(a[j].compareTo(ob.nextToken())==0)
                    {
                        //freq++;

                        f[i]=freq++;
                    }
                    else
                    {
                        a[i]=ob.nextToken();
                        m++;
                        f[i]=freq++;
                    }
                }
                i++;
            }
        }
    }

    void display()
    {
        System.out.println("WORD \t"+"FREQUENCY");
        for(int i=0;i<m;i++)
        {
            System.out.println(a[i]+"\t"+f[i]);
        }
    }
}

