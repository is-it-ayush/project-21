import java.util.Scanner;

public class replace {
    String str;
    static String substr;
    
    replace() {}

    replace(String s) {
        str = s;
    }

    void display()
    {
        
        System.out.println("String: " + str);
        System.out.println("Sub String: " + substr);
        System.out.println("Frequency Of Sub-String in String: " + find_frequency());
    }

    static void getword(String ss)
    {
        if(!ss.contains(" "))
        {
            substr = ss;
        }
    }

    int find_frequency()
    {
        int freq = 0;
        str = str.trim();
        String w[] = str.split(" ");

        for(int i=0;i<w.length;i++)
        {
            if(w[i].indexOf(substr)!=-1)
                freq++;
        }
        return freq;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String x = s.nextLine();
        replace rp = new replace(x);
        System.out.println("Enter a Sub-string to check: ");
        String y = s.next();
        rp.getword(y);
        rp.display();
    }
}