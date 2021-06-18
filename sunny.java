package practice_question;
import java.util.Scanner;
import java.lang.Math;
public class sunny {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int newnum= number+1;
        int temp = (int)Math.sqrt(newnum);
        if(temp*temp==newnum) System.out.println(number+" is a sunny number");
        else System.out.println("Not sunny");
        
    }
}
