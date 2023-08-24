package TriangleCheck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value for the first angle in degree:");
        float angle1 = input.nextFloat();
        System.out.println("Enter value for the second angle in degree:");
        float angle2 = input.nextFloat();
        System.out.println("Enter value for the third angle in degree:");
        float angle3 = input.nextFloat();

        if ((angle1 + angle2 + angle3) == 180) {
            String positiveStart = "It is possible to create";
            String answerEnd = "triangle with this values for the angles.";
            if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                System.out.println(positiveStart + " an acute " + answerEnd);
            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println(positiveStart + " a right angled " + answerEnd);
            } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
                System.out.println(positiveStart + " an obtuse " + answerEnd);
            }
        } else {
            System.out.println("It is not possible to create a triangle with this values for the angles.");
        }
    }
}
