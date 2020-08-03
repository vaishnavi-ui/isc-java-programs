package ISC2010;


import java.io.*;
public class Kaprekar
{
    int l,u;int d;int lh,rh;int s;
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);	
        System.out.println("Enter the lower limit");
        l=Integer.parseInt(in.readLine());
        System.out.println("Enter the upper limit");
        u=Integer.parseInt(in.readLine());
        for(int i=l;i<=u;i++)
        {
            int t=i;
            d=0;s=0;
            while(t!=0)
            {
                d++;
                t=t/10;
            }
            lh=(i*i)%(int)Math.pow(10,d);
            rh=(i*i)/(int)Math.pow(10,d);
            s=lh+rh;
            if(s==i)
            {
                System.out.print(i+",");
            }
        }
    }
}
