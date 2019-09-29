import javax.swing.*;
import java.util.Scanner;

public class Opg_3_1 {
    public static void main(String[] args) {
        System.out.println("3.1");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double root1 = (-b + Math.sqrt( Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double root2 = (-b - (Math.sqrt(Math.pow(b, 2)) - 4 * a * c)) / (2 * a);
        double discriminant = Math.pow(b, 2) * 4 * a * c;

        System.out.println("result");
        if (discriminant > 0)
            System.out.println("two root " + root1 + " and " + root2);
        else if (discriminant == 0)
            System.out.println("one root");
        else
            System.out.println("no root");
        }



    }
