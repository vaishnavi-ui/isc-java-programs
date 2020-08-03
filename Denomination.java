package ISC2010;

import java.io.*;
public class Denomination
{
    int n;int bal;
    int th,hd,fhd,fty,ten,one;
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a number of max 5 digits");
        n=Integer.parseInt(in.readLine());
        int t=n;int k=0;
        while(t!=0)
        {
            k++;
            t=t/10;
        }
        if(k<=5)
        {
            words();
            System.out.println("DENOMINATION: ");
            if(k==5||k==4&&n>=1000)
                th();
            else if(k==3&&n>=500)
                fhd();
            else if(k==3&&n>=100)
                hd();
            else if(k==2)
                ten();
            else if(k==1)
                one();
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }

    void words()
    {
        int u=n;
        String y="";
        while(u!=0)
        {
            int a=u%10;
            if(a==0)

                y="ZERO"+" "+y;

            else if(a==1)

                y="ONE"+" "+y;
            else if(a==2)

                y="TWO"+" "+y;
            else if(a==3)

                y="THREE"+" "+y; 
            else if(a==4)

                y="FOUR"+" "+y;   
            else if(a==5)

                y="FIVE"+" "+y;
            else if(a==6)

                y="SIX"+" "+y;
            else if(a==7)

                y="SEVEN"+" "+y;
            else if(a==8)

                y="EIGHT"+" "+y; 
            else if(a==9)

                y="NINE"+" "+y; 
            u=u/10;   
        }
        System.out.println(y);
    }

    void th()
    {
        th=n/1000;
        bal=n%1000;
        System.out.println("1000\t"+"x"+th+"\t x\t"+(th*1000));
        if(bal>=500)
        {
            fhd();
        }
        else if(bal>=100&&bal<500)
        {
            hd();
        }
        else if(bal>=50&&bal<100)
        {
            fty();
        }
        else if(bal>=10&&bal<50)
        {
            ten();
        }
        else
        {
            one();
        }
    }

    void fhd()
    {
        fhd=bal/500;
        bal=bal%500;
        System.out.println("500\t"+"x"+fhd+"\t x\t"+(fhd*500));
        if(bal>=100&&bal<500)
        {
            hd();
        }
        else if(bal>=50&&bal<100)
        {
            fty();
        }
        else if(bal>=10&&bal<50)
        {
            ten();
        }
        else
        {
            one();
        }
    }

    void hd()
    {
        hd=bal/100;
        bal=bal%100;
        System.out.println("100\t"+"x"+hd+"\t =\t"+(hd*100));
        if(bal>=50&&bal<100)
        {
            fty();
        }
        else if(bal>=10&&bal<50)
        {
            ten();
        }
        else
        {
            one();
        }
    }

    void fty()
    {
        fty=bal/50;
        bal=bal%50;
        System.out.println("50\t"+"x"+fty+"\t =\t"+(fty*50));
        if(bal>=10&&bal<50)
        {
            ten();
        }
        else
        {
            one();
        }
    }

    void ten()
    {
        ten=bal/10;
        bal=bal%10;
        System.out.println("10 x "+ten+" ="+(ten*10));
        if(bal<10&&bal!=0)
        {
            one();
        }
    }

    void one()
    {
        one=bal/1;
        bal=bal%1;
        System.out.println("1\t"+"x"+one+"\t =\t"+(one*1));
    }
}
