import java.io.*;
import java.util.*;

public class matrix_play {
    int a[][];
    int M,N;
    Scanner s;
    
    matrix_play(int x,int y) throws IOException
    {
        if(x>2 && y<20)
        {
            M=x;
            N=y;
        }
        else
        {
            throw new IOException("The entered value must be greater than 2 and less than 20");
        }
        a = new int[M][N];
        s = new Scanner(System.in);
    }
    
    void input()
    {
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.println("Enter the element at Row: " + i + "\t Cloumn: " + j);
                a[i][j] = s.nextInt();
            }   
        }
    }

    void display()
    {
        System.out.println("Original Matrix: ");
        print_array();
        System.out.println("Maximum Number: " + get_max(0,0).get(0) + " at\t" + "Row: " + get_max(0,0).get(1) + "\tColumn: " + get_max(0,0).get(2));
        System.out.println("Minimum Number: " + get_min(0,0).get(0) + " at\t" + "Row: " + get_min(0,0).get(1) + "\tColumn: " + get_min(0,0).get(2));
        sort_array();
        print_array();
    }

    //Helper Method
    void print_array()
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }   
            System.out.println();
        }
    }

    //Helper Method
    //Returns Maximum From Running a Loop from a certrain element to end.
    List get_max(int row, int column)
    {
        List<Integer> l = new ArrayList<Integer>();
        int mx=a[row][column],mxi=0,mxj=0;
        for(int i=row;i<a.length;i++)
        {
            for(int j=column;j<a[0].length;j++)
            {
                if(mx<a[i][j])
                {
                    mxi = i;
                    mxj = j;
                    mx = a[i][j];
                }
            }
            column=0;
        }
        l.add(mx); l.add(mxi); l.add(mxj);
        return l;
    }


    //Helper Method
    //Returns Minimum From Running a Loop from a certrain element to end.
    List get_min(int row,int column)
    {
        List<Integer> l = new ArrayList<Integer>();
        int mn=a[row][column], mni=0,mnj=0;
        for(int i=row;i<a.length;i++)
        {
            for(int j=column;j<a[0].length;j++)
            {
                if(mn>a[i][j])
                {
                    mni = i;
                    mnj = j;
                    mn=a[i][j];
                }
            }
            column=0;
        }
        l.add(mn); l.add(mni); l.add(mnj);
        return l;
    }

    void sort_array()
    {
        for(int i=0; i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                List<Integer> l = get_min(i, j);
                if(a[i][j]>l.get(0))
                {
                    int t = a[i][j];
                    a[i][j] = l.get(0);
                    a[l.get(1)][l.get(2)] = t;
                }
            }
        }
    } 

    public static void main(String[] args) throws Exception {
        matrix_play mp = new matrix_play(3, 4);
        mp.input();
        mp.display();
    }
}

