package ISC2013;
import java.util.*;
import java.io.*;
public class Palin
{
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String x="";int s=0;
        String rev="";
        System.out.println("Enter a sentence");
        x=in.readLine();
        x=x.toUpperCase();
        String y="";int len;
        int l=x.length();
        if(!(x.charAt(l-1)=='.'||x.charAt(l-1)==','|| x.charAt(l-1)=='?' ||x.charAt(l-1)=='!'))
        { 
            System.out.println("INVALID INPUT");
        }

        StringTokenizer st=new StringTokenizer(x);

        while(st.hasMoreTokens())
        {
            rev="";
            y=st.nextToken();
            len=y.length();
            for(int i=0;i<len;i++)
            {
                char ch=y.charAt(i);
                rev=ch+rev;
            }	
            if(rev.compareTo(y)==0)
            {
                System.out.print(y+" ");
            }
        }

    }
}

