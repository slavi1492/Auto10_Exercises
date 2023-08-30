package DataStructures;

import java.util.Scanner;

public class BiggestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arrayInput = input.nextLine();
        float[] userArray = stringToFloatParse(arrayInput);

        float maxValue = 0;

        for (float i : userArray) {
            if (maxValue < i) {
                maxValue = i;
            }
        }
        System.out.println("The biggest value in your array is: "+ maxValue);


    }
    public static float[] stringToFloatParse(String arrayInput) {
        String[] row = arrayInput.split(",");
        int columns = row.length;
        float[] arr = new float[columns];
        for (int i = 0; i < columns; ++i) {
            arr[i] = Float.parseFloat(row[i].trim());
        }
        return arr;
    }
}
