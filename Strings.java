package ISC2015;

import java.io.*;

public class Strings
{
    String s;int l;
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String n="";
        do
        {  System.out.println("Enter a sentence ending with . or ?");
            s=in.readLine();
            s=" "+s;
            l=s.length();
        }while((s.charAt(l-1)=='.')||(s.charAt(l-1)=='?'));
        for(int i=0;i<l;i++)
        {   char ch=s.charAt(i);
            if(ch==' ')
            {
               
            }
            else
            {
                n=n+ch;
            }
        }
    }
}
