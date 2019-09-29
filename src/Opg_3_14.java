import java.util.Scanner;

public class Opg_3_14 {
    public static void main(String[] args) {

        int number;
        int guess;
        number = (int) (Math.random() * 2);
        Scanner input = new Scanner(System.in);

        System.out.println("Heads or Tails? Enter 0 for head and 1 for tail");
        guess = input.nextInt();

        System.out.println("Coin spin");

        if (guess == number){
            System.out.println("Correct guess!");
        }else {
            System.out.println("Wrong guess");
        }


    }
}
