    import java.util.Scanner;

    public class replace {
        String str;
        static String substr;
        
        replace() {}

        replace(String s) {
            //Constructor to assign "s" to "str"
            str = s;
        }

        void display()
        {
            //Display Function
            System.out.println("String: " + str);
            System.out.println("Sub String: " + substr);
            System.out.println("Frequency Of Sub-String in String: " + find_frequency());
        }

        static void getword(String ss) throws Exception
        {
            //Checking if "ss" isnt blank.
            if(!ss.contains(" "))
            {
                substr = ss;
            }
            else
            {
                throw new Exception("Sub-String cannot be blank!");
            }
        }

/**
 * STEP 1: Intialize a vairable 'freq' representing frequency to 0.
 * STEP 2: Trim the String.
 * STEP 3: Split the strings words into a new array 'w' representing words using the 'str.split()' method.
 * STEP 4: For each element(word) in the array 'w'. Check if the 
 */
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

        public static void main(String[] args) throws Exception {

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
