package DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of random numbers Array:");
        int arraySize = input.nextInt();
        int[] randomNumbersArray = new int[arraySize];
        int arraySum = 0;
        for (int i = 0; i < randomNumbersArray.length; i++) {
            randomNumbersArray[i] = (int) (Math.random() * 101);
        }
        System.out.println(Arrays.toString(randomNumbersArray));

        //for (int j : randomNumbersArray) {
        //   arraySum = arraySum + j;
        //}

        for (int i = 0; i < randomNumbersArray.length; i++) {
            arraySum = arraySum + randomNumbersArray[i];
        }
        System.out.println("Sum of Array elements is:");
        System.out.println(arraySum);
    }
}
