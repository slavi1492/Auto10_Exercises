package JavaBasic;

import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value for the first angle in degree:");
        float angle1 = input.nextFloat();
        System.out.println("Enter value for the second angle in degree:");
        float angle2 = input.nextFloat();
        System.out.println("Enter value for the third angle in degree:");
        float angle3 = input.nextFloat();
        input.close();


        if ((angle1 + angle2 + angle3) == 180) {
            String positiveStart = "It is possible to create";
            String answerEnd = "triangle with this values for the angles.";
            if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                System.out.println(positiveStart + triangleType(angle1, angle2, angle3) + " acute " + answerEnd);
            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println(positiveStart + triangleType(angle1, angle2, angle3) + " right angled " + answerEnd);
            } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
                System.out.println(positiveStart + triangleType(angle1, angle2, angle3) + " obtuse " + answerEnd);
            }
        } else {
            System.out.println("It is not possible to create a triangle with this values for the angles.");
        }
    }

    static String triangleType(float ang1, float ang2, float ang3) {
        if (ang1 == 60) {
            return " an equilateral";
        } else if (ang1 == ang2 || ang1 == ang3 || ang2 == ang3) {
            return " an isosceles";
        } else {
            return " a multifaceted";
        }

    }
}
