package ISC2014;

import java.io.*;

public class Array
{
    int m;int a[][];int k=0;int ld,rd=0;
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the size of the array betwn 2 to 10");
        m=Integer.parseInt(in.readLine());
        if(m>=2&&m<=10)
        {
            a=new int[m][m];
            input();
            symmetric();
            leftDiagonal();
            rightDiagonal();
        }
        else
        {
            System.out.println("THE MATRIX SIZE IS OUT OF RANGE");
        }
    }

    void input()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the "+(m*m)+" array elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=Integer.parseInt(in.readLine());
            }
        }
        System.out.println("THE ORIGINAL MATRIX IS:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    void symmetric()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==a[j][i])
                {
                    k++;
                }
            }
        }
        if(k==(m*m))
        {
            System.out.println("IT IS A SYMMETRIC MATRIX");
        }
        else
        {
            System.out.println("IT ISNT A SYMMETRIC MATRIX");
        }
    }

    void leftDiagonal()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j)
                {
                    ld=ld+a[i][j];
                }
            }
        }
        System.out.println("The sum of left diagonal is:"+ld);
    }

    void rightDiagonal()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((i+j)==m-1)
                {
                    rd=rd+a[i][j];
                }
            }
        }
        System.out.println("The sum of right diagonal is:"+rd);
    }
}