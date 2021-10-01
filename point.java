/** 
 * @author Ayush Gupta 
 * Saddle Point Program - Question 8 
 * XII - F 
 */ 

import java.util.*;

public class Point {
    static int a[][],row,col,i_r,i_c;
    static Scanner sc;

    static void input()
    {
        sc = new Scanner(System.in);
        System.out.println("Enter The Row Size Of DDA: ");
        row = sc.nextInt();
        System.out.println("Enter the Column Size of DDA:");
        col = sc.nextInt();
        a = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println("Enter Element At Position: " + "(" + i + "," + j + ")");
                a[i][j] = sc.nextInt();
            }
        }
    }
    static void display_mat()
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }

    static void check_saddle()
    {
        int n = row;
        for (int i = 0; i < n; i++)
        {
            int min_row = a[i][0],i_r =i, i_c = 0;
            for (int j = 1; j < n; j++)
            {
                if (min_row > a[i][j])
                {
                    min_row = a[i][j];
                    i_r = i;
                    i_c = j;
                }
            }

            int k;
            for (k = 0; k < n; k++)
                if (min_row < a[k][i_c])
                    break;

            if (k == n)
            {
                System.out.println("Saddle Point: " + min_row + " at (" + i_r + "," + i_c + ")");
            }
        }
        

    }
    
    public static void main(String[] args) {
        input();
        display_mat();
        check_saddle();            
    }
}
