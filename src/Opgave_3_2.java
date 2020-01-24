import java.util.Random;
import java.util.Scanner;


public class Opgave_3_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int num1 = random.nextInt(10) +1;
        int num2 = random.nextInt(10) +1;
        int num3 = random.nextInt(10) +1;


        System.out.println("What is " + num1 + " + " + num2 + " + " + num3 + " ?");
        int answer = input.nextInt();

        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + answer + " is " + (num1 + num2 + num3 == answer));





    }
}
