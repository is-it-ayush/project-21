import java.util.Scanner;
class point {
    int a[][],row,col,i_r,i_c;
    Scanner sc;

    void input()
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
    void display_mat()
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
}
