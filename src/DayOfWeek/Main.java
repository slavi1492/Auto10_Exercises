package DayOfWeek;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int dayOfWeek;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Input number between 1-7:");
            dayOfWeek = input.nextInt();
        }
        while (dayOfWeek > 7 || dayOfWeek < 1);

        switch (dayOfWeek) {
            case 1:
                System.out.println("It is " + dayOfWeek + "-st day of the week.");
                break;
            case 2:
                System.out.println("It is " + dayOfWeek + "-nd day of the week.");
                break;
            case 3:
                System.out.println("It is " + dayOfWeek + "-rd day of the week.");
                break;
            default:
                System.out.println("It is " + dayOfWeek + "-th day of the week.");
        }
    }
}
