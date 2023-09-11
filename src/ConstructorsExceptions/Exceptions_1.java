package ConstructorsExceptions;

import java.util.Scanner;

public class Exceptions_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        try {
            System.out.println(num1/num2);
        } catch (ArithmeticException divByZero){
            System.out.println("Division by zero");
        }
    }
}
