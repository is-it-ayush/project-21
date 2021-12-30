import java.util.Scanner;

/** 
 * @author Ayush Gupta 
 * Smith Number Program - Question 9 
 * XII - F 
 */

class Smith {
    
    int n;

    Smith(int num) {
        n = num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:\t");
        int x = sc.nextInt();
        Smith s = new Smith(x);
        s.display();
    }

    static int sum(int p)
    {
        int sum=0;
        while(p!=0)
        {
            sum+=p%10;
            p/=10;
        }
        return sum;
    }

    void display()
    {
        int n_sum = sum(n);
        int p_fac_sum = 0;

        //Even Factors
        while(n%2==0)
        {
            n/=2;
            p_fac_sum +=2;
        }

        //Odd Factors
        for(int i=3; i<=Math.sqrt(n);i+=2)
        {
            while(n%i==0)
            {
                n/=i;
                if(i>9)
                    p_fac_sum+=sum(i);
                else
                    p_fac_sum+=i;
            }
        }

        if(n>2)
        {
            if(n>9)
                p_fac_sum+=sum(n);
            else
                p_fac_sum+=n;
        }

        if(n_sum == p_fac_sum)
            System.out.println("SMITH Number");
        else
            System.out.println("NOT SMITH Number");       
    }

}