import java.io.*;
import java.lang.System.Logger;
import java.net.ProxySelector;
class point
{
    int A[][];
    int R,C;

    point(int p,int q)
    {
        R=p;
        C=q;
    }

    void get_array() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                System.out.println("Enter the element at Row: " + i + "\t Cloumn: " + j);
                A[i][j] = Integer.parseInt(br.readLine());
            }
        }
    }

    void display_mat()
    {
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

    int check_pseudo(int a[])
    {
        int i=0,l = a.length-1;

            if(a.length%2==0)
            {
                int sum = 0, c=0, gsum ;
                while(i!=l)   // loop from left and loop from right.....  i forwards and l backwards...
                {
                    //even elements 
                    // 3 5 2 4               or            3 6 4 2 5

                    sum+=a[i] + a[l];
                    c++;
                    i++;
                    l--;
                }

            }
            else
            {}
        
        return 0;
    }
}