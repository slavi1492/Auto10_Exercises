package JavaMethods;

import java.util.Scanner;


public class Exercises {
    public static void main(String[] args) {

//        // Exercise1
//        Scanner input = new Scanner(System.in);
//        System.out.println("Exercise1\nPlease enter three numbers.\nFirst Number: ");
//        double num1 = input.nextDouble();
//        System.out.println("Second number: ");
//        double num2 = input.nextDouble();
//        System.out.println("Last number: ");
//        double num3 = input.nextDouble();
//        System.out.println("Smallest number is : " + findSmallestNumber(num1, num2, num3));

//        //Exercise 2
//        Scanner input = new Scanner(System.in);
//        System.out.println("Exercise1\nPlease enter three numbers.\nFirst Number: ");
//        double num1 = input.nextDouble();
//        System.out.println("Second number: ");
//        double num2 = input.nextDouble();
//        System.out.println("Last number: ");
//        double num3 = input.nextDouble();
//        System.out.println("The average of those numbers is: " + computeAverage(num1, num2, num3));

//        //Exercise 3
//        Scanner input = new Scanner(System.in);
//        System.out.println("Exercise3\nEnter string:");
//        String userString = input.nextLine();
//        System.out.println("Character or characters in the middle of your string are:");
//        System.out.println(findMiddleLetter(userString));

        //Execise 4



    }

    static double findSmallestNumber(double num1, double num2, double num3) {
        double smallestNumber = num1;
        if (num1 > num2) {
            if (num2 > num3) {
                smallestNumber = num3;
            } else smallestNumber = num2;
        }
        return smallestNumber;
    }

    static double computeAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static String findMiddleLetter(String userString) {
        int length = userString.length();
        String middle;
        if (length != 0){
            if (length % 2 != 0) {
                middle = userString.substring((int)(length / 2), (int)((length / 2)+1));
            } else {
                middle = userString.substring((int)((length / 2) - 1), (int)((length / 2)+1));

            }
            return middle;
        }
        return "You didn't enter any string!";

    }
}
