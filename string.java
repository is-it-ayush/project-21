import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=s.trim();
        s = s.toLowerCase();
        String[] w = s.split(" ");


        /**
         * Inputted String : ThE quicK BrowN FOx JuMPED
                 word_no.   4    3   2  1   0
                            d    x   n  k   e
                            e    o   w  c   h
                            p    F   o  i   T
                            m    r   u
                            u    B   Q
                            J
         */

         int counter = 0, index = w.length-1;
         while(counter!=w.length-1)
         {
            int word_pos = index;
            int word_len = w[word_pos].length()-1;

            while(word_pos!=0)
            {
                System.out.print(w[word_pos].charAt(word_len)+"\t");
                word_pos--;
                if()
            }
            System.out.println("");
            counter++;
            index--;
         }
    }
}
