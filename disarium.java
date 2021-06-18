package practice_question;
import java.util.*;
public class disarium {
    public static void main(String args[])
        {
            Scanner scn = new Scanner(System.in);
            System.out.print("Input a number : ");
            int num = scn.nextInt();
            int copy = num;
            String s = Integer.toString(num);  
            int len = s.length();  
            int sum =0;
             
            while(copy>0)
            {
                int d = copy % 10;  
                sum = sum + (int)Math.pow(d,len);
                len--;
                copy = copy / 10;
            }
             
            if(sum == num)
                System.out.println("Disarium Number.");
            else
                System.out.println("Not a Disarium Number.");
        }
}
