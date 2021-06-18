package practice_question;
import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year= scn.nextInt();
        if(year%4==0||year%400==0){
            System.out.println("Birth Year is leap year");
        }
        else System.out.println("Birth year is not leap year");
    }
}
