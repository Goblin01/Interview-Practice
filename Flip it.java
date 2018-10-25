// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void flipItVerticalAxis(int[][] matrix) {
    int len = matrix.length;
    int wid = matrix[0].length;
    for(int i = 0; i < len; i++){
        for(int j = 0; j < wid/2; j++){
            int tmp = matrix[i][j];
            matrix[i][j] = matrix[i][wid-1-j];
            matrix[i][wid-1-j] = tmp;
        }
    }
}
