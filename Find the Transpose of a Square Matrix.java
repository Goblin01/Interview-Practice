// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void transposeMatrix(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    for(int i = 0; i < rows; i++){
        for(int j = i; j< cols; j++){
            int tmp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = tmp;
        }
    }
}
