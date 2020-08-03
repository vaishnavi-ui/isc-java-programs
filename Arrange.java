package ISC2012;

import java.io.*;
import java.util.*;
public class Arrange
{
    String s="";int l;
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a sentence");
        s=in.readLine();
        s=s.toUpperCase();
        l=s.length();
        
        if(!(s.charAt(l-1)=='.'|| s.charAt(l-1)=='?' ||s.charAt(l-1)=='!'))
        { 
            System.out.println("INVALID INPUT");
        }
        else
        {
            StringTokenizer st=new StringTokenizer(s,".?!");
            StringTokenizer ob=new StringTokenizer(st.nextToken());
            int c=ob.countTokens();
            System.out.println("LENGTH OF SENTENCE: "+c);
            String a[]=new String[c];int i=0;
            while(ob.hasMoreTokens())
            {
                a[i]=ob.nextToken();
                i++;
            }
            for( i=0;i<c-1;i++)
            {
                for(int j=0;j<(c-1)-i;j++)
                { if(a[j].compareTo(a[j+1])>0)
                    {
                        String temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
            for( i=0;i<c;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
