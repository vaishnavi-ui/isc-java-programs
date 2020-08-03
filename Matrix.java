package ISC2012;


import java.io.*;
public class Matrix
{
    int m,n;int a[][];int l,s;int r1,r2,c1,c2;
    int sda[];int b;
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the number of rows");
        m=Integer.parseInt(in.readLine());
        System.out.println("Enter the number of columns");
        n=Integer.parseInt(in.readLine());
        if(m>2&&n>2&&m<20&&n<20)
        {
            a=new int[m][n];
            input();
            largest();
            smallest();
            sort();
            display();
        }
        else
        {
            System.out.println("SIZE IS OUT OF RANGE");
        }
    }
    void input()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the "+(m*n)+" elements in the array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=Integer.parseInt(in.readLine());
            }
        }
        System.out.println("ORIGINAL MATRIX:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    void largest()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]>l)
                {
                    l=a[i][j];
                    r1=i;
                    c1=j;
                }
            }
        }
        System.out.println("LARGEST NO: "+l);
        System.out.println("ROW: "+r1);
        System.out.println("COLUMN :"+c1);
    }
    void smallest()
    {
        s=l;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]<s)
                {
                    s=a[i][j];
                    r2=i;
                    c2=j;
                }
            }
        }
        System.out.println("SMALLEST NO: "+s);
        System.out.println("ROW: "+r2);
        System.out.println("COLUMN :"+c2);
    }
    void sort()
    {
        sda=new int[m*n];int b=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                sda[b]=a[i][j];
                b++;
            }
        }
        for(int i=0;i<(m*n)-1;i++)
        {
            for(int j=0;j<((m*n)-1)-i;j++)
            {
                if(sda[j]>sda[j+1])
                {
                    int temp=sda[j];
                    sda[j]=sda[j+1];
                    sda[j+1]=temp;
                }
            }
        }
    }
    void display()
    {
        b=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sda[b];
                b++;
            }
        }
        System.out.println("THE SORTED ARRAY IS:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
                
            }
            System.out.println();
        }
    }
}
