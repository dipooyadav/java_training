package practice_question;
import java.util.Scanner;
public class leap_range {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int start_year=scn.nextInt(), end_year=scn.nextInt();
        for(int i = start_year;i<=end_year;i++){
            if(i%4==0||i%400==0){
                System.out.println(i);
            }
        }

    }
    
}
