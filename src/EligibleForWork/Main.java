package EligibleForWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input your age:");
        byte age = input.nextByte();
        if (age >= 16){
            System.out.println("You are eligible to work.");
        }
    }
}
