package pack;
import java.awt.*;
import java.net.URI;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome to the pricewheel!");
        Scanner sc = new Scanner(System.in);
        String userName = null;
        int playNumber;
        String priceWon = null;
        PriceWheel pw = new PriceWheel();

        do {
            System.out.print("First of all ,please tell me your name: \n");
            while (!sc.hasNext()) {
                System.out.println("Please tell me your name...");
                sc.next();
            }
            userName = sc.next();
        } while (userName == null);
        System.out.println("Thank you my friend!");

        pw.setUserName(userName);

        System.out.println("So, " + pw.getUserName() + ". You would like to play a game to win some fancy prices huh?");
        Thread.sleep(1000);
        System.out.println("To be able to win some prices you need to tell me your age first, you know... for legal reasons...");

        int age;

        do {
            System.out.print("Please, how old are you? \n");
            while (!sc.hasNextInt()) {
                System.out.println("That's not an age! Tell me your age in numbers: \n");
                sc.next();
            }
            age = sc.nextInt();
        } while (age == 0);
        System.out.println("Thank you.");
        Thread.sleep(1000);

        pw.setAge(age);
        boolean isOver18 = false;
        if (pw.getAge() >= 18) {
            isOver18 = true;
            System.out.println("Perfect, you are legally allowed to play this game! Lets go!");
        } else {
            isOver18 = false;
            System.out.println("I am sorry, you are not allowed to play this game. Come back in " + (18 - pw.getAge()) + " years to play this game!");
            System.exit(0);
        }

        Thread.sleep(1000);
        System.out.println("So, your price will be defined by an algorithm which provides you a random number.");
        Thread.sleep(1000);
        System.out.println("Let me generate a number for you!");
        System.out.println(" ----- GENERATING NUMBER -----");
        pw.generatePlayNumber();
        playNumber = pw.getPlayNumber();
        Thread.sleep(3000);

        System.out.println("So, your number is " + pw.getPlayNumber() + ". I hope you like it.");
        Thread.sleep(1000);
        System.out.println("Now lets define your price!");
        Thread.sleep(2000);
        System.out.println("LETS SEE WHAT WE GOT FOR YOU! \n" + "DRUM ROLL \n");
        Thread.sleep(4000);

        System.out.println(userName + ", you've just won a " + definePrice.definePriceWon(playNumber) + ". CONGRATULATIONS!");
        Thread.sleep(2500);

        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://media2.giphy.com/media/2gtoSIzdrSMFO/giphy.gif");
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
