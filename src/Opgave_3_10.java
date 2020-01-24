import java.util.Scanner;
import java.util.Random;

public class Opgave_3_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int num1 = (int) (Math.random() * 1001);
        int num2 = (int) (Math.random() * 1001);

        System.out.println("What is " + num1 + " + " + num2 + " ? ");
        int answer = input.nextInt();

        if (num1 + num2 == answer){
            System.out.println("CORRECT! " + num1 + " + " + num2 + " is " + answer);
        }else {
            System.out.println("WRONG! " + num1 + " + " + num2 + " is " + (num1 + num2));
        }
    }
}
