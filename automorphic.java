package practice_question;
import java.util.Scanner;
public class automorphic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println(isautomorphic(number));
        
    }

    static String isautomorphic(int number){
        int square = number*number;
        while(number>0){
            if(number%10!=square%10){
                return "Not automorphic";
            }
            number/=10;
            square/=10;
        }
        return "Automorphic";
    }
}
