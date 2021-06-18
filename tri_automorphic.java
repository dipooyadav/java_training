package practice_question;
import java.util.Scanner;
public class tri_automorphic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println(istriautomorphic(number));
        
    }

    static String istriautomorphic(int number){
        int square = 3*number*number;
        while(number>0){
            if(number%10!=square%10){
                return "Not tri-automorphic";
            }
            number/=10;
            square/=10;
        }
        return "Tri-Automorphic";
    }
}