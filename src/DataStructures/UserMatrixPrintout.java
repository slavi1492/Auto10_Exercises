package DataStructures;


import java.util.Scanner;

public class UserMatrixPrintout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input number of rows in the user matrix
        System.out.println("Enter number of rows for the matrix:");
        int rowNumber = input.nextInt();
        input.nextLine();

        //Input first row of the matrix
        //This will define number of columns
        System.out.println("Enter first row of elements separated with \",\":");
        String rowInput = input.nextLine();
        String[] row = rowInput.replaceAll(" ", "").split(",");
        int columnNumber = row.length;
        int[] firstRow = new int[columnNumber];
        for (int i = 0; i < columnNumber; ++i) {
            firstRow[i] = Integer.parseInt(row[i]);
        }

        //Defining first row of the matrix
        int[][] userMatrix = new int[rowNumber][columnNumber];
        for (int i = 0; i < columnNumber; ++i) {
            userMatrix[0][i] = firstRow[i];
        }

        //Defining the rest of the matrix
        for (int i = 1; i < rowNumber; ++i) {
            System.out.println("Enter next row of elements separated with \",\":");
            String nextRowInput = input.nextLine();
            int[] nextArrayRow = stringToIntegerParse(nextRowInput);
            for (int j = 0; j < columnNumber; ++j) {
                userMatrix[i][j] = nextArrayRow[j];
            }
        }
        for (int i = 0; i < userMatrix.length; ++i ){
            for (int j = 0; j < userMatrix[i].length; ++j){
                System.out.print(userMatrix[i][j]+"\t");
            }
            System.out.print("\n");
        }


    }

    public static int[] stringToIntegerParse(String nextRowInput) {
        String[] row = nextRowInput.replaceAll(" ", "").split(",");
        int columns = row.length;
        int[] arr = new int[columns];
        for (int i = 0; i < columns; ++i) {
            arr[i] = Integer.parseInt(row[i]);
        }
        return arr;
    }
}
