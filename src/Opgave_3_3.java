import java.util.Scanner;

public class Opgave_3_3 {
    public static void main(String[] args) {


        double a, b, c, d, e, f;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c, d, e, f, g");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        double nonum = a * d - b * c;

        if (nonum == 0)
            System.out.println("The equation has no solution");
        else
            System.out.println(" x is " + x + " and y is " + y);







    }
}
