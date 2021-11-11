import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class calculator {

    public static void calculator(){

        // Creating color schemes
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_CYAN = "\u001B[36m";

        //Let the party begin
        Scanner input = new Scanner(System.in);
        System.out.println("Hello greedy fella, so you would like to know ya age in numbers ,huh?");
        try {
            Thread.sleep(1000); // <-- Small pause
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Let me tell you your age then, shall we?");
        System.out.println("First of all I need to know your " + ANSI_CYAN + "year " + ANSI_RESET + "you were born in, makes sense right?");

        // Number for temp input buffer, rest is obvious
        int number;
        int monthOfBirth;
        int dayOfMonth;
        int year;

        do {
            System.out.print("Please enter a valid year: ");
            while (!input.hasNextInt()) {
                System.out.println(ANSI_YELLOW + "That's not a valid year, please insert 4 digits." + ANSI_RESET);
                input.next();
            }
            number = input.nextInt();
            year = number;
        } while (number <= 0);
        System.out.print("Thank you, so you were born in " + ANSI_CYAN + number + ANSI_RESET);
        if (number <= 1995) {
            System.out.println(". Already spent some time on this planet huh?");
        } else {
            System.out.println(". Pretty new to this world, you got still some time left (hopefully).");
        }

        try {
            Thread.sleep(1500); // <-- Small pause again
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        do {
            System.out.print("Now if I may ask for your " + ANSI_RED + "month" + ANSI_RESET + " of birth: ");
            while (!input.hasNextInt()) {
                System.out.println(ANSI_YELLOW + "That's not a valid month." + ANSI_RESET);
                input.next();
            }
            number = input.nextInt();
            monthOfBirth = number;

        } while (number <= 0);
        System.out.print("So you were born in " + ANSI_CYAN + month.getMonth(number) + ANSI_RESET + ". ");

        // Depending on the month some sketchy comments
        switch (number) {
            case 6, 7, 8 -> System.out.println("Ahhh, a child of summer. Full of joy and happiness. Yikes...");
            case 9, 10, 11 -> System.out.println("Born in fall, risen in youth. Hope you love dead leaves.");
            case 12, 1, 2 -> System.out.println("Winterwonderchild, born in snow. White like your guilt.");
            case 3, 4, 5 -> System.out.println("Spring break! Best time to celebrate your birthday.");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        do {
            System.out.print("So, last thing I need to know is your " + ANSI_BLUE + "day" + ANSI_RESET + " of birth: ");
            while (!input.hasNextInt()) {
                System.out.println(ANSI_YELLOW + "That's not a valid month." + ANSI_RESET);
                input.next();
            }
            number = input.nextInt();
            dayOfMonth = number;
        } while (number <= 0);

        System.out.println("Ok, you were born on the " + ANSI_BLUE + number + ANSI_RESET + " of " + ANSI_RED + month.getMonth(monthOfBirth) + ANSI_RESET + " in " + ANSI_CYAN + year + ANSI_RESET);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Let me calculate that quick for you. This service costs 5,-€ by the way. You can already bring out your credit card.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("================================================");

        // Initializing the date of today since it changes - guess what - DAILY.
        LocalDate today = LocalDate.now();
        // Initializing the birthday date
        LocalDate birthday = LocalDate.of(year, monthOfBirth, dayOfMonth);

        // Getting the period between in Years, Months and Days.
        Period p = Period.between(birthday, today);

        // Printing results of Period between today and birthday
        System.out.print("You are " + ANSI_CYAN + p.getYears() + ANSI_RESET + " years, ");
        System.out.print(ANSI_RED + p.getMonths() + ANSI_RESET + " months and ");
        System.out.print(ANSI_BLUE + p.getDays() + ANSI_RESET + " days old. You are more than welcome. Now please pay, I need food.");
        System.out.println("\n==================================================");
    }
}