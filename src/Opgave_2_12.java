import java.util.Scanner;

public class Opgave_2_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three-digit integer");
        int magicNum = input.nextInt();

        int num1 = (magicNum % 1000) / 100;
        int num2 = (magicNum % 100) / 10;
        int num3 = (magicNum % 10);

        if (num1 == num3){
            System.out.println(magicNum + " is a palindrome");
        }else{
            System.out.println(magicNum + " is not a palindrome");
        }
    }
}
