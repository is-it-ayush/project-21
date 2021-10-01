import java.lang.ModuleLayer.Controller;
import java.util.*;

public class Arrange {
    static int arr[],size;
    
    Arrange(int n)
    {
        size = n;
        arr = new int[size];
    }
    static void input()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter A Number: ");
            arr[i] = sc.nextInt();
        }
    }
    static void arrange()
    {
    
        //sorting orginal array via bubble sort
        int n = arr.length;
            for (int l = 0; l < n-1; l++)
                for (int j = 0; j < n-l-1; j++)
                    if (arr[j] > arr[j+1])
                    {
                        // swap arr[j+1] and arr[j]
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
        //copying array
        int a[] = new int[size];
        for(int l=0;l<a.length;l++)
        {
            a[l] = arr[l];
        }

        //Logic
        // began with 5 then -1 it....then +2 it.....then -3 it....till 0 and +9
        // 5+(-1)=4+(2)=6-3 then 
        int sign=-1,control_loop=1,opertaion=(arr.length-1)/2,i=0; 
        while(opertaion!=-1)
        {
            arr[opertaion] = a[i];
            opertaion = opertaion+(sign*control_loop);
            control_loop++;
            sign*=-1;
            i++;
        }
    }

    static void display()
    {
        System.out.println("Before Arranging: " + Arrays.toString(arr));
        arrange();
        System.out.println("After Arranging: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Arrange a = new Arrange(11);
        a.input();
        a.display();    
    }
}
