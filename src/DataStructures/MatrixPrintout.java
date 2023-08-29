package DataStructures;


public class MatrixPrintout {
    public static void main(String[] args) {
        int[][] newMatrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < newMatrix.length; ++i ){
            for (int j = 0; j < newMatrix[i].length; ++j){
                System.out.print(newMatrix[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
