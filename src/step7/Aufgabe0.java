package step7;

  /*
    Methoden:
        printMatrix -> ausgabe in 3x3
        transposeMatrix -> (i,j) -> (j,i), neues 3x3 Array!

    main():
        unser Array = int Array 3x3
        unser Array -> ausgabe
        unser Array -> transponieren -> ausgeben
    */

public class Aufgabe0 {
    public static void main(String[] args) {
        int[][] martix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Original Matrix:");
        printMatrix(martix);

        System.out.println("Transponierte Matrix:");
        printMatrix(transposeMatrix(martix));
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposition = new int[matrix.length][matrix[0].length]; // wir weisen nicht den Parameter 'matrix' zu, weil das wäre die Referenz und damit würden wir die originale Matrix manipulieren
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposition[i][j] = matrix[j][i];
            }
        }
        return transposition;
    }
}
