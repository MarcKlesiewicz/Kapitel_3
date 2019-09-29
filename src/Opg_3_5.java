import java.util.Scanner;
public class Opg_3_5 {
    public static void main(String[] args) {

        String today;
        String futureday;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter today's day: ");
        int day = input.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int numDays = input.nextInt();

        if (day == 0)
            today = "Sunday";
        else if (day == 1)
            today = "Monday";
        else if (day == 2)
            today = "Tuesday";
        else if (day == 3)
            today = "Wednesday";
        else if (day == 4)
            today = "Thursday";
        else if (day == 5)
            today = "Friday";
        else
            today = "Monday";

        int sumFutureDay = day + numDays;

        if (sumFutureDay == 0)
            futureday = "Sunday";
        else if (sumFutureDay == 1)
            futureday = "Monday";
        else if (sumFutureDay == 2)
            futureday = "Tuesday";
        else if (sumFutureDay == 3)
            futureday = "Wednesday";
        else if (sumFutureDay == 4)
            futureday = "Thursday";
        else if (sumFutureDay == 5)
            futureday = "Friday";
        else
            futureday = "Saturday";

        System.out.println("Today is " + today + " and the future day is " + futureday);






    }


}
