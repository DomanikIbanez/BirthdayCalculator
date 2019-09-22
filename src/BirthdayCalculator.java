import java.util.*;
import java.time.*;

public class BirthdayCalculator {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Input today's date by month, day, and year.");

System.out.print("Month: ");
        int month = input.nextInt();
System.out.print("Day: ");
        int day = input.nextInt();
System.out.print("Year: ");
        int year = input.nextInt();

System.out.println("Input your birthday by month, day, and year.");

System.out.print("Month: ");
        int birthmonth = input.nextInt();
System.out.print("Day: ");
        int birthday = input.nextInt();
System.out.print("Year: ");
        int birthyear = input.nextInt();

        LocalDate birthdate = LocalDate.of(birthyear, birthmonth, birthday);
        LocalDate now = LocalDate.of(year, month, day);
        LocalDate messagebirth = LocalDate.of(0, birthmonth, birthday);
        LocalDate messagenow = LocalDate.of(0, month, day);
        Period diff = Period.between(birthdate, now);

        System.out.printf("You are %d years old.\n\n",
                diff.getYears());


if (birthmonth == month) {
    if (birthday == day) {
    }
    System.out.println("Happy Birthday!");
}


    }
}
