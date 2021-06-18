package practice_question;
import java.util.Scanner;
import java.util.Random;
public class random_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        int range = scn.nextInt();
        int random = rand.nextInt(range);
        System.out.println(random);

    }
}
