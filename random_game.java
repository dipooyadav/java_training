package practice_question;
import java.util.*;

public class random_game {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        int range = scn.nextInt();
        int money = 10;
        while(true){
            int guess = scn.nextInt();
            int random = rand.nextInt(range);
            if(guess==random){
                money++;
                System.out.println("Shi h "+money+" rupey ho gye");
            }
            else{
                System.out.println("galat h");
                money--;
                System.out.println(money+" rupey bache h");
            }
            if(money<=0){
                System.out.println("Paisa Khatam ghar jao");
                break;
            }
            if(money>=20){
                System.out.println("Bohot kama lia ab ghar jao");
                System.out.println("Profit: 10");
                break;
            }
        }
    }
}
