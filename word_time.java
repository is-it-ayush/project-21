/**
 * @author Ayush Gupta
 * Clock Program - Question 5
 * XII - F
 */

import java.util.Scanner;

public class word_time {
    static Scanner sc;
    static int h,m;

    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
    
        System.out.println("Enter Hour: ");
        h = sc.nextInt();
        System.out.println("Enter Minute: ");
        m = sc.nextInt();
        if(validate_Data())
        {
            if(m==0)
            {
                System.out.println(basic_time()+time(h)+" o'"+" Clock");
            }
            else if(m>0 && m<15)
            {
                System.out.println(basic_time()+time(m)+" minutes past " + time(h));
            }
            else if(m==15)
            {
                System.out.println(basic_time()+ "Quater"+" past " + time(h));
            }
            else if(m>15 && m<30)
            {
                System.out.println(basic_time() + time(m) + " past " + time(h));
            }
            else if(m==30)
            {
                System.out.println(basic_time() + "Half past " +  time(h));
            }
            else if(m>30 && m<45)
            {
                if(h!=12)
                    System.out.println(basic_time() + time(60-m) + " minutes to " + time(h+1));
                else
                System.out.println(basic_time() + time(60-m) + " minutes to " + time(1));
            }
            else if(m==45)
            {
                if(h!=12)
                    System.out.println(basic_time()+ "Quater"+" to " + time(h+1));
                else
                    System.out.println(basic_time()+ "Quater"+" to " + time(1));
            }
            else if(m>45)
            {
                if(h!=12)
                    System.out.println(basic_time() + time(60-m) + " minutes to " + time(h+1));
                else
                    System.out.println(basic_time() + time(60-m) + " minutes to " + time(1));
            }
        }
        else
        {
            System.out.print("Invalid Time");
        }
    }

    //Helper Method
    static String basic_time()
    {
        return h+":"+m+"\t";
    }

    //Helper Method
    static String time(int x)
    {
        String num_to_w[] = {"Zero","One", "Two", "Three", "Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty","Twenty One", "Twenty Two", "Twenty Three", "Twenty Four", "Twenty Five","Twenty Six" , "Twenty Seven" , "Twenty Eight" ,"Twenty Nine"};
        return num_to_w[x];
    }

    //Input Check
    static boolean validate_Data() {
        if(h>=0 && h<=12 && m>=0 && m<60)
            return true;
        return false;
    }
    
}

