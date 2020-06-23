package ua.com.operations.array;

public class MatrixOperation {

    public static void matrixArray() {
        String[][] matrix = {
                {"Junior", "Middle", "Senior"},
                {"C", "Java", "C++"},
                {"QA", "QC", "Dev"},
        };
        System.out.println();
        System.out.println();
        System.out.println("Matrix: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j].equals(matrix[j][i])) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
