import java.util.Calendar;
import java.util.Scanner;

public class Opgave_3_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        int date = 1;

        System.out.println("Find the number of days in any month, any year");
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        System.out.println("Enter a month (e.g. 1 = Jan, 2 = Feb, 3 = Mar...: ");
        int month = input.nextInt();

        switch (month){
            case 1: month = Calendar.JANUARY; break;
            case 2: month = Calendar.FEBRUARY; break;
            case 3: month = Calendar.MARCH; break;
            case 4: month = Calendar.APRIL; break;
            case 5: month = Calendar.MAY; break;
            case 6: month = Calendar.JUNE; break;
            case 7: month = Calendar.JULY; break;
            case 8: month = Calendar.AUGUST; break;
            case 9: month = Calendar.SEPTEMBER; break;
            case 10: month = Calendar.OCTOBER; break;
            case 11: month = Calendar.NOVEMBER; break;
            case 12: month = Calendar.DECEMBER; break;
        }

        calendar.set(year,month, date);
        int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(days + " days ");


    }
}
