package practice_question;
import java.util.Scanner;
public class pronic {
    static boolean checkPronic(int x)
    {
        for (int i = 0;
             i <= (int)(Math.sqrt(x));
             i++)

            if (x == i * (i + 1))
                return true;
         
        return false;
    }

    public static void main(String[] args)
    {
           Scanner scn = new Scanner(System.in);
           int number = scn.nextInt();
           if(checkPronic(number)){
                System.out.println("Pronic");
           }
           else System.out.println("Not pronic");

    }
}
