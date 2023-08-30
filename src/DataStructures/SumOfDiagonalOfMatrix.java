package DataStructures;

public class SumOfDiagonalOfMatrix {
    public static void main(String[] args) {
        float[][] matrix = new float[4][4];
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                matrix[i][j] = (float)(Math.random() * 5);
            }
        }
        float sumOfDiagonalElements = 0;
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                System.out.print(matrix[i][j] + "\t");
                if (i == j) sumOfDiagonalElements += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("The sum of diagonal elements is:\n"+sumOfDiagonalElements);
    }
}
