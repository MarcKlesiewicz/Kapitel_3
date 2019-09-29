import java.util.Scanner;

public class Opgave_3_35 {
    public static void main(String[] args) {

        int x;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        x = input.nextInt();

        if (x % 2 == 0)
            System.out.println(x + " is even number");
        else
            System.out.println(x + " is odd number");





    }
}
