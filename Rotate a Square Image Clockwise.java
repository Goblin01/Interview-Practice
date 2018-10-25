// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void rotateSquareImageCW(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    
    transpose(matrix);
    reverseRows(matrix);
    
}

public static void transpose(int[][] matrix){
    int rows = matrix.length;
    int cols = matrix[0].length;
    
    for(int i = 0; i < rows; i++){
        for(int j = i+1; j < cols; j++){
            int tmp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = tmp;
        }
    }
}

public static void reverseRows(int[][] matrix){
    int rows = matrix.length;
    int cols = matrix[0].length;
    for(int i = 0; i < rows; i++){
        for(int j = 0; j < cols/2; j++){
            int tmp = matrix[i][j];
            matrix[i][j] = matrix[i][cols-1-j];
            matrix[i][cols-1-j] = tmp;
        }
    }
}
