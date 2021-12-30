/**
 * Check to see if each row of a double dimensional array are pseduo or not!
 * @author Ayush Gupta XII-F
 */

import java.util.Arrays;
import java.util.Scanner;
class OLD_POINT
{
    int A[][];
    int R,C;

    OLD_POINT(int p,int q)
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
/**
 * STEP 1: Set 'l' marking left position to 0, 'r' marking right position to the length of array 'a' minus 1, 'sum' to 0, and declare a new array 'grp'.
 * STEP 2: Check if The length of array 'a' is Even or Odd.
 * STEP 3: If its Even, intialize the array 'grp' with a new length equal to the half of the array 'a'.
 * STEP 4: For each element in 'grp' array, add the 'l' (Left Position) and 'r' (Right Position) from array 'a' and add sum of both elements to variable 'sum', while simultaneously incrementing 'l' and decrementing 'r'.
 * STEP 5: Goto STEP 10.
 * STEP 6: If its Odd, intialize the array 'grp' with a new length equal to the half (plus 1 if odd) of the array 'a'.
 * STEP 7: For each element in group array 'grp' array.
 * STEP 8: If 'l' (Left Position) and 'r' (Right Position) are not equal, if not add the elements from array 'a' at index 'l' and 'r' also add the sum of both variables to variable 'sum'.
 * STEP 9: If 'l' (Left Position) and 'r' (Right Position) are equal, Add the 'l' term twice.
 * STEP 10: Increment 'l' and Decrement 'r' simulatenously after checking STEP 8.
 * STEP 11: Check if all the elements in array 'grp' are same to ensure that sum of groups are infact equal, if not return 0.
 * STEP 12: Check if Sum Of All Elements from Array 'a' is equal to the number of elements in array 'grp' multiplied by the frist element in array 'grp', If true, return 1, else return 0.
 */
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

        //Pseduo Check If Sum Of All Groups (8+8+8=24) == (3*8=24) 
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
        OLD_POINT p = new OLD_POINT(4, 4);

        p.get_array();
        p.display_mat();
        p.result();
    }
}