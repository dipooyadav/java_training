package practice_question;
import java.util.*;
public class random_check {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        int number = scn.nextInt();
        if(number==rand.nextInt(10)){
            System.out.println("Equal to given number");
        }
        else System.out.println("Not equal to given number");
    }
}
