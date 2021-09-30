/**
 * @author Ayush Gupta
 * ISBN Program - Question 5
 * XII - F
 */
import java.util.*;
public class isbn {
    
    static int sum=0;
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter a Valid ISBN: ");
        String x = sc.next();
        int j=10;
        if(check_valid_isbn(x))
        {
            for(int i=0;i<x.length();i++)
            {
                if(x.charAt(i)!='X' && x.charAt(i)!='x')
                {
                    String d = x.charAt(i)+"";
                    sum+=j*Integer.parseInt(d);
                    j--;
                }
                else
                {
                    sum+=1*10;
                }
            }
            System.out.println("Sum = " + sum);
            finalverify();
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }

    static void finalverify()
    {
        if(sum%11==0)
        {
            System.out.println("Leaves No Remainder - valid ISBN");
        }
        else
        {
            System.out.println("Leaves Remainder - invalid ISBN");
        }
    }

    static boolean check_valid_isbn(String x)
    {
        String verf = "xX0123456789";
        //012345678X or 0123456789
        boolean isValid = false;
        int c=0;
        for(int i = 0;i<x.length();i++)
        {
            if(verf.indexOf(x.charAt(i))!=-1)
            {
                c++;
            }
        }

        if(c==10)
            isValid = true;
        if(x.length()!=10)
            isValid = false;

        return isValid;
    }

}
