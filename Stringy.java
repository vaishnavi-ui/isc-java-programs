package ISC2014;

import java.io.*;
import java.util.*;
public class Stringy
{
    String s="";int l=0;String del="";int p=0;
    StringTokenizer st;int k=0;
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a sentence terminated by '.' , '?' or'!'");
        s=in.readLine();
        s=s.trim();
        s=s.toUpperCase();
        l=s.length();
        if(s.charAt(l-1)=='.'||s.charAt(l-1)=='?'||s.charAt(l-1)=='!')
        {
            word();
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
    void word()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the word to be deleted");
        del=in.readLine();
        System.out.println("Enter the position of the word to be deleted");
        p=Integer.parseInt(in.readLine());
        s=s+" ";
        st=new StringTokenizer(s,".!?");
        
    }
}
