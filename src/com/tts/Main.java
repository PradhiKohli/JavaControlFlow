package com.tts;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");

        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");     // type a word and hit enter
        String firstName = scanner.next();
        System.out.printf("Hello %s.\n", firstName);

        System.out.println("Do you want to continue? Y or N");
        Scanner cont = new Scanner(System.in);
        String answer = cont.next();

        boolean approved = answer.contains("Y") || answer.contains("y");

        if (approved) {
            System.out.println("Do you have red car? ");

            String anotherCount = cont.next();
            System.out.println("Okay");
        } else {
            cont.close();
        }
    }
}
