package practice_question;
import java.util.Scanner;
public class rangecheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ub = 1000, lb=100;
        int number = scn.nextInt();
        if(number>ub||number<lb){
            System.out.println(number+" doesn't belong to the range "+lb+" to "+ub );
        }
        else{
            System.out.println(number+" belongs to the range "+lb+" to "+ub);
        }
    }
}
