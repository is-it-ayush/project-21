/**
 * Check to see if each row of a double dimensional array are pseduo or not!
 * @author Ayush Gupta XII-F
 */

import java.util.Arrays;
import java.util.Scanner;
class point
{
    int A[][];
    int R,C;

    point(int p,int q)
    {
        R=p;
        C=q;
        A = new int[R][C];
    }

    void get_array()
    {
        Scanner s = new Scanner(System.in);
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                System.out.println("Enter the element at Row: " + i + "\t Cloumn: " + j);
                A[i][j] = s.nextInt();
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
        int l=0,r=a.length-1,sum=0, grp[];
        if(a.length%2!=0)
        {
            /**
             * Odd
             * Addition Of Middle Element Twice
             * Number Of Groups = (Odd+1)/2
             */
            grp = new int[(a.length+1)/2];
            for(int i=0;i<grp.length;i++)
            {
                if(l!=r)
                {
                    grp[i] = a[l] + a[r];
                    sum+=grp[i];
                }
                else
                {
                    grp[i] = 2 * a[l];
                    sum+=grp[i];
                }
                l++;
                r--;
            }
        }
        else
        {
            /** Even
             *  Number Of Groups = (Even)/2
            */
            grp = new int[(a.length)/2];
            for(int i=0;i<grp.length;i++)
            {
                grp[i] = a[l] + a[r];
                sum+=grp[i];
                l++;
                r--;
            }
        }

        //Checking If Sum Of All Groups is Same
        int same_test = grp[0];
        for(int i=0;i<grp.length;i++)
        {
            if(grp[i]!=same_test)
                return 0;
        }

        //Pseduo Check  If  Sum Of All Groups (8+8+8=24) == (3*8=24) 
        if(sum==(grp.length)*grp[0])
        {
            return 1;
        }
     
        return 0;
    }

    void result()
    {
        for(int i=0;i<A.length;i++)
        {
            if(check_pseudo(A[i])==1)
            {
                System.out.println(Arrays.toString(A[i]) + "\t" + "Row " + (i+1) + " -> pseduo numbers");
            }
            else
            {
                System.out.println(Arrays.toString(A[i]) + "\t" + "Row " + (i+1) + " -> not pseduo numbers");
            }
        }
    }

    public static void main(String[] args) {
        point p = new point(4, 4);

        p.get_array();
        p.display_mat();
        p.result();
    }
}